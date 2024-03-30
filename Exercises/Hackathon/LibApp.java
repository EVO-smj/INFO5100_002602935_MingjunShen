public class LibApp {
    public static void main(String[] args) {
        Library preLibrary = new Library();

        Book book1 = new Book("Java Programming", "James", "Programming", "1000000001");
        Book book2 = new Book("Python Programming", "Smith", "Programming", "1000000002");
        Book book3 = new Book("Harry Potter", "JKR", "Fantasy", "1000000009");
        Book book4 = new Book("My book", "Mingjun Shen", "Fantasy", "1000000007");

        // Add books to the library
        preLibrary.addBook(book1);
        preLibrary.addBook(book2);

        // Serialize and save to file
        preLibrary.saveLibraryToFile("LibData.rar");

        // Load and deserialize the data
        Library library = Library.loadLibraryFromFile("LibData.rar");
        System.out.println("\nLoaded data.");

        // Display available books
        System.out.println("\nAvailable Books:");
        library.displayAvailableBooks().forEach(System.out::println);

        //Add new books
        library.addBook(book3);
        library.addBook(book4);

        //Remove a book
        library.removeBook(book4);

        // Display available books after adding and removing
        System.out.println("\nAvailable Books:");
        library.displayAvailableBooks().forEach(System.out::println);

        // Search for books
        System.out.println("\nSearch Results for 'java':");
        library.search("java").forEach(System.out::println);

        // Check out a book
        Book javaBook = library.search("java").get(0);
        System.out.println("\nBook info: \n" + javaBook.toString());
        library.checkoutBook(javaBook);

        // Display available books after checking out
        System.out.println("\nAvailable Books after checkout:");
        library.displayAvailableBooks().forEach(System.out::println);

        // Return a book
        library.returnBook(javaBook);

        // Displaying available books after returning
        System.out.println("\nAvailable Books after return:");
        library.displayAvailableBooks().forEach(System.out::println);
    }
}
