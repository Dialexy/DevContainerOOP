public class CounterTest {

    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        System.out.println("=== Testing Counter Implementation ===");

        // Create a single Counter object
        Counter counter1 = new Counter();

        // Test initial count
        if (counter1.getCount() == 0) {
            System.out.println("✅ PASS: Initial count is 0");
            passed++;
        } else {
            System.out.println("❌ FAIL: Initial count should be 0");
            failed++;
        }

        // Test increment()
        counter1.increment(); // should increase count by 1
        if (counter1.getCount() == 1) {
            System.out.println("✅ PASS: increment() increases count to 1");
            passed++;
        } else {
            System.out.println("❌ FAIL: increment() did not increase count correctly");
            failed++;
        }

        // Test reset()
        counter1.reset(); // should reset count to 0
        if (counter1.getCount() == 0) {
            System.out.println("✅ PASS: reset() resets count to 0");
            passed++;
        } else {
            System.out.println("❌ FAIL: reset() did not reset count correctly");
            failed++;
        }

        // Test reference behavior
        Counter counter2 = counter1; // same object reference
        counter2.increment(); // increment through counter2
        if (counter1.getCount() == 1 && counter2.getCount() == 1) {
            System.out.println("✅ PASS: Multiple references reflect changes to same object");
            passed++;
        } else {
            System.out.println("❌ FAIL: Reference behavior not working correctly");
            failed++;
        }

        // Test null assignment
        counter2 = null;
        try {
            if (counter1.getCount() == 1) {
                System.out.println("✅ PASS: Setting one reference to null does not affect the object");
                passed++;
            } else {
                System.out.println("❌ FAIL: Object affected when reference set to null");
                failed++;
            }
        } catch (Exception e) {
            System.out.println("❌ FAIL: Exception when accessing object after another reference is null");
            failed++;
        }

        // Summary
        System.out.println("\nTests completed: ✅ " + passed + " passed, ❌ " + failed + " failed.");
    }
}

