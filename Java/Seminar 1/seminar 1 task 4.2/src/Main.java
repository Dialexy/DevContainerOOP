public class Main {
  public static void main (String[] args) {

    Book book = new Book("life of Lib", "Libby Whitehead", "1029471573134", false);
    Library library = new Library();

    book.getBookInfo();
    book.checkOut();
    book.returnBook();

    library.displayLibraryStatus();
  }
}
