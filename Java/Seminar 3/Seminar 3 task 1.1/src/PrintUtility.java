
public class PrintUtility {

  public void print(int value) {
    System.out.println("Value " + value);
  }

  public void print(double value) {
    System.out.printf("%,.2f%n", value);
  }

  public void print(int[] values) {
    System.out.print("[");
    for (int i = 0; i < values.length; i++) {
      System.out.print(values[i]);
      if (i < values.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }

  public void print(String value) {
    System.out.println(value);
  }

  public void print(int a, int b) {
    System.out.printf("Ratio: %d:%d%n", a, b);
  }

  public void print(double a, double b) {
    if (a > b) {
      System.out.println("TRUE");
    }
    System.out.println("FALSE");
    }
}
