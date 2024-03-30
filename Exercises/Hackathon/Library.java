import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> search(String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getIsbn().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getGenre().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> displayAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public void checkoutBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailability(false);
            book.addTimesBorrowed();
            System.out.println("Checked out the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, the book is not available now.");
        }
    }

    public void returnBook(Book book) {
        book.setAvailability(true);
        System.out.println("Returned the book: " + book.getTitle());
    }

    // Serialization
    public void saveLibraryToFile(String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
            System.out.println("Library data saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialization
    public static Library loadLibraryFromFile(String filename) {
        Library library = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            library = (Library) inputStream.readObject();
            System.out.println("Library data loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return library;
    }
}
