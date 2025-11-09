public class LifeCycleDemoTest {

    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        System.out.println("=== Testing LifeCycleDemo Implementation ===");

        // Test 1: Create a single object and check ID and totalObjects
        LifeCycleDemo obj1 = new LifeCycleDemo();
        if (obj1.toString().contains("ID=1") && obj1.toString().contains("totalObjects=1")) {
            System.out.println("✅ PASS: First object created with correct ID and totalObjects");
            passed++;
        } else {
            System.out.println("❌ FAIL: First object ID or totalObjects incorrect");
            failed++;
        }

        // Test 2: Create additional objects
        LifeCycleDemo obj2 = new LifeCycleDemo();
        LifeCycleDemo obj3 = new LifeCycleDemo();
        if (obj2.toString().contains("ID=2") && obj3.toString().contains("ID=3")) {
            System.out.println("✅ PASS: Subsequent objects assigned sequential IDs");
            passed++;
        } else {
            System.out.println("❌ FAIL: Object IDs not sequential");
            failed++;
        }

        // Test 3: Check static totalObjects counter
        if (LifeCycleDemoTest.getTotalObjects() == 3) {  // we'll need a way to access totalObjects
            System.out.println("✅ PASS: Static counter matches number of created objects");
            passed++;
        } else {
            System.out.println("❌ FAIL: Static counter does not match number of created objects");
            failed++;
        }

        // Test 4: Test createObject() method
        LifeCycleDemo.createObject(); // creates 10 objects
        // We expect totalObjects = 13 now
        if (LifeCycleDemoTest.getTotalObjects() == 13) {
            System.out.println("✅ PASS: createObject() created 10 objects correctly");
            passed++;
        } else {
            System.out.println("❌ FAIL: createObject() did not create correct number of objects");
            failed++;
        }

        // Test 5: toString() output format
        LifeCycleDemo obj4 = new LifeCycleDemo();
        String str = obj4.toString();
        if (str.contains("ID=") && str.contains("totalObjects=")) {
            System.out.println("✅ PASS: toString() returns expected string format");
            passed++;
        } else {
            System.out.println("❌ FAIL: toString() format incorrect");
            failed++;
        }

        // Summary
        System.out.println("\nTests completed: ✅ " + passed + " passed, ❌ " + failed + " failed.");
    }

    // Helper method to access private static totalObjects
    private static int getTotalObjects() {
        try {
            java.lang.reflect.Field field = LifeCycleDemo.class.getDeclaredField("totalObjects");
            field.setAccessible(true);
            return field.getInt(null);
        } catch (Exception e) {
            System.out.println("❌ ERROR: Unable to access totalObjects: " + e);
            return -1;
        }
    }
}
