import java.util.Scanner;

public class NumberToGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a numerical score (0-100): ");
		int score = scanner.nextInt();

		if (score < 0 || score > 100) {
			System.out.println("Invalid score. Please enter a value between 0 and 100.");
		} else {
			String grade = calculateGrade(score);
			System.out.println("The letter grade is: " + grade);
		}

		scanner.close();
	}

	private static String calculateGrade(int score) {
		String grade;
		switch (score / 10) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
		}
		if (score >= 60 && score < 100) {
			int onesDigit = score % 10;
			if (onesDigit >= 7) {
				grade += "+";
			} else if (onesDigit <= 2) {
				grade += "-";
			}
		}
		return grade;
	}
}
