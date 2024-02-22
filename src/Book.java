public class Book {
    private String title;
    private String author;
    private String datePublished;
    private boolean borrowed;
    private String bookIDCode;

    //this constructor initialise all of the fields
    public Book() {
        title = author = datePublished = bookIDCode = "";
        borrowed = false;
    }

    /**
     * Complete the polymorphic constructor to set the value of the fields based on the String bookData
     * Use the method generateCode() to generate the book ID code according to the given rules
     * @param bookData stores the book title,author name,publication date
     */

    //this constructor initialises the field using csv string
    public Book(String bookData) {
        this();
        String[] data = bookData.split(",");
        if (data.length == 3){
            title = data[0];
            author = data[1];
            datePublished = data[2];
            bookIDCode = generateCode();
        } else {
            System.out.println("Incorrect number of elements in String."
                    + "You entered "
                    + data.length
                    + "correct number is 3 elements");
        }
    }

    /**
     * Complete the method to return the authors last name
     * Assume all names are in first name last name order and all names have at least two parts
     * @return the authors last name
     */

    //get last name of author by splitting full name of author
    public String getAuthorLastName() {
        String authorLastName = "";
        String[] lastName = author.split(" ");
        authorLastName = lastName[lastName.length - 1];
        return authorLastName;
    }

    /**
     * Compete the method to generate the four-character book code based on the following rules
     * The first two characters are the first and last characters of the authors last name
     * The last two characters are the last two characters of datePublished
     * @return the correct book ID code
     */
    //Generate the code using subString and CharAt
    public String generateCode() {
        String code = "";
        String authorLastName = getAuthorLastName();
        char initial = authorLastName.charAt(0);
        char finalU = authorLastName.toUpperCase().charAt(authorLastName.length() - 1);
        String lastInitial = getDatePublished().substring(2,4);
        code = initial + "" + finalU + "" + lastInitial;
        return code;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
    public boolean borrowed() {
            return borrowed;
    }

    /**
     * Complete the toString method such that it returns a String in the same format as the one below
     * CS05: Miguel de Cervantes, Don Quixote, 1605, Borrowed: FALSE
     * @return the formatted String
     */

    //display the output including relevant data
    @Override
    public String toString() {
        return bookIDCode + ": "
                + author + ", "
                + title +", "
                + datePublished +", "
                + "Borrowed: " + borrowed();
    }
}
