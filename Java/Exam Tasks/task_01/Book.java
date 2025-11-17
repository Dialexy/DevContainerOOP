public class Book {
  private final String title;
  private final String author;
  private final int pages;

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getPages() {
    return pages;
  }

  public Book (String title, String author, int pages) {
    this.title = title;
    this.author = author;
    this.pages = pages;
  }

  public void displayDetails() {
    System.out.println("Title: " + getTitle() + "Author: " + getAuthor() + "Pages: " + getPages());
  }
}

