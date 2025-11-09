public abstract class Employee {
    protected String employeeId;
    protected String name;
    protected String department;
    protected double baseSalary;

    public void transferDept(String newDept) {
      this.department = newDept;
    }

    public abstract double calculatePay();
    public abstract String getEmployeeType();
    public abstract String toString();
    //public abstract void annualReview(); I don't feel like implementing this
    //public abstract void promote(); I don't feel like implementing this either
}
