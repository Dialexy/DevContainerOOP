public class Main {
  public static void main(String[] args) {

    Rectangle rectangle = new Rectangle(5, 10);

    rectangle.isSquare();

    rectangle.scale(10);

    rectangle.scale(10, 15);

    System.out.println(rectangle.print());
  }
}
