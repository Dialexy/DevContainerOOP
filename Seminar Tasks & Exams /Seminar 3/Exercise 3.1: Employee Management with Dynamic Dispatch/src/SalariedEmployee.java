public class SalariedEmployee extends Employee {
  private double hoursWorked;
  private double salary;
  private final String employeeType = "Salaried";

  public double getHoursWorked() {
    return hoursWorked;
  }

  public double getSalary() {
    return salary;
  }

  public String getEmployeeType;

  @Override
  public double calculateSalary() {
    return getSalary();
  }

  @Override
  public String getEmployeeType() {
    return employeeType;
  }
}
