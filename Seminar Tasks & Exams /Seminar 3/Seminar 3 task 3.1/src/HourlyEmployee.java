public class HourlyEmployee extends Employee {
  private double hourlyRate;
  private double hoursWorked;
  private final String employeeType = "Hourly";

  public double getHourlyRate() {
    return hourlyRate;
  }

  public double getHoursWorked() {
    return hoursWorked;
  }

  @Override
  public double calculateSalary() {
    return getHoursWorked() * getHourlyRate();
  }

  @Override
  public String getEmployeeType() {
    return employeeType;
  }
}
