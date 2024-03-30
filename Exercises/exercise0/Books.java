public class Books {

    String title;
    int pages;
    String subtitle;
    double price;
    String author;
    String publisher;
    String language;
    boolean isSpecialVersion;

    Books(String title, String author, double price, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
        System.out.println("Book "+title+" written by "+author+ " has "+pages+" pages and sells $"+price);
    }

    public void read() {
        System.out.println("Reading the Book.");
    }

    public void open() {
        System.out.println("Opening the Book.");
    }

    public void close() {
        System.out.println("Closing the Book.");
    }
}
