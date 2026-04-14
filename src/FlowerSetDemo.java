import java.util.HashSet;
import java.util.Set;

public class FlowerSetDemo {
    public static void main(String[] args) {
        //Declare a Set variable using the Set interface
        Set<String> flowerNames = new HashSet<>();

        //add 5 element 
        flowerNames.add("Rose");
        flowerNames.add("Lily");
        flowerNames.add("Tulip");
        flowerNames.add("Sunflower");
        flowerNames.add("Jasmine");

        //Display all element
        System.out.println("Initial flowers: " + flowerNames);

        //Add one more flower name
        System.out.println("Adding new flower...");
        flowerNames.add("Daisy");
        System.out.println("After adding Daisy: " + flowerNames);

        //Try to add duplicate element 
        System.out.println("Testing duplicate...");
        flowerNames.add("Rose");

        //Display after duplicate - Set allows only unique elements
        System.out.println("After duplicate Rose : " + flowerNames);
        
        /*==================
        contains(): check if flower exists
        ==================*/
        System.out.println("Checking if Rose exists...");
        System.out.println("Rose exists: " + flowerNames.contains("Rose"));

        System.out.println("Checking if Orchid exists...");
        System.out.println("Orchid exists: " + flowerNames.contains("Orchid"));

        //remove one element  name
        System.out.println("Removing Lily...");
        flowerNames.remove("Lily");

        //Display after remove
        System.out.println("After remove Lily: " + flowerNames);
        
        /*==================
        size(): total element count
        ==================*/
        System.out.println("Total flowers: " + flowerNames.size());

        //Add one new unique flower
        System.out.println("Adding new flower...");
        flowerNames.add("Carnation");
        System.out.println("After adding Carnation: " + flowerNames);
        System.out.println("New total flowers: " + flowerNames.size());

        //clear all element
        System.out.println("Clearing all flowers...");
        flowerNames.clear();

        //Display after clear
        System.out.println("After clear: " + flowerNames);
        
        /*=================
        clear(): remove all elements
        ==================*/
        System.out.println("Final size: " + flowerNames.size());
    }
}