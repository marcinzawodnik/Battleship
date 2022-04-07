package Game;

public class Messages
{
    public static void displayIntro()
    {
        System.out.println("\n***** BATTLESHIP *****\nWelcome to the Battlefield\n");
        System.out.println("There are a 100 spots on the battlefield, with 3 enemy ships. There is 1 ship that are 5 units long and 2 ships that are 4 units long.");
        System.out.println("Your objective is to hit all the ships, with minimal possible steps.");
        System.out.println("You can quit anytime by entering 'Q' as the column. ");
        System.out.println("\n'~' : water\n'X' : hit\n");
    }

    public static void enterColumn()
    {
        System.out.print("Enter column (A to J): ");
    }

    public static void areYouSure()
    {
        System.out.print("Are you sure you want to quit? (y/n) ");
    }
    public static void continueGame()
    {
        System.out.println("Continuing");
        System.out.print("Enter column (A to J): ");
    }
    public static void quitMessage()
    {
        System.err.println("\nLater, mate!");
    }

    public static void hitWater()
    {
        System.out.println("YOU HIT WATER ~");
    }

    public static void hitEnemy()
    {
        System.out.println("You hit enemy. Very well done!");
    }
    public static void gameOver()
    {
        System.out.println();
        System.out.println("GAME OVER");
    }
    public static void printScore(int score)
    {
        System.out.print("Congratulations!!! You have destroyed all enemies in ");
        System.out.print(score);
        System.out.print(" moves.");
    }
}
