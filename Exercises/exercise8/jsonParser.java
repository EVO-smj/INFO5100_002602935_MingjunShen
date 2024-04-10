import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class jsonParser {

    public static void main(String[] args) throws IOException, ParseException {

        FileReader reader = new FileReader("./Exercises/exercise8/bookShelf.json");
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(reader);

        System.out.println("Existing Books:");
        printBooks(json);

        addBook(json, "Introduction to Python", 2024, 350, new String[]{"Guido van Rossum", "Mark Lutz"});

        System.out.println("\nAfter Addition:");
        printBooks(json);


    }

    public static void printBooks(JSONObject json) {
        JSONArray books = (JSONArray) ((JSONObject) json.get("BookShelf")).get("Book");
        for (Object obj : books) {
            JSONObject book = (JSONObject) obj;
            System.out.println("Title: " + book.get("title"));
            System.out.println("Published Year: " + book.get("publishedYear"));
            System.out.println("Number of Pages: " + book.get("numberOfPages"));

            JSONArray authors = (JSONArray) book.get("authors");
            System.out.print("Authors: ");
            for (int j = 0; j < authors.size(); j++) {
                System.out.print(authors.get(j));
                if (j < authors.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("\n");
        }
    }

    public static void addBook(JSONObject json, String title, int publishedYear, int numberOfPages, String[] authors) {
        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("publishedYear", publishedYear);
        newBook.put("numberOfPages", numberOfPages);

        JSONArray authorsArray = new JSONArray();
        for (String author : authors) {
            authorsArray.add(author);
        }
        newBook.put("authors", authorsArray);

        JSONArray books = (JSONArray) ((JSONObject) json.get("BookShelf")).get("Book");
        books.add(newBook);
    }
}
