import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListManipulation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();

		System.out.println("Enter 10 student scores (0-100):");
		for (int i = 0; i < 10; i++) {
			while (true) {
				try {
					System.out.print("Score " + (i + 1) + ": ");
					int score = Integer.parseInt(scanner.nextLine());
					if (score < 0 || score > 100) {
						System.out.println("Invalid input. Please enter a score between 0 and 100.");
						continue;
					}
					scores.add(score);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a valid integer.");
				}
			}
		}

		System.out.println("\nResults:");
		System.out.println("Average score: " + calculateAverage(scores));
		System.out.println("Highest score: " + findHighest(scores));
		System.out.println("Lowest score: " + findLowest(scores));
		System.out.println("Count of scores above average: " + countAboveAverage(scores));
		System.out.println("Sorted scores: " + sortScores(scores));

		System.out.print("\nEnter a score to search for: ");
		int searchScore = Integer.parseInt(scanner.nextLine());
		if (scores.contains(searchScore)) {
			System.out.println("Score " + searchScore + " found in the list.");
		} else {
			System.out.println("Score " + searchScore + " not found in the list.");
		}

		scanner.close();
	}

	private static double calculateAverage(ArrayList<Integer> scores) {
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return (double) sum / scores.size();
	}

	private static int findHighest(ArrayList<Integer> scores) {
		return Collections.max(scores);
	}

	private static int findLowest(ArrayList<Integer> scores) {
		return Collections.min(scores);
	}

	private static int countAboveAverage(ArrayList<Integer> scores) {
		double average = calculateAverage(scores);
		int count = 0;
		for (int score : scores) {
			if (score > average) {
				count++;
			}
		}
		return count;
	}

	private static ArrayList<Integer> sortScores(ArrayList<Integer> scores) {
		ArrayList<Integer> sortedScores = new ArrayList<>(scores);
		Collections.sort(sortedScores);
		return sortedScores;
	}
}
