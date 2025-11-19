public class ComissionEmployee extends Employee {
  private double baseSalary;
  private double comissionPercentage;
  private final String EmployeeType = "Comissioned";

  public double getBaseSalary() {
    return baseSalary;
  }

  public double getComissionPercentage() {
    return comissionPercentage;
  }

  @Override
  public double calculateSalary() {
    return getBaseSalary() * getComissionPercentage();
  }

  @Override
  public String getEmployeeType() {
    return EmployeeType;
  }
}
