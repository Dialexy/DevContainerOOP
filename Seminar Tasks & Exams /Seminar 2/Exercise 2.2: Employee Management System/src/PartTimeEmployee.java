public class PartTimeEmployee extends Employee {
   private double hoursWorked = 801.6;
   private double hourlyRate = 12.85;
   private final String employeeType = "Part time";


   public double getHoursWorked() {
    return hoursWorked;
   }

   public double getHourlyRate() {
    return hourlyRate;
   }

   public PartTimeEmployee () {}

   @Override
   public double calculatePay() {
    return  hoursWorked * hourlyRate;
   }

   @Override
   public String getEmployeeType() {
    return employeeType;
   }

   @Override
   public String toString() {
     return "PartTimeEmployee: " + name + ", ID: " + employeeId + ", Dept: " + department + ", Salary: " + calculatePay();
   }
}
