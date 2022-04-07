package Game;

public class Game
{
    public static void main(String[] args)
    {

        Messages.displayIntro();
        boolean gameover = false;
        Sea sea = new Sea();
        MoveCounter moveCounter = new MoveCounter();
        while(!gameover)
        {
//          sea.printSea(sea.getField()); // hint
            sea.printSea(sea.getDiscovered());
            Hit hit = new Hit();
            hit.getRow();
            hit.getColumn();
            moveCounter.addPoint();
            int r = hit.returnRow();
            int c = hit.returnColumn();
            sea.updateSea(r, c);
            if(sea.hitCounter.getHits() == 13)
            {
                gameover = true;
                Messages.printScore(moveCounter.getCounter());
            }
        }
        Messages.gameOver();
    }

}
