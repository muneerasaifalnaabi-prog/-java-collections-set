import java.util.HashSet;
import java.util.Set;

public class BookSetDemo {
    public static void main(String[] args) {
        Set<String> bookTitles = new HashSet<>();

        //add 5 book titles
        bookTitles.add("Clean Code");
        bookTitles.add("Head First Java");
        bookTitles.add("Effective Java");
        bookTitles.add("JavaScript: The Good Parts");
        bookTitles.add("Design Patterns");

        //Display all book titles
        System.out.println("Initial books: " + bookTitles);

        //Try to add duplicate book title
        bookTitles.add("Clean Code");

        //Display after duplicate
        System.out.println("After duplicate Clean Code: " + bookTitles);

        /*==================
        contains(): check if book exists
        ==================*/
        System.out.println("Clean Code exists: " + bookTitles.contains("Clean Code"));
        System.out.println("Python exists: " + bookTitles.contains("Python Crash Course"));

        //remove one book title
        bookTitles.remove("Head First Java");

        //Display after remove
        System.out.println("After remove Head First Java: " + bookTitles);

        /*==================
        size(): total book count
        ==================*/
        System.out.println("Total books: " + bookTitles.size());

        //clear all book titles
        bookTitles.clear();

        //Display after clear
        System.out.println("After clear: " + bookTitles);

        /*=================
        clear(): remove all books
        size(): confirm empty
        ==================*/
        System.out.println("Final size: " + bookTitles.size());
    }
}
