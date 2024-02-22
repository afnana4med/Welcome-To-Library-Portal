import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    //Array List that stores the books in the library
    private ArrayList<Book> library;


    /**
     * Complete the constructor to initialise the fields of the class
     */
    //initializing an arrayList
    public Library() {
        library = new ArrayList<>();
    }

    /**
     * Complete the method to return the number of books in the library
     *
     * @return number of books
     */

    //getting number of book available in library in integer
    public int booksInLibrary() {
        return library.size();
    }

    /**
     * Complete the method to add a new book to the library
     */

    //add book according to bookData structure
    public void addBook(String bookData) {
        library.add(new Book(bookData));
    }

    //ask user if they want to add more books
    private static boolean Continue() {
        System.out.println("Do you want to add new book to library? [y/n]");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("y");
    }

    //add new book in library
    //using while loop to prompt user to add more books
    public void addNewBook() {
        String title, author, year = "";
        Book book = new Book();
        while (Continue()) {

            // get input from the user for the new book's information
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter title");
            title = sc.nextLine();

            System.out.println("Enter author name");
            author = sc.nextLine();

            System.out.println("Enter year");
            year = sc.nextLine();


            Book newBook = new Book(title + "," + author + "," + year);

            // adding new book to the library
            library.add(newBook);
            System.out.println("Book successfully added");
        }
    }

    /**
     * Complete the method to print all the books in the library
     * @return
     */

    //printing all the books available in library
    public String printAll() {
        for (Book book : library) {
            System.out.println(book);
        }
        return null;
    }

    /**
     * Complete the method to find a book in the library based on the authors last name
     * @param lastName - last name of the author
     * @return the index of the book in the ArrayList or -1 if not found
     */

    //finding the book by author last name
    //calling a method getAuthorLastName to get last name from full name of author
    public int findBookByAuthorLastName(String lastName) {
        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            if (library.get(i).getAuthorLastName().equalsIgnoreCase(lastName)) {
                System.out.println("book found " + book.toString());
                return i;
            }
        }
        return -1; // if no book found by that last name
    }


    /**
     * Complete the method to borrow a book based on the authors last name
     * If the book is already borrowed print out
     *
     * @param lastName last name of the author
     */

    //Borrowing book from library and set borrowed to TRUE
    public void borrowBookByAuthor(String lastName) {
        int index = findBookByAuthorLastName(lastName);
        if (index >= 0) {
            library.get(index).setBorrowed(true);
        } else {
                System.out.println("There is no such book available by this author in library. Try different name");
            }
    }

    //returning the book and set borrowed to FALSE
    public void returnBook(String BookIDCode) {
        for (Book book : library) {
            if (book.generateCode().equalsIgnoreCase(BookIDCode)) {
                book.setBorrowed(false);
                System.out.println("Thank you for returning " + book.getTitle());
            }
        }
    }
}