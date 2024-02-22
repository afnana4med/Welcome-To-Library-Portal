import java.util.Scanner;

//creating a Menu class
public class Menu {


    public static void doMenu() {
        System.out.println();
        System.out.println("                WELCOME TO LIBRARY PORTAL                 ");
        Menu menu = new Menu();
        int choiceEntry;
        Library library = new Library();
        for (int i = 0; i < Books.books.length; i++) {
            library.addBook(Books.books[i]);
        }

        //Using scanner class so user can input data accordingly
        //also using while to restrict user from using option between 1-5

        do {
            Scanner scanChoice = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter \"1\", \"2\", \"3\", \"4\", \"5\" ");
            System.out.println("1. Update the book record");
            System.out.println("2. Add new book to library");
            System.out.println("3. Borrow book from library");
            System.out.println("4. Return book to library");
            System.out.println("5. Exit. Continue to teacher task");
            choiceEntry = scanChoice.nextInt();
            Scanner sc = new Scanner(System.in);

            //Using switch cases to get update books in library
            //adding new book, borrowing book and also returning book option
            //..to facilitate user to have good user experience


            switch (choiceEntry) {
                case 1:
                    library.printAll();
                    break;

                case 2:
                    library.addNewBook();
                    break;

                case 3:
                    System.out.println("Enter author last name to borrow that book: ");
                    library.borrowBookByAuthor(sc.nextLine());
                    break;

                case 4:
                    System.out.println("Enter BookID code to return: ");
                    library.returnBook(sc.nextLine());
                    break;

                case 5:
                    System.out.println("Thank you for using library portal ;)");
                    System.out.println();
            }
        } while (choiceEntry != 5);
    }
}

