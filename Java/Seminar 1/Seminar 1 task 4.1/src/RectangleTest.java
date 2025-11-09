public class RectangleTest {
    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        System.out.println("=== Testing Rectangle Implementation ===");

        // 1. Test getArea() and getPerimeter()
        Rectangle r1 = new Rectangle(5, 10);
        if (r1.getArea() == 50 && r1.getPerimeter() == 30) {
            System.out.println("✅ PASS: getArea() and getPerimeter() correct");
            passed++;
        } else {
            System.out.println("❌ FAIL: getArea() or getPerimeter() incorrect");
            failed++;
        }

        // 2. Test isSquare()
        Rectangle square = new Rectangle(5, 5);
        if (square.isSquare()) {
            System.out.println("✅ PASS: isSquare() correctly identifies square");
            passed++;
        } else {
            System.out.println("❌ FAIL: isSquare() did not identify square");
            failed++;
        }

        // 3. Test scale(double)
        Rectangle r2 = new Rectangle(2, 3);
        r2.scale(2);
        if (r2.getWidth() == 4 && r2.getHeight() == 6) {
            System.out.println("✅ PASS: scale(double) correctly scaled both dimensions");
            passed++;
        } else {
            System.out.println("❌ FAIL: scale(double) incorrect");
            failed++;
        }

        // 4. Test scale(double, double)
        Rectangle r3 = new Rectangle(3, 4);
        r3.scale(2, 3);
        if (r3.getWidth() == 6 && r3.getHeight() == 12) {
            System.out.println("✅ PASS: scale(double,double) correctly scaled dimensions separately");
            passed++;
        } else {
            System.out.println("❌ FAIL: scale(double,double) incorrect");
            failed++;
        }

        // 5. Test compareArea()
        Rectangle a = new Rectangle(5, 10); // area 50
        Rectangle b = new Rectangle(10, 10); // area 100
        Rectangle larger = Rectangle.compareArea(a, b);

        double largerArea = larger.getArea();
        if (largerArea == Math.max(a.getArea(), b.getArea())) {
            System.out.println("✅ PASS: compareArea() correctly identifies larger rectangle");
            passed++;
        } else {
            System.out.println("❌ FAIL: compareArea() returned incorrect rectangle");
            failed++;
        }

        // 6. Test print() format
        String output = r1.print();
        if (output.contains("Width") && output.contains("Height") && output.contains("Area")) {
            System.out.println("✅ PASS: print() returns formatted rectangle info");
            passed++;
        } else {
            System.out.println("❌ FAIL: print() formatting incorrect");
            failed++;
        }

        System.out.println("\nTests completed: ✅ " + passed + " passed, ❌ " + failed + " failed.");
    }
}
