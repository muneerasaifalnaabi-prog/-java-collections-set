import java.util.HashSet;
import java.util.Set;

public class CourseSetDemo {
    public static void main(String[] args) {
        Set<String> courseNames = new HashSet<>();

        //add  5 course names
        courseNames.add("Java Programming");
        courseNames.add("Python Basics");
        courseNames.add("Web Development");
        courseNames.add("Database SQL");
        courseNames.add("Data Analysis");

        //Display all course names
        System.out.println("Initial courses: " + courseNames);

        //Try to add duplicate course name
        courseNames.add("Java Programming");

        //Display after duplicate
        System.out.println("After duplicate Java: " + courseNames);
        
        /*==================
        contains(): check if course exists
        ==================*/
        System.out.println("Java exists: " + courseNames.contains("Java Programming"));
        System.out.println("AI exists: " + courseNames.contains("AI Course"));

        //remove one course name
        courseNames.remove("Python Basics");

        //Display after remove
        System.out.println("After remove Python: " + courseNames);
        
        /*==================
        size(): total course count
        ==================*/
        System.out.println("Total courses: " + courseNames.size());

        //clear all course names
        courseNames.clear();

        //Display after clear
        System.out.println("After clear: " + courseNames);
        
        /*=================
        clear(): remove all courses
        ==================*/
        System.out.println("Final size: " + courseNames.size());
    }
}