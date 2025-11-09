public class TestVehicles {
    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        System.out.println("=== TESTING VEHICLE HIERARCHY ===\n");

        // 1️⃣ Test Car
        try {
            Car car = new Car(2, 35.5);
            if (car.getPassengerAmount() == 2 && car.getFuelEfficiency() == 35.5) {
                passed++;
            } else {
                failed++;
            }
        } catch (IllegalArgumentException e) {
            failed++;
        }

        // 2️⃣ Test Truck
        try {
            Truck truck = new Truck(1500, 12.0);
            if (truck.getFuelEfficiency() == 12.0) {
                passed++;
            } else {
                failed++;
            }
        } catch (IllegalArgumentException e) {
            failed++;
        }

        // 3️⃣ Test Motorcycle
        try {
            Motorcycle moto = new Motorcycle("MOTO123", 50.0);
            if (moto.getFuelEfficiency() == 50.0) {
                passed++;
            } else {
                failed++;
            }
        } catch (IllegalArgumentException e) {
            failed++;
        }

        // 4️⃣ Test ElectricCar
        try {
            ElectricCar eCar = new ElectricCar(1, 0.0, 75.0);
            if (eCar.getPassengerAmount() == 1 && eCar.getFuelEfficiency() == 75.0
                    && eCar.getBatteryCapacity() == 75.0) {
                passed++;
            } else {
                failed++;
            }
        } catch (IllegalArgumentException e) {
            failed++;
        }

        // 5️⃣ Test validation: Car passengerAmount invalid
        try {
            Car car2 = new Car(5, 30.0);
            failed++; // should throw exception
        } catch (IllegalArgumentException e) {
            passed++;
        }

        // 6️⃣ Test validation: Truck cargo invalid
        try {
            Truck truck2 = new Truck(-10, 10.0);
            failed++; // should throw exception
        } catch (IllegalArgumentException e) {
            passed++;
        }

        // 7️⃣ Test Vehicle start/stop
        try {
            Car car3 = new Car(1, 40.0);
            car3.start();
            car3.stop();
            passed++;
        } catch (Exception e) {
            failed++;
        }

        System.out.println("\n=== TEST SUMMARY ===");
        System.out.println("Tests passed: " + passed);
        System.out.println("Tests failed: " + failed);
    }
}

