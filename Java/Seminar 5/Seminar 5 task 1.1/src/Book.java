public class Book {
  private final String author;
  private final String title;
  private double price;

  public String getAuthor() {
    return author;
  }

  public String title() {
    return title;
  }

  public double price() {
    return price;
  }

  public Book (String author, String title) {
    this.author = author;
    this.title = title;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
