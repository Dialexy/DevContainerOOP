public class Book {
  private  final String title;
  private final String author;
  private final String ISBN;
  private boolean isCheckedOut;

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getISBN() {
    return ISBN;
  }

  public boolean getIsCheckedOut() {
    return isCheckedOut;
  }

  public Book(String title, String author, String ISBN, boolean isCheckedOut) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.isCheckedOut = isCheckedOut;
  }

  public boolean checkOut() {
    if (!this.isCheckedOut) {
      this.isCheckedOut = true;
      return true;
    }
    return false;
    }

    public boolean returnBook() {
      if (this.isCheckedOut) {
        this.isCheckedOut = false;
        return true;
      }
      return false;
    }

    public String getBookInfo() {
      return "Title: " + getTitle() + ", Author: " + getAuthor() + ", ISBN: " + getISBN() + ", Available " + !getIsCheckedOut();
    }
 }
