public class EmployeeTest {
    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        System.out.println("----- Running Employee Tests -----\n");

        // === Test FullTimeEmployee ===
        try {
            FullTimeEmployee fte = new FullTimeEmployee(35000);
            double expectedPay = 35000;
            if (fte.calculatePay() == expectedPay) {
                System.out.println("FullTimeEmployee calculatePay() ✅ Passed");
                passed++;
            } else {
                System.out.println("FullTimeEmployee calculatePay() ❌ Failed");
                failed++;
            }
        } catch (Exception e) {
            System.out.println("FullTimeEmployee test threw an exception ❌: " + e.getMessage());
            failed++;
        }

        // === Test PartTimeEmployee ===
        try {
            PartTimeEmployee pte = new PartTimeEmployee();
            double expectedPay = 801.6 * 12.85;
            if (pte.calculatePay() == expectedPay) {
                System.out.println("PartTimeEmployee calculatePay() ✅ Passed");
                passed++;
            } else {
                System.out.println("PartTimeEmployee calculatePay() ❌ Failed");
                failed++;
            }
        } catch (Exception e) {
            System.out.println("PartTimeEmployee test threw an exception ❌: " + e.getMessage());
            failed++;
        }

        // === Test ContractEmployee ===
        try {
            ContractEmployee ce = new ContractEmployee(10, 500);
            double expectedPay = 10 * 500;
            if (ce.calculatePay() == expectedPay) {
                System.out.println("ContractEmployee calculatePay() ✅ Passed");
                passed++;
            } else {
                System.out.println("ContractEmployee calculatePay() ❌ Failed");
                failed++;
            }
        } catch (Exception e) {
            System.out.println("ContractEmployee test threw an exception ❌: " + e.getMessage());
            failed++;
        }

        // === Test Manager ===
        try {
            Manager mgr = new Manager(55000);
            FullTimeEmployee emp1 = new FullTimeEmployee(30000);
            PartTimeEmployee emp2 = new PartTimeEmployee();

            mgr.addMember(emp1);
            mgr.addMember(emp2);

            if (mgr.getTeamSize() == 2) {
                System.out.println("Manager addMember() ✅ Passed");
                passed++;
            } else {
                System.out.println("Manager addMember() ❌ Failed");
                failed++;
            }

            mgr.removeMember(emp2);
            if (mgr.getTeamSize() == 1) {
                System.out.println("Manager removeMember() ✅ Passed");
                passed++;
            } else {
                System.out.println("Manager removeMember() ❌ Failed");
                failed++;
            }
        } catch (Exception e) {
            System.out.println("Manager test threw an exception ❌: " + e.getMessage());
            failed++;
        }

        // === Department transfer test (from Employee) ===
        try {
            FullTimeEmployee fte = new FullTimeEmployee(40000);
            fte.transferDept("Finance");

            if ("Finance".equals(fte.department)) {
                System.out.println("Employee transferDept() ✅ Passed");
                passed++;
            } else {
                System.out.println("Employee transferDept() ❌ Failed");
                failed++;
            }
        } catch (Exception e) {
            System.out.println("Employee transferDept() threw an exception ❌: " + e.getMessage());
            failed++;
        }

        // === Summary ===
        System.out.println("\n----- TEST SUMMARY -----");
        System.out.println("✅ Passed: " + passed);
        System.out.println("❌ Failed: " + failed);
        System.out.println("-------------------------");
    }
}
