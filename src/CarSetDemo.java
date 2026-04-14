import java.util.HashSet;
import java.util.Set;

public class CarSetDemo {
    public static void main(String[] args) {
        //Declare a Set variable using the Set interface
        Set<String> carNames = new HashSet<>();

        //add 5 element 
        carNames.add("Toyota");
        carNames.add("Honda");
        carNames.add("BMW");
        carNames.add("Audi");
        carNames.add("Nissan");

        //Display all element
        System.out.println("Initial cars: " + carNames);

        //Add one more car name
        carNames.add("Mercedes");
        System.out.println("After adding Mercedes: " + carNames);

        //Try to add duplicate element 
        carNames.add("Toyota");

        //Display after duplicate - Set allows only unique elements
        System.out.println("After duplicate Toyota : " + carNames);
        
        /*==================
        contains(): check if car exists
        ==================*/
        System.out.println("Toyota exists: " + carNames.contains("Toyota"));
        System.out.println("Ford exists: " + carNames.contains("Ford"));

        //remove one element  name
        carNames.remove("Honda");

        //Display after remove
        System.out.println("After remove Honda: " + carNames);
        
        /*==================
        size(): total element count
        ==================*/
        System.out.println("Total cars: " + carNames.size());

        //Add one new unique car
        carNames.add("Hyundai");
        System.out.println("After adding Hyundai: " + carNames);
        System.out.println("New total cars: " + carNames.size());

        //clear all element
        carNames.clear();

        //Display after clear
        System.out.println("After clear: " + carNames);
        
        /*=================
        clear(): remove all elements
        ==================*/
        System.out.println("Final size: " + carNames.size());
    }
}