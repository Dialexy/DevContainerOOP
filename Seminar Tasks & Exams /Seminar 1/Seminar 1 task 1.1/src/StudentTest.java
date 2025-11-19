public class StudentTest {

    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        // Create 3 students
        Student s1 = new Student("Alice", 1001, 20, 3.8); // Honor student, can graduate
        Student s2 = new Student("Bob", 1002, 21, 2.5);   // Not honor, can graduate
        Student s3 = new Student("Charlie", 1003, 22, 1.5); // Not honor, cannot graduate

        // Test displayInfo()
        System.out.println("Testing displayInfo():");
        try {
            s1.displayInfo();
            s2.displayInfo();
            s3.displayInfo();
            System.out.println("✅ PASS: displayInfo() ran without error\n");
            passed++;
        } catch (Exception e) {
            System.out.println("❌ FAIL: displayInfo() threw an exception");
            failed++;
        }

        // Test isHonorStudent()
        System.out.println("Testing isHonorStudent():");
        if (s1.isHonorStudent()) {
            System.out.println("✅ PASS: s1 is honor student");
            passed++;
        } else {
            System.out.println("❌ FAIL: s1 should be honor student");
            failed++;
        }

        if (!s2.isHonorStudent()) {
            System.out.println("✅ PASS: s2 is not honor student");
            passed++;
        } else {
            System.out.println("❌ FAIL: s2 should not be honor student");
            failed++;
        }

        if (!s3.isHonorStudent()) {
            System.out.println("✅ PASS: s3 is not honor student");
            passed++;
        } else {
            System.out.println("❌ FAIL: s3 should not be honor student");
            failed++;
        }

        // Test canGraduate()
        System.out.println("\nTesting canGraduate():");
        if (s1.canGraduate()) {
            System.out.println("✅ PASS: s1 can graduate");
            passed++;
        } else {
            System.out.println("❌ FAIL: s1 should be able to graduate");
            failed++;
        }

        if (s2.canGraduate()) {
            System.out.println("✅ PASS: s2 can graduate");
            passed++;
        } else {
            System.out.println("❌ FAIL: s2 should be able to graduate");
            failed++;
        }

        if (!s3.canGraduate()) {
            System.out.println("✅ PASS: s3 cannot graduate");
            passed++;
        } else {
            System.out.println("❌ FAIL: s3 should not be able to graduate");
            failed++;
        }

        // Summary
        System.out.println("\nTests completed: ✅ " + passed + " passed, ❌ " + failed + " failed.");
    }
}
