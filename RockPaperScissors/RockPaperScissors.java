import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // This is a simple Rock, Paper, Scissors game.
        // The user will play against the computer.
        // The computer will randomly choose rock, paper, or scissors.
        // The user will input their choice.
        // The winner will be determined based on the rules of the game.
        String[] Compchoices = {"rock", "paper", "scissors"};
        System.out.println("Welcome to Rock, Paper, Scissors!");
        String agian = "y";
        while(agian.equals("y")){
            System.out.println("Enter your choice: rock, paper, or scissors");
            Scanner scanner = new Scanner(System.in);
            Random ran = new Random();


            String UserChoice = scanner.nextLine().toLowerCase();
            if (!UserChoice.equals("rock") && !UserChoice.equals("paper") && !UserChoice.equals("scissors")){
                System.out.println("try entering rock, paper, or scissors");
            }
            

            String CompChoice = Compchoices[ran.nextInt(0,2)];
            System.out.println("Computers choice: " + CompChoice);
            if (UserChoice.equals(CompChoice)){
                System.out.println("You draw!");
            } 
            //Covers each of the player scenario
            else if (UserChoice.equals("rock") && CompChoice.equals("scissors") || (UserChoice.equals("paper") && CompChoice.equals("rock") || (UserChoice.equals("scissors") && CompChoice.equals("paper")))){
                System.out.println("You win!");
            }
            else {
                System.out.println("You Lose!");
            }
            System.out.println("Want to play again? (y/n)");
            agian = scanner.next().toLowerCase();
        }
    }
    
}
