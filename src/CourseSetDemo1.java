import java.util.HashSet;
import java.util.Set;

public class CourseSetDemo1 {
    public static void main(String[] args) {
        //use Set Interface
        Set<String> courseNames = new HashSet<>();

        //add 5 element 
        courseNames.add("Java");
        courseNames.add("Python");
        courseNames.add("Database");
        courseNames.add("Networking");
        courseNames.add("Web Design");

        //Display all element
        System.out.println("Initial courses: " + courseNames);

        //Add one more course name
        courseNames.add("Machine Learning");
        System.out.println("After adding Machine Learning: " + courseNames);

        //Try to add duplicate element 
        courseNames.add("Java");

        //Display after duplicate - Set allows only unique elements
        System.out.println("After duplicate Java : " + courseNames);
        
        /*==================
        contains(): check if course exists
        ==================*/
        System.out.println("Java exists: " + courseNames.contains("Java"));
        System.out.println("C++ exists: " + courseNames.contains("C++"));

        //remove one element  name
        courseNames.remove("Python");

        //Display after remove
        System.out.println("After remove Python: " + courseNames);
        
        /*==================
        size(): total element count
        ==================*/
        System.out.println("Total courses: " + courseNames.size());

        //Add one new unique course
        courseNames.add("Data Science");
        System.out.println("After adding Data Science: " + courseNames);
        System.out.println("New total courses: " + courseNames.size());

        //clear all element
        courseNames.clear();

        //Display after clear
        System.out.println("After clear: " + courseNames);
        
        /*=================
        clear(): remove all elements
        ==================*/
        System.out.println("Final size: " + courseNames.size());
    }
}