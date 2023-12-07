import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        boolean playAgain = true;

        while (playAgain) {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;

            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Total: " + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("Craps! You lose!");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("Natural! You win!");
            } else {
                System.out.println("Point is set to " + crapsRoll);
                boolean continueRolling = true;

                while (continueRolling) {
                    int newRoll = rnd.nextInt(6) + 1 + rnd.nextInt(6) + 1;
                    System.out.println("Rolling again...");
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Total: " + newRoll);

                    if (newRoll == crapsRoll) {
                        System.out.println("Made the point! You win!");
                        continueRolling = false;
                    } else if (newRoll == 7) {
                        System.out.println("Got a seven and lost!");
                        continueRolling = false;
                    } else {
                        System.out.println("Trying for the point...");
                    }
                }
            }

            System.out.print("Do you want to play again? (y/n): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("y");
        }

        System.out.println("Thanks for playing Craps!");
        scanner.close();
    }
}

