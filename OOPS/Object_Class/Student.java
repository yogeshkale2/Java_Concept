// 1. THE CLASS (The Blueprint)
class Book {

    // Attributes
    String title;
    String author;
    boolean isAvailable;

    // 2. THE CONSTRUCTOR (The setup process)
    public Book(String title, String author) {
        this.title = title;
        this.author = author;

        // A brand-new book added to the library is always available first!
        this.isAvailable = true;
    }

    // 3. A METHOD (What the object can do)
    public void borrowBook() {
        if (this.isAvailable == true) {
            // Update the status so no one else can take it
            this.isAvailable = false;
            System.out.println("You have borrowed: " + this.title);
        } else {
            // This runs if isAvailable is already false
            System.out.println("Sorry, '" + this.title + "' is currently checked out.");
        }
    }
}

// 4. THE MAIN PROGRAM (Where we use the blueprint)
public class Student {
    public static void main(String[] args) {

        // Creating the Book object
        Book myBook = new Book("The Hobbit", "J.R.R. Tolkien");

        // Action 1: Borrowing the book for the first time
        System.out.println("Attempt 1:");
        myBook.borrowBook();

        // Action 2: Trying to borrow the exact same book again
        System.out.println("\nAttempt 2:");
        myBook.borrowBook();
    }
}