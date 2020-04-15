//Import Scanner so I can get user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//set up the wins/losses
        int wins = 0;
        int losses = 0;
        //Set up Scanner
        Scanner scan = new Scanner(System.in);
        //Prompt to get String so I can start the game
        System.out.println("Would you like to play a game? Choose 'Y' to play and 'N' to exit");
        //Collecting the yes/no answer
        String player = scan.nextLine();
// use boolean so i can make it a true false
        boolean inGame = player.equals("y");
// get in game
        while(inGame) {
//prompt game to start
            System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors. choose 'z' to exit");
//formatting
            System.out.println("Players Choice:");
//get players choice
            String input = scan.nextLine();
// tab
            System.out.println("\t");
//wins or losses
            System.out.println("Wins: " + wins +" Losses: " + losses);
            //Generate random number then multiply by 100 so it's between 1-100
            int choice = (int) Math.random() * 100;
            //Use if/elseif/elseif/else so that I have something for every occurrence
            //Only explained the first one because I repeated the code
            if (input.equals("r")) {
                //If the int choice was in the first 1/3 it was scissors
                if (choice <= 33) {
                    System.out.println("You Win!");
                    System.out.println("Computer Choice: Scissors     Player Choice: Rock");
                    wins++;
                }
                //If it was between 34 and 68, it was Paper
                else if (choice >= 67) {
                    System.out.println("You Lose!");
                    System.out.println("Computer Choice: Paper     Player Choice: Rock");
                    losses++;
                }
                //and since all that remained was Rock, and numbers above 67, I used an else statement
                else {
                    System.out.println("Draw!");
                    System.out.println("Computer Choice: Rock     Player Choice: Rock");
                }
            }
            //repeat but this time user input was paper
            else if (input.equals("p")) {
                if (choice <= 33) {
                    System.out.println("You Lose!");
                    System.out.println("Computer Choice: Scissors     Player Choice: Paper");
                    losses++;
                } else if (choice >= 67) {
                    System.out.println("Draw!");
                    System.out.println("Computer Choice: Paper     Player Choice: Paper");
                } else {
                    System.out.println("You Win!");
                    System.out.println("Computer Choice: Rock     Player Choice: Paper");
                    wins++;
                }
            }
            //repeat but it was scissors This Time
            else if (input.equals("s")) {
                if (choice <= 33) {
                    System.out.println("Draw!");
                    System.out.println("Computer Choice: Scissors     Player Choice: Scissors");
                } else if (choice >= 67) {
                    System.out.println("You Win!");
                    System.out.println("Computer Choice: Paper     Player Choice: Scissors");
                    wins++;
                } else {
                    System.out.println("You Lose!");
                    System.out.println("Computer Choice: Rock     Player Choice: Scissors");
                    losses++;
                }
            }
            //For if they exit
            else if (input.equals("x")){
                System.out.println("thank you for playing");
                break;
            }
            //if they choose an invalid character
            else{
                System.out.println("Invalid selection please play again.");
            }
            System.out.println("\t");
        }

    }
}

