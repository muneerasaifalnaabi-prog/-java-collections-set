import java.util.HashSet;
import java.util.Set;

public class AnimalSetDemo {
    public static void main(String[] args) {
        //Declare a Set variable using the Set interface
        Set<String> animalNames = new HashSet<>();

        //add 5 element 
        animalNames.add("Lion");
        animalNames.add("Tiger");
        animalNames.add("Elephant");
        animalNames.add("Giraffe");
        animalNames.add("Zebra");

        //Display all element
        System.out.println("Initial animals: " + animalNames);

        //Add one more animal name
        System.out.println("Adding new animal...");
        animalNames.add("Monkey");
        System.out.println("After adding Monkey: " + animalNames);

        //Try to add duplicate element 
        System.out.println("Testing duplicate...");
        animalNames.add("Lion");

        //Display after duplicate - Set allows only unique elements
        System.out.println("After duplicate Lion : " + animalNames);
        
        /*==================
        contains(): check if animal exists
        ==================*/
        System.out.println("Checking if Lion exists...");
        System.out.println("Lion exists: " + animalNames.contains("Lion"));

        System.out.println("Checking if Bear exists...");
        System.out.println("Bear exists: " + animalNames.contains("Bear"));

        //remove one element  name
        System.out.println("Removing Tiger...");
        animalNames.remove("Tiger");

        //Display after remove
        System.out.println("After remove Tiger: " + animalNames);
        
        /*==================
        size(): total element count
        ==================*/
        System.out.println("Total animals: " + animalNames.size());

        //Add one new unique animal
        System.out.println("Adding new animal...");
        animalNames.add("Panda");
        System.out.println("After adding Panda: " + animalNames);
        System.out.println("New total animals: " + animalNames.size());

        //clear all element
        System.out.println("Clearing all animals...");
        animalNames.clear();

        //Display after clear
        System.out.println("After clear: " + animalNames);
        
        /*=================
        clear(): remove all elements
        ==================*/
        System.out.println("Final size: " + animalNames.size());
    }
}