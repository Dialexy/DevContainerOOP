public class FreelanceEmployee extends Employee {
  private int projectsDone;
 private final String employeeType = "freelance";

 public int getProjectsDone() {
  return projectsDone;
 }

 @Override
 public double calculateSalary() {
  return 3000.0 * projectsDone;
 }

 @Override
 public String getEmployeeType() {
  return employeeType;
 }
}
