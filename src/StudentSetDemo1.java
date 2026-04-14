import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo1 {
    public static void main(String[] args) {
        Set<String> studentNames = new HashSet<>();

        //add 5 element 
        studentNames.add("Aya");
        studentNames.add("hala");
        studentNames.add("sara");
        studentNames.add("malak");
        studentNames.add("muna");

        //Display all element
        System.out.println("Initial students: " + studentNames);

        //Try to add duplicate element 
        studentNames.add("muna");

        //Display after duplicate
        System.out.println("After duplicate : " + studentNames);
        
        /*==================
        contains(): check if student exists
        ==================*/
        System.out.println("malak exists: " + studentNames.contains("malak"));
        System.out.println("ahmed  exists: " + studentNames.contains("ahmed"));

        //remove one element  name
        studentNames.remove("sara");

        //Display after remove
        System.out.println("After remove sara: " + studentNames);
        
        /*==================
        size(): total element count
        ==================*/
        System.out.println("Total students: " + studentNames.size());

        //clear all element
        studentNames.clear();

        //Display after clear
        System.out.println("After clear: " + studentNames);
        
        /*=================
        clear(): remove all elements
        ==================*/
        System.out.println("Final size: " + studentNames.size());
    }
}