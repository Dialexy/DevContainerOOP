public class TestVehicle {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {

        // Create components
        Engine engine = new Engine("V6 Engine");
        Transmission transmission = new CVTTransmission();

        // Create vehicle
        Vehicle car = new Car("Toyota", "Camry", engine, transmission);

        // TEST 1: Make
        test("Make should be Toyota",
             "Toyota".equals(car.getMake()));

        // TEST 2: Model
        test("Model should be Camry",
             "Camry".equals(car.getModel()));

        // TEST 3: Transmission type
        test("Transmission should be CVT",
             "CVT".equals(car.getTransmission().getTransmissionType()));

        // TEST 4: Setting and getting color
        car.setColor("Red");
        test("Color should be Red",
             "Red".equals(car.getColor()));

        // TEST 5: Setting and getting price
        car.setPrice(25000.0);
        test("Price should be 25000.0",
             car.getPrice() == 25000.0);

        // TEST 6: Engine display (just callable)
        try {
            car.getEngine().displayInfo();
            test("Engine displayInfo() should run without error", true);
        } catch (Exception e) {
            test("Engine displayInfo() should run without error", false);
        }

        // Summary
        System.out.println("---------");
        System.out.println("TEST SUMMARY:");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("---------");
    }

    private static void test(String testName, boolean condition) {
        if (condition) {
            passed++;
            System.out.println("PASS: " + testName);
        } else {
            failed++;
            System.out.println("FAIL: " + testName);
        }
    }
}
