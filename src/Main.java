import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Casino!");
        String rollAgain = "";
        int count = 1;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("How many faces will your dice have?");
            int diceFaces = scan.nextInt();
            System.out.println("Great! You have selected " +diceFaces+ " faced dice.");

            int die1 = (int)(Math.random()* diceFaces);
            int die2 = (int)(Math.random()* diceFaces);

            int rollCount = count ++;
            System.out.println("Roll: " + rollCount);
            System.out.println(die1);
            System.out.println(die2);

            System.out.print("Roll again? (y/n): ");

            rollAgain = scan.next();
        }
        while (rollAgain.equals("y"));
    }
}