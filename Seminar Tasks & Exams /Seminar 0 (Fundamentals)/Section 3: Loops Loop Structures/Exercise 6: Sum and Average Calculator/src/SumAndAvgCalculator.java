import java.util.Scanner;

public class SumAndAvgCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;

		System.out.println("Enter numbers (enter -1 to stop):");

		while (true) {
			int number = scanner.nextInt();

			if (number == -1) {
				break;
			}

			sum += number;
			count++;

			if (number > largest) {
				largest = number;
			}

			if (number < smallest) {
				smallest = number;
			}
		}

		if (count > 0) {
			double average = (double) sum / count;
			System.out.println("Sum: " + sum);
			System.out.println("Average: " + average);
			System.out.println("Count: " + count);
			System.out.println("Largest: " + largest);
			System.out.println("Smallest: " + smallest);
		} else {
			System.out.println("No numbers were entered.");
		}

		scanner.close();
	}
}

