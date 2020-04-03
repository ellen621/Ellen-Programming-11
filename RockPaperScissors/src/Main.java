//Import Scanner so I can get user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Set up Scanner
        Scanner scan = new Scanner(System.in);
        //Prompt to get String
        System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors");
        //Collecting the input
        String input = scan.nextLine();
        //Generate random number then multiply by 100 so it's between 1-100
        int choice = (int)Math.random()*100;
        //Use if/elseif/elseif/else so that I have something for every occurrence
        //Only explained the first one because I repeated the code
        if (input.equals("r")){
            //If the int choice was in the first 1/3 it was scissors
            if (choice <= 33) {
                System.out.println("You Win!");
                System.out.println("Computer Choice: Scissors     Player Choice: Rock");
            }
            //If it was between 34 and 68, it was Paper
            else if (choice >= 67) {
                System.out.println("You Lose!");
                System.out.println("Computer Choice: Paper     Player Choice: Rock");
            }
            //and since all that remained was Rock, and numbers above 67, I used an else statement
            else{
                System.out.println("Draw!");
                System.out.println("Computer Choice: Rock     Player Choice: Rock");
            }
        }
        //repeat but this time user input was paper
        else if (input.equals("p")){
            if (choice <= 33) {
                System.out.println("You Lose!");
                System.out.println("Computer Choice: Scissors     Player Choice: Paper");
            }
            else if (choice >= 67) {
                System.out.println("Draw!");
                System.out.println("Computer Choice: Paper     Player Choice: Paper");
            }
            else{
                System.out.println("You Win!");
                System.out.println("Computer Choice: Rock     Player Choice: Paper");
            }
        }
        //repeat but it was scissors This Time
        else if (input.equals("s")){
            if (choice <= 33) {
                System.out.println("Draw!");
                System.out.println("Computer Choice: Scissors     Player Choice: Scissors");
            }
            else if (choice >= 67) {
                System.out.println("You Win!");
                System.out.println("Computer Choice: Paper     Player Choice: Scissors");
            }
            else{
                System.out.println("You Lose!");
                System.out.println("Computer Choice: Rock     Player Choice: Scissors");
            }
        }
        //In the occurrence that they put in an invalid letter/string/integer, I had an else statement
        else{
            System.out.println("Invalid selection please play again.");
        }

    }
}

