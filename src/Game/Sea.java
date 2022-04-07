package Game;

import java.util.Random;

public class Sea
{
    static final int SHIP1 = 5;
    static final int SHIP2 = 4;
    static final char COLUMNS[] = {'A', 'B', 'C','D','E','F','G','H','I','J'};

    private char field[][] = new char[10][10];
    private char discovered[][] = new char[10][10];
    static Random rand = new Random();
    HitCounter hitCounter = new HitCounter();

    public char[][] getField()
    {
        return this.field;
    }
    public char[][] getDiscovered()
    {
        return this.discovered;
    }
    public void assignWater()
{
    for(int x = 0; x < 10; x++)
    {
        for(int y = 0; y < 10; y++)
        {
            this.field[x][y] = '~';
        }
    }
}
public boolean isRow(){
    return rand.nextInt(2) == 0;
}
public int chooseRowOrColumnNr(){
    return rand.nextInt(10);
}
public boolean isPossibleSetShipInThisRow(int rowNr, int startPos, int ship)
{
    boolean flag = true;
    for(int i = startPos; i < startPos + ship; i++)
    {
        if (this.field[rowNr][i] != '~')
        {
            flag = false;
            break;
        }
    }
    return flag;
}
public boolean isPossibleSetShipInThisColumn(int columnNr, int startPos, int ship)
{
    boolean flag = true;
    for (int i = startPos; i < startPos + ship; i++)
    {
        if (field[i][columnNr] != '~')
        {
            flag = false;
            break;
        }
    }
    return flag;
}

public char[][] setShip(char[][] field, int ship) {
    boolean isShipSet = false;
    int maxTry = 1000;
    while (!isShipSet && maxTry > 0) {
        int nr = chooseRowOrColumnNr();
        int startPos = rand.nextInt(10 - ship);
        boolean row = isRow();
        if (row && isPossibleSetShipInThisRow(nr, startPos, ship))
        {
            for (int i = startPos; i < startPos + ship; i++) {
                field[nr][i] = '0';
            }
            isShipSet = true;
        } else if (!row && isPossibleSetShipInThisColumn(nr, startPos, ship))
        {
            for (int i = startPos; i < startPos + ship; i++) {
                field[i][nr] = '0';
            }
            isShipSet = true;
        } else
            maxTry--;
    }
    return field;
}

public Sea()
{
    assignWater();
    setShip(this.field, SHIP1);
    setShip(this.field,SHIP2);
    setShip(this.field, SHIP2);
}

public void printSea(char[][] sea)
{
    System.out.print("   ");
    for(int i = 0; i<10; i++)
    {
        System.out.print(COLUMNS[i] + " ");
    }
    System.out.println();
    for(int i = 0; i<10; i++){
        System.out.print(i+1);
        if(i<9)
        {
            System.out.print("  ");
        }
        if(i==9)
        {
            System.out.print(" ");
        }
        for(int j = 0;j<10;j++)
        {

            System.out.print(sea[i][j] + " ");
        }

        System.out.println();
    }

}
public void updateSea(int row, int column)
{
    if(this.field[row][column] == '~')
    {
        this.discovered[row][column] = '~';
        Messages.hitWater();
    }

    else if(this.field[row][column] == '0')
    {
        this.discovered[row][column] = '*';
        this.field[row][column] = '*';
        this.hitCounter.addHit();
        Messages.hitEnemy();
    }
    else
        System.out.println("You've already shot that field!!!");

}

}
