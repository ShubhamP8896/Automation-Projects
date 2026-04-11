package day_17_Constructors;

public class A004 {
    // Fields
    private String title;
    private String author;
    private double price;

    // Constructor with no parameters
    public A004() {
        this("Unknown Title", "Unknown Author", 0.0);
    }

    // Constructor with two parameters
    public A004(String title, String author) {
        this(title, author, 50.50);  // Calls the 3-parameter constructor
    }

    // Constructor with three parameters
    public A004(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Different ways to create Book objects
    	A004 book1 = new A004();
    	A004 book2 = new A004("Java Programming", "James Gosling");
    	A004 book3 = new A004("Clean Code", "Robert C. Martin", 45.99);

        // Display info
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}