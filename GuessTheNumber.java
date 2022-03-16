import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        int numberToGuess = rnd.nextInt(100);
        int guess;
        int triesLeft = 5;

        do {
            System.out.print("You have " + triesLeft + " to guess it correctly. Your guess: ");
            guess = input.nextInt();

            if (guess < 0 || guess > 100) {
                System.out.print("It can only be between 0 and 100. ");
            } else {
                if (guess > numberToGuess) {
                    System.out.println("It's lower than " + guess);
                    triesLeft--;
                } else if (guess < numberToGuess) {
                    System.out.println("It's higher than " + guess);
                    triesLeft--;
                }
            }
        } while (guess != numberToGuess && triesLeft > 0);


        if (numberToGuess != guess) {
            System.out.println("Game Over.");
        } else {
            System.out.println("Congratulations! It was " + numberToGuess + "!");
        }

	}

}
