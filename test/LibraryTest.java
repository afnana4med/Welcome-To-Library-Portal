import junit.framework.TestCase;

public class LibraryTest extends TestCase {

    public void testBooksInLibrary() {
        Library library = new Library();
        for (int i = 0; i < Books.books.length; i++) {
            library.addBook(Books.books[i]);
        }
        System.out.printf("Books in library: %d%n", library.booksInLibrary());
    }


    public void testPrintAll() {
        Library library = new Library();
        for (int i = 0; i < Books.books.length; i++) {
            library.addBook(Books.books[i]);
        }
        library.printAll();
    }

    public void testFindBookByAuthorLastName() {
        Library library = new Library();
        for (int i = 0; i < Books.books.length; i++) {
            library.addBook(Books.books[i]);
        }
        library.findBookByAuthorLastName("Stoker");
    }

    public void testBorrowBookByAuthor() {
        Library library = new Library();
        for (int i = 0; i < Books.books.length; i++) {
            library.addBook(Books.books[i]);
        }
        library.borrowBookByAuthor("Stoker");
    }

}