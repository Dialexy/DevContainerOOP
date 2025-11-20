import java.util.Scanner;

public class PatternPrint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the patterns: ");
		int size = scanner.nextInt();

		System.out.println("Pattern A (Right Triangle):");
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Pattern B (Number Triangle):");
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();
	}
}
