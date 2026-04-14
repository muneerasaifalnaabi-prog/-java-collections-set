import java.util.HashSet;
import java.util.Set;

public class FruitSetDemo {
    public static void main(String[] args) {
        //Declare a Set variable using the Set interface
        Set<String> fruitNames = new HashSet<>();

        //add 5 element 
        fruitNames.add("Apple");
        fruitNames.add("Banana");
        fruitNames.add("Mango");
        fruitNames.add("Orange");
        fruitNames.add("Grape");

        //Display all element
        System.out.println("Initial fruits: " + fruitNames);

        //Add one more fruit name
        System.out.println("Adding new fruit...");
        fruitNames.add("Pineapple");
        System.out.println("After adding Pineapple: " + fruitNames);

        //Try to add duplicate element 
        System.out.println("Testing duplicate...");
        fruitNames.add("Apple");

        //Display after duplicate - Set allows only unique elements
        System.out.println("After duplicate Apple : " + fruitNames);
        
        /*==================
        contains(): check if fruit exists
        ==================*/
        System.out.println("Checking if Apple exists...");
        System.out.println("Apple exists: " + fruitNames.contains("Apple"));

        System.out.println("Checking if Strawberry exists...");
        System.out.println("Strawberry exists: " + fruitNames.contains("Strawberry"));

        //remove one element  name
        System.out.println("Removing Banana...");
        fruitNames.remove("Banana");

        //Display after remove
        System.out.println("After remove Banana: " + fruitNames);
        
        /*==================
        size(): total element count
        ==================*/
        System.out.println("Total fruits: " + fruitNames.size());

        //Add one new unique fruit
        System.out.println("Adding new fruit...");
        fruitNames.add("Watermelon");
        System.out.println("After adding Watermelon: " + fruitNames);
        System.out.println("New total fruits: " + fruitNames.size());

        //clear all element
        System.out.println("Clearing all fruits...");
        fruitNames.clear();

        //Display after clear
        System.out.println("After clear: " + fruitNames);
        
        /*=================
        clear(): remove all elements
        ==================*/
        System.out.println("Final size: " + fruitNames.size());
        System.out.println("Set now contains zero elements");
    }
}