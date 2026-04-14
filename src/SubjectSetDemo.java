import java.util.HashSet;
import java.util.Set;

public class SubjectSetDemo {
    public static void main(String[] args) {
        //Use set interface
        Set<String> subjectNames = new HashSet<>();

        //add 5 element 
        subjectNames.add("Math");
        subjectNames.add("Science");
        subjectNames.add("English");
        subjectNames.add("History");
        subjectNames.add("Computer");

        //Display all element
        System.out.println("Initial subjects: " + subjectNames);

        //Add one more subject name
        subjectNames.add("Physics");
        System.out.println("After adding Physics: " + subjectNames);

        //Try to add duplicate element 
        subjectNames.add("Math");

        //Display after duplicate - Set allows only unique elements
        System.out.println("After duplicate Math : " + subjectNames);
        
        /*==================
        contains(): check if subject exists
        ==================*/
        System.out.println("Math exists: " + subjectNames.contains("Math"));
        System.out.println("Music exists: " + subjectNames.contains("Music"));

        //remove one element  name
        subjectNames.remove("Science");

        //Display after remove
        System.out.println("After remove Science: " + subjectNames);
        
        /*==================
        size(): total element count
        ==================*/
        System.out.println("Total subjects: " + subjectNames.size());

        //Add one new unique subject
        subjectNames.add("Chemistry");
        System.out.println("After adding Chemistry: " + subjectNames);
        System.out.println("New total subjects: " + subjectNames.size());

        //clear all element
        subjectNames.clear();

        //Display after clear
        System.out.println("After clear: " + subjectNames);
        
        /*=================
        clear(): remove all elements
        ==================*/
        System.out.println("Final size: " + subjectNames.size());
    }
}