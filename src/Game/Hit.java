package Game;

import java.util.Scanner;

public class Hit
{
    static Scanner scanner = new Scanner(System.in);
    private int row;
    private int column;

    public int getRow()
    {
        int rowTemp = 0;
        while(rowTemp < 1 || rowTemp > 10)
        {
            System.out.println();
            System.out.print("Enter row (1 to 10): ");
            rowTemp = scanner.nextInt();
            this.row = rowTemp - 1;
        }
        return this.row;
    }
    public int getColumn()
    {
        char columnTemp = 'K';
        while(columnTemp < 'A' || columnTemp > 'J' || columnTemp == 'Q' || columnTemp == 'S'){
            Messages.enterColumn();
            char columnAlph = scanner.next().charAt(0);
            columnTemp = Character.toUpperCase(columnAlph);
            if(columnTemp == 'Q'){
                Messages.areYouSure();
                char quit = scanner.next().charAt(0);
                if(quit == 'y' || quit == 'Y'){
                    Messages.quitMessage();
                    System.exit(0);
                }else{
                    Messages.continueGame();
                    columnAlph = scanner.next().charAt(0);
                    columnTemp = Character.toUpperCase(columnAlph);
                }
            }
            this.column = (columnTemp - 65);
        }
        return this.column;
    }

    public Hit()
    {
        this.row = row;
        this.column = column;
    }
    public int returnRow()
    {
        return this.row;
    }
    public int returnColumn()
    {
        return this.column;
    }


}
