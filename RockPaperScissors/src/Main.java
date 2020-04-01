import java.util.Scanner;
//for a tie put Draw! for a win put You Win! for loss put You Lose! and then put computer choice: choice player choice.
// for invalid put invalid selection please play again.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors");
        String input = scan.nextLine();
        int choice = (int)Math.random()*100;
        if (input == "r"){
            if (choice <= 33) {
                System.out.println("You Win!");
                System.out.println("Computer Choice: Scissors     Player Choice: Rock");
            }
            else if (choice >= 67) {
                System.out.println("You Lose!");
                System.out.println("Computer Choice: Paper     Player Choice: Rock");
            }
            else{
                System.out.println("Draw!");
                System.out.println("Computer Choice: Rock     Player Choice: Rock");
            }
        }
        else if (input == "p"){
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
        else if (input== "s"){
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
        else{
            System.out.println("Invalid selection please play again.");
        }

    }
}