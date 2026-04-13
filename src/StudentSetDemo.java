import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {
    public static void main(String[] args) {
        Set<String> studentNames = new HashSet<>();

        //add  5 student names
        studentNames.add("Ahmed");
        studentNames.add("Fatima");
        studentNames.add("Omar");
        studentNames.add("Aisha");
        studentNames.add("Khalid");

        //Display all student names
        System.out.println("Initial students: " + studentNames);

        //Try to add duplicate student name
        studentNames.add("Omar");

        //Display after duplicate
        System.out.println("After duplicate Omar: " + studentNames);
        
        /*==================
        contains(): check if student exists
        ==================*/
        System.out.println("Omar exists: " + studentNames.contains("Omar"));
        System.out.println("Zain exists: " + studentNames.contains("Zain"));

        //remove one student name
        studentNames.remove("Fatima");

        //Display after remove
        System.out.println("After remove Fatima: " + studentNames);
        
        /*==================
        size(): total student count
        ==================*/
        System.out.println("Total students: " + studentNames.size());

        //clear all student names
        studentNames.clear();

        //Display after clear
        System.out.println("After clear: " + studentNames);
        
        /*==================
        clear(): remove everything
        ==================*/
        System.out.println("Final size: " + studentNames.size());
    }
}