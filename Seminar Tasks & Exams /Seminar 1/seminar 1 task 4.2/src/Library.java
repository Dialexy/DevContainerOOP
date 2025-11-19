import java.util.ArrayList;

public class Library {
  private final ArrayList<Book> books;

  public Library() {
    books = new ArrayList<>();
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public Book findBook(String ISBN) {
    for (Book book : books) {
      if (book.getISBN().equals(ISBN)) {
        return book;
      }
    }
    return null;
  }

   public boolean checkOutBook(String ISBN) {
      Book book = findBook(ISBN);
      if (book != null) {
        return book.checkOut();
      }
      else {
        System.out.println("Book: " + ISBN + " could not be found");
        return false;
      }
    }

    public boolean returnBook(String ISBN) {
      Book book = findBook(ISBN);
      if (book != null) {
        return book.returnBook();
      }
      else {
        System.out.println("Book: " + ISBN + " could not be found");
        return false;
      }
    }

    public ArrayList<Book> getAvailableBooks() {
      ArrayList<Book> available = new ArrayList<>();
      for (Book book : books) {
        if (!book.getIsCheckedOut()) {
          available.add(book);
        }
      }
      return available;
    }

    public void displayLibraryStatus() {
     for (Book book : books) {
       System.out.println(book.getBookInfo());
    }
  }

}
