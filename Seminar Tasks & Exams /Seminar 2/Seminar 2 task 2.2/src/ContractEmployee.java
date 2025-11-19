public class ContractEmployee extends Employee {
  private int projectsDone;
  private double projectCommission;
  private final String employeeType = "Contract";

  public int getProjectsDone() {
    return projectsDone;
  }

  public double getProjectCommission() {
    return projectCommission;
  }

  public ContractEmployee(int projectsDone, double projectCommission) {
    this.projectsDone = projectsDone;
    this.projectCommission = projectCommission;
  }

  @Override
  public double calculatePay() {
    return projectsDone * projectCommission;
  }

  @Override
  public String getEmployeeType() {
    return employeeType;
  }

  @Override
  public String toString() {
     return "ContractEmployee: " + name + ", ID: " + employeeId + ", Dept: " + department + ", Salary: " + calculatePay();
  }
}
