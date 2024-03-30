import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private boolean availability;
    private int timesBorrowed;

    public Book(String title, String author, String genre, String isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.availability = true;
        this.timesBorrowed = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getTimesBorrowed() {
        return timesBorrowed;
    }

    public void addTimesBorrowed() {
        this.timesBorrowed++;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Genre: " + genre + ", ISBN: " + isbn + ", Available: " + availability + ", BorrowedTimes: " + timesBorrowed;
    }
}
