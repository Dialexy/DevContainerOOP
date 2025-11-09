public class ShapeCalculator {

  // Area
  public double calculateArea(double radius) {
    return radius * radius * Math.PI;
  }

  public double calculateArea(double width, double height) {
    return width * height;
  }

  public double calculateArea(float base, float height) {
    return base * height;
  }

  public double calculateArea(float sideLength) {
    return sideLength * sideLength;
  }

  //perimeter
}
