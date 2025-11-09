public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String print() {
      return String.format("Rectangle[ Width = %.2f, Height = %.2f, Perimeter = %.2f, Area = %.2f ]",
        this.width, this.height, getPerimeter(), getArea());
    }

    public static Rectangle compareArea(Rectangle r1, Rectangle r2) {
      if (r1.getArea() > r2.getArea()) {
        return r1;
      }
      else {
        return r2;
      }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public boolean isSquare() {
      return this.width == this.height;
    }

    public void scale(double factor) {
      this.width *= factor;
      this.height *= factor;
    }

    public void scale(double seperateFactorWidth, double seperateFactorHeight) {
      this.width  *= seperateFactorWidth;
      this.height *= seperateFactorHeight;
    }
}
