public class RectangleTypeCasting {
    private int length;
    private int width;

    public int getLength()  {
        return length;
    }

    public void setLength(int newLength) {
        length = newLength;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public RectangleTypeCasting(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}
