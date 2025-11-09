public class Student {

  private String name;
  private int studentID;
  private int age;
  private double gpa;

  public Student (String name, int studentID, int age, double gpa) {
    this.name = name;
    this.studentID = studentID;
    this.age = age;
    this.gpa = gpa;
  }

  public void displayInfo() {
    System.out.println("Student name: " + getName());
    System.out.println("Student ID: " + getStudentID());
    System.out.println("Age: " + getAge());
    System.out.println("gpa " + getGpa());
  }

  public String getName() {
    return name;
  }

  public int getStudentID() {
    return studentID;
  }

  public int getAge() {
    return age;
  }

  public double getGpa() {
    return gpa;
  }

  public boolean isHonorStudent() {
    return gpa > 3.5;
   }

  public boolean canGraduate() {
    return gpa > 2.0;
   }
 }
