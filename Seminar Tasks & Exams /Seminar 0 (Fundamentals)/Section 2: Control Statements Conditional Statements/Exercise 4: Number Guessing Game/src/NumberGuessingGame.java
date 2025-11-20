import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean playAgain = true;

		System.out.println("Welcome to the Number Guessing Game!");

		while (playAgain) {
			int targetNumber = random.nextInt(100) + 1;
			int attempts = 0;
			boolean guessedCorrectly = false;

			System.out.println("I have selected a number between 1 and 100. Try to guess it!");

			while (!guessedCorrectly) {
				System.out.print("Enter your guess: ");
				int userGuess = scanner.nextInt();
				attempts++;

				if (userGuess < targetNumber) {
					System.out.println("Too low! Try again.");
				} else if (userGuess > targetNumber) {
					System.out.println("Too high! Try again.");
				} else {
					System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
					guessedCorrectly = true;
				}
			}

			System.out.print("Do you want to play again? (yes/no): ");
			String response = scanner.next().toLowerCase();
			playAgain = response.equals("yes");
		}

		System.out.println("Thank you for playing! Goodbye.");
		scanner.close();
	}
}
