public abstract class Employee {
  protected String name;
  protected String ID;
  protected String department;

  public void generatePayslip() {
    System.out.println("The salary for " + getEmployeeType() + " is " + calculateSalary());
  }

  public abstract double calculateSalary();
  public abstract String getEmployeeType();
}
