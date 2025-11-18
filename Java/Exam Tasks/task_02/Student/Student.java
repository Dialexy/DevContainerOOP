public class Student {
    private String studentId;
    private String name;
    private int grade;
    private boolean isPassing;

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public boolean isPassing() {
        return isPassing;
    }

    public Student(String studentId, String name, int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.isPassing = grade >= 50;
    }

    public void setGrade(int newGrade) {
        if (newGrade < 0 || newGrade > 100) {
            System.out.println("Error: Grade must be between 0 and 100.");
            return;
        }
        this.grade = newGrade;
        this.isPassing = newGrade >= 50;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Passing: " + isPassing);
    }
}
