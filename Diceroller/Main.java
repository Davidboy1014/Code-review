import java.util.Random;
import java.util.Scanner;



public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random ran = new Random();
        int num_of_Dice;
        int total = 0;

        System.out.println("Enter number of dice we will roll");
        num_of_Dice = scan.nextInt();

        if (num_of_Dice > 0){
            for (int i = 0; i < num_of_Dice; i++){
                int roll = ran.nextInt(1,7);
                printDie(roll);
                System.out.println("you rolled: " + roll);
                total = total + roll;
            }
            System.out.println("Total: " + total);
        }else{
            System.out.println("number of dice must be greater than 0");
        }


        scan.close();

    }

    static void printDie(int roll){
         String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                 """;
        String dice2 = """
                 -------
                |   ●   |
                |       |
                |   ●   |
                 -------
                 """;
        String dice3 = """
                 -------
                |   ●   |
                |   ●   |
                |   ●   |
                 -------
                 """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                 """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                 """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                 """;
        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }
}

