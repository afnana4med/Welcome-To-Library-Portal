
public class Main {
    public static void main(String[] args) {
        //accessing method of Menu Class
        Menu.doMenu();

        //creating an instance of class Library
        Library library = new Library();

        //counter loop to getting size of library and updating size
        for (int i = 0; i < Books.books.length; i++) {
            library.addBook(Books.books[i]);
        }
        System.out.printf("Books in library: %d%n", library.booksInLibrary());
        library.printAll();
        library.findBookByAuthorLastName("Stoker");
        library.borrowBookByAuthor("Stoker");
        System.out.println();
        library.printAll();
        library.borrowBookByAuthor("Stoker");
    }
}
