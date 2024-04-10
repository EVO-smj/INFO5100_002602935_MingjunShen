import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileWriter;
import java.io.IOException;

public class XMLParser {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document xml = builder.parse("./Exercises/exercise8/bookShelf.xml");

        System.out.println("Existing Books:");
        printBooks(xml);

        addBook(xml, "Introduction to Python", "2024", "350", new String[]{"Guido van Rossum", "Mark Lutz"});

        System.out.println("\nAfter Addition:");
        printBooks(xml);

    }

    public static void printBooks(Document doc) {
        NodeList bookList = doc.getElementsByTagName("Book");
        for (int i = 0; i < bookList.getLength(); i++) {
            Element bookElement = (Element) bookList.item(i);
            String title = bookElement.getElementsByTagName("title").item(0).getTextContent();
            String publishedYear = bookElement.getElementsByTagName("publishedYear").item(0).getTextContent();
            String numberOfPages = bookElement.getElementsByTagName("numberOfPages").item(0).getTextContent();
            String authors = "";
            NodeList authorList = bookElement.getElementsByTagName("author");
            for (int j = 0; j < authorList.getLength(); j++) {
                authors += authorList.item(j).getTextContent();
                if (j < authorList.getLength() - 1) {
                    authors += ", ";
                }
            }
            System.out.println("Title: " + title);
            System.out.println("Published Year: " + publishedYear);
            System.out.println("Number of Pages: " + numberOfPages);
            System.out.println("Authors: " + authors);
            System.out.println();
        }
    }

    public static void addBook(Document doc, String title, String publishedYear, String numberOfPages, String[] authors) {
        Element bookShelf = doc.getDocumentElement();
        Element newBook = doc.createElement("Book");

        Element titleElement = doc.createElement("title");
        titleElement.appendChild(doc.createTextNode(title));
        newBook.appendChild(titleElement);

        Element yearElement = doc.createElement("publishedYear");
        yearElement.appendChild(doc.createTextNode(publishedYear));
        newBook.appendChild(yearElement);

        Element pagesElement = doc.createElement("numberOfPages");
        pagesElement.appendChild(doc.createTextNode(numberOfPages));
        newBook.appendChild(pagesElement);

        for (String author : authors) {
            Element authorElement = doc.createElement("author");
            authorElement.appendChild(doc.createTextNode(author));
            newBook.appendChild(authorElement);
        }

        bookShelf.appendChild(newBook);
    }

}
