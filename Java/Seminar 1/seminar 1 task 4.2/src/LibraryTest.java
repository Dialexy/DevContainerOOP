public class LibraryTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Library Implementation ===");

        int pass = 0;
        int fail = 0;

        // --- Create books ---
        Book book1 = new Book("Life of Lib", "Libby Whitehead", "1029471573134", false);
        Book book2 = new Book("Java 101", "John Doe", "1029471573135", false);
        Book book3 = new Book("Algorithms", "Jane Smith", "1029471573136", false);

        // --- Test Book getBookInfo ---
        String info1 = book1.getBookInfo();
        if (info1.contains("Life of Lib") && info1.contains("Libby Whitehead")) pass++; else fail++;

        // --- Test checkOut and returnBook ---
        if (book1.checkOut()) pass++; else fail++;
        if (!book1.checkOut()) pass++; else fail++; // already checked out
        if (book1.returnBook()) pass++; else fail++;
        if (!book1.returnBook()) pass++; else fail++; // already returned

        // --- Create library and add books ---
        Library lib = new Library();
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        // --- Test findBook ---
        if (lib.findBook("1029471573134") == book1) pass++; else fail++;
        if (lib.findBook("999999999") == null) pass++; else fail++;

        // --- Test checkOutBook in Library ---
        if (lib.checkOutBook("1029471573135")) pass++; else fail++;
        if (!lib.checkOutBook("1029471573135")) pass++; else fail++; // already checked out
        if (!lib.checkOutBook("999999999")) pass++; else fail++; // non-existent ISBN

        // --- Test returnBook in Library ---
        if (lib.returnBook("1029471573135")) pass++; else fail++;
        if (!lib.returnBook("1029471573135")) pass++; else fail++; // already returned
        if (!lib.returnBook("999999999")) pass++; else fail++; // non-existent ISBN

        // --- Test getAvailableBooks ---
        book1.checkOut();
        var available = lib.getAvailableBooks();
        if (available.contains(book2) && available.contains(book3) && !available.contains(book1)) pass++; else fail++;

        // --- Test displayLibraryStatus (just prints, can't auto-test) ---
        System.out.println("\nLibrary Status:");
        lib.displayLibraryStatus();
        pass++; // Count as pass since this is visual

        // --- Summary ---
        System.out.println("\nTests completed: " + pass + " passed, " + fail + " failed.");
    }
}

