import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagment {
	static class Student {
		int id;
		String name;
		ArrayList<Double> scores;

		Student(int id, String name) {
			this.id = id;
			this.name = name;
			this.scores = new ArrayList<>();
		}
	}

	static ArrayList<Student> students = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean running = true;
		while (running) {
			displayMenu();
			int choice = getValidChoice();
			switch (choice) {
				case 1:
					addNewStudent();
					break;
				case 2:
					enterScores();
					break;
				case 3:
					calculateStudentAverage();
					break;
				case 4:
					displayClassStatistics();
					break;
				case 5:
					findTopPerformer();
					break;
				case 6:
					running = false;
					System.out.println("Exiting program...");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
		scanner.close();
	}

	static void displayMenu() {
		System.out.println("\n=== Student Management System ===");
		System.out.println("1. Add new student");
		System.out.println("2. Enter scores for existing student");
		System.out.println("3. Calculate student average");
		System.out.println("4. Display class statistics");
		System.out.println("5. Find top performer");
		System.out.println("6. Exit program");
		System.out.print("Enter your choice: ");
	}

	static int getValidChoice() {
		while (!scanner.hasNextInt()) {
			System.out.print("Invalid input. Enter a number: ");
			scanner.next();
		}
		return scanner.nextInt();
	}

	static void addNewStudent() {
		System.out.print("Enter student ID: ");
		int id = getValidChoice();

		if (findStudentById(id) != null) {
			System.out.println("Error: Student ID already exists!");
			return;
		}

		scanner.nextLine();
		System.out.print("Enter student name: ");
		String name = scanner.nextLine();

		students.add(new Student(id, name));
		System.out.println("Student added successfully!");
	}

	static void enterScores() {
		System.out.print("Enter student ID: ");
		int id = getValidChoice();
		Student student = findStudentById(id);

		if (student == null) {
			System.out.println("Error: Student not found!");
			return;
		}

		System.out.print("Enter score (0-100): ");
		double score = getValidScore();
		student.scores.add(score);
		System.out.println("Score added successfully!");
	}

	static double getValidScore() {
		double score;
		while (true) {
			while (!scanner.hasNextDouble()) {
				System.out.print("Invalid input. Enter a number (0-100): ");
				scanner.next();
			}
			score = scanner.nextDouble();
			if (score >= 0 && score <= 100) {
				break;
			}
			System.out.print("Score must be between 0 and 100. Try again: ");
		}
		return score;
	}

	static void calculateStudentAverage() {
		System.out.print("Enter student ID: ");
		int id = getValidChoice();
		Student student = findStudentById(id);

		if (student == null) {
			System.out.println("Error: Student not found!");
			return;
		}

		if (student.scores.isEmpty()) {
			System.out.println("No scores available for this student.");
			return;
		}

		double average = getStudentAverage(student);
		System.out.printf("Average for %s (ID: %d): %.2f\n", student.name, student.id, average);
	}

	static void displayClassStatistics() {
		if (students.isEmpty()) {
			System.out.println("No students in the system.");
			return;
		}

		double classTotal = 0;
		int totalScores = 0;
		int failing = 0;
		int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;

		for (Student student : students) {
			if (!student.scores.isEmpty()) {
				double avg = getStudentAverage(student);
				classTotal += avg;
				totalScores++;

				if (avg < 60) failing++;
				if (avg >= 90) gradeA++;
				else if (avg >= 80) gradeB++;
				else if (avg >= 70) gradeC++;
				else if (avg >= 60) gradeD++;
				else gradeF++;
			}
		}

		if (totalScores == 0) {
			System.out.println("No scores available for any student.");
			return;
		}

		System.out.println("\n=== Class Statistics ===");
		System.out.printf("Class Average: %.2f\n", classTotal / totalScores);
		System.out.printf("Students Failing (avg < 60): %d\n", failing);
		System.out.println("\nGrade Distribution:");
		System.out.printf("A (90-100): %d\n", gradeA);
		System.out.printf("B (80-89): %d\n", gradeB);
		System.out.printf("C (70-79): %d\n", gradeC);
		System.out.printf("D (60-69): %d\n", gradeD);
		System.out.printf("F (0-59): %d\n", gradeF);
	}

	static void findTopPerformer() {
		if (students.isEmpty()) {
			System.out.println("No students in the system.");
			return;
		}

		Student topStudent = null;
		double topAverage = -1;

		for (Student student : students) {
			if (!student.scores.isEmpty()) {
				double avg = getStudentAverage(student);
				if (avg > topAverage) {
					topAverage = avg;
					topStudent = student;
				}
			}
		}

		if (topStudent == null) {
			System.out.println("No scores available for any student.");
			return;
		}

		System.out.printf("Top Performer: %s (ID: %d) with average: %.2f\n",
				topStudent.name, topStudent.id, topAverage);
	}

	static Student findStudentById(int id) {
		for (Student student : students) {
			if (student.id == id) {
				return student;
			}
		}
		return null;
	}

	static double getStudentAverage(Student student) {
		double sum = 0;
		for (double score : student.scores) {
			sum += score;
		}
		return sum / student.scores.size();
	}
}
