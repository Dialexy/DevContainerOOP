public class TestSystemController {

    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        try {
            // Test 1: Singleton instance consistency
            ConfigurationManager c1 = ConfigurationManager.instanceOf();
            ConfigurationManager c2 = ConfigurationManager.instanceOf();
            if (c1 == c2) {
                System.out.println("PASS: Singleton instance is consistent across calls.");
                passed++;
            } else {
                System.out.println("FAIL: Singleton instance is not consistent.");
                failed++;
            }

            // Test 2: Setting and retrieving a configuration
            c1.setConfig("maxThreads", "8");
            String result = c2.getConfig("maxThreads");
            if ("8".equals(result)) {
                System.out.println("PASS: ConfigurationManager correctly stores and retrieves data.");
                passed++;
            } else {
                System.out.println("FAIL: ConfigurationManager did not return the expected value.");
                failed++;
            }

            // Test 3: Service uses shared ConfigurationManager
            Service s1 = new Service("Authentication");
            Service s2 = new Service("Payment");

            s1.updateConfiguration("timeout", "3000");
            String sharedResult = s2.readConfiguration("timeout"); // s2 should see s1’s update
            if (c1.getConfig("timeout") != null) {
                System.out.println("PASS: Services share ConfigurationManager instance.");
                passed++;
            } else {
                System.out.println("FAIL: Services do not share the same ConfigurationManager state.");
                failed++;
            }

            // Test 4: SystemController aggregation and update simulation
            java.util.ArrayList<Service> serviceList = new java.util.ArrayList<>();
            serviceList.add(s1);
            serviceList.add(s2);

            SystemController controller = new SystemController(serviceList);

            int initialSize = controller.getServices().size();
            controller.addService(new Service("Logging"));

            if (controller.getServices().size() == initialSize + 1) {
                System.out.println("PASS: SystemController successfully adds a new service.");
                passed++;
            } else {
                System.out.println("FAIL: SystemController failed to add a new service.");
                failed++;
            }

            // Test 5: Singleton shared update reflection
            controller.simulateUpdate();
            String reflectedValue = c1.getConfig("maxConnections");
            if ("200".equals(reflectedValue)) {
                System.out.println("PASS: Singleton configuration correctly reflected across all services.");
                passed++;
            } else {
                System.out.println("FAIL: Singleton configuration not reflected correctly across services.");
                failed++;
            }

        } catch (Exception e) {
            System.out.println("FAIL: Exception during testing: " + e.getMessage());
            failed++;
        }

        System.out.println("---------");
        System.out.println("TEST SUMMARY:");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("---------");
    }
}
