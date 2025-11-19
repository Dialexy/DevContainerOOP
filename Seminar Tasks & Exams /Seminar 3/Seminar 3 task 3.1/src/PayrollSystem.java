import java.util.*;

public class PayrollSystem {
  private final List<Employee> employees = new ArrayList<>();

  public void addEmployee(Employee e) {
    employees.add(e);
  }

  public void processPayroll() {
    for (Employee e : employees) {
      System.out.println("Pay for " + e.getEmployeeType() + ": \n" + "£" + e.calculateSalary() + "\n");
    }
  }

  public double calculateTotalPayroll() {
    double total = 0;
    for (Employee e : employees) {
      total += e.calculateSalary();
    }
    return total;
  }

  public void generateReportByType() {
    Map<String, List<Employee>> grouped = new HashMap<>();
    for (Employee e : employees) {
      String type = e.getEmployeeType();
      grouped.putIfAbsent(type, new ArrayList<>());
      grouped.get(type).add(e);
    }

    System.out.println("\n==== Employee Report by Type ====");
    for (String type : grouped.keySet()) {
      System.out.println("Type: " + type);
      for (Employee e : grouped.get(type)) {
        System.out.println("  - " + e.name + " (£" + e.calculateSalary() + ")");
      }
    }
  }
}
