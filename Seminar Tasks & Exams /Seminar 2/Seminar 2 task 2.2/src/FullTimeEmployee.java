public class FullTimeEmployee extends Employee {
  private double salary = 35000;
  private final String employeeType = "Full Time";

  public FullTimeEmployee(double salary) {
    this.salary = salary;
  }

  public void benefits() {
    System.out.println("As a full time employee, you are elegible for an extra week of vacation");
  }

  @Override
  public double calculatePay() {
    return salary;
  }

  @Override
  public String getEmployeeType() {
    return employeeType;
  }

  @Override
  public String toString() {
     return "FullTimeEmployee: " + name + ", ID: " + employeeId + ", Dept: " + department + ", Salary: " + calculatePay();
  }
}
