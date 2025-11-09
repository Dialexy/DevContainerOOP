//public class TestPersonSummary {
//    public static void main(String[] args) {
//        int passed = 0;
//        int failed = 0;
//
//        System.out.println("=== TESTING PERSON CLASS ===\n");
//
//        // 1️⃣ Valid Person
//        try {
//            Person p1 = new Person("Majdi Jagidar", 22, "MajdiJagidar.24@ucl.ac.uk", "582716350");
//            // If we reach here, test passed
//            passed++;
//            System.out.println("✅ Valid Person test passed.");
//        } catch (IllegalArgumentException e) {
//            failed++;
//            System.out.println("❌ Valid Person test failed: " + e.getMessage());
//        }
//
//        // 2️⃣ Invalid name
//        try {
//            Person p2 = new Person("", 25, "valid@example.com", "123456789");
//            failed++; // No exception means failure
//        } catch (IllegalArgumentException e) {
//            passed++;
//        }
//
//        // 3️⃣ Invalid age
//        try {
//            Person p3 = new Person("John Doe", 200, "valid@example.com", "123456789");
//            failed++;
//        } catch (IllegalArgumentException e) {
//            passed++;
//        }
//
//        // 4️⃣ Invalid email
//        try {
//            Person p4 = new Person("John Doe", 30, "invalidEmail.com", "123456789");
//            failed++;
//        } catch (IllegalArgumentException e) {
//            passed++;
//        }
//
//        // 5️⃣ Invalid SSN (not 9 digits)
//        try {
//            Person p5 = new Person("Jane Doe", 40, "jane.doe@uni.ac.uk", "1234");
//            failed++;
//        } catch (IllegalArgumentException e) {
//            passed++;
//        }
//
//        // 6️⃣ Masked SSN check
//        try {
//            Person p6 = new Person("Alice Smith", 30, "alice@uni.ac.uk", "987654321");
//            if (p6.getMaskedSSN().equals("*****4321")) {
//                passed++;
//            } else {
//                failed++;
//            }
//        } catch (IllegalArgumentException e) {
//            failed++;
//        }
//
//        // Print summary
//        System.out.println("\n=== TEST SUMMARY ===");
//        System.out.println("Tests passed: " + passed);
//        System.out.println("Tests failed: " + failed);
//    }
//}
//
