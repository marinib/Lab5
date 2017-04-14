import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // starts with a printout/prompt that will only be displayed once
        // initializing a few variables which need to be declared only once)
        // TODO: place math.random methods in their own class

        System.out.println("Welcome to the Casino!");
        String rollAgain = "";
        int rollCount = 1;

        // start of the do/while loop (will be later transferred into its own class)
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("How many faces will your dice have?");
            int diceFaces = scan.nextInt();
            System.out.println("Great! You have selected " +diceFaces+ " faced dice.");

            int die1 = (int)(Math.random()* diceFaces+1); // random for die1 (updated to compensate for multiplying by 0)
            int die2 = (int)(Math.random()* diceFaces+1); // random for die2 (updated for same reason)

            // this is where "Roll: (number)" begins and printed out
            System.out.println("Roll: " + rollCount++); // simplified and condensed
            System.out.println(die1);
            System.out.println(die2);

            System.out.print("Roll again? (y/n): ");

            rollAgain = scan.next();
        }
        // end of while loop and starts loop again if answer is "y"
        while (rollAgain.equals("y"));
    }
}