import java.util.HashSet;
import java.util.Set;

public class ProductSetDemo1 {
    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();

        //add 5 element
        productNames.add("iPhone 15");
        productNames.add("MacBook ");
        productNames.add("AirPods");
        productNames.add("iPad Air");
        productNames.add("Apple Watch");

        //Display all element
        System.out.println("Initial products: " + productNames);

        //Try to add duplicate element
        productNames.add("iPhone 15");

        //Display after duplicate
        System.out.println("After duplicate : " + productNames);

        /*==================
        contains(): check if product exists
        ==================*/
        System.out.println("iPhone 15 exists: " + productNames.contains("iPhone 15"));
        System.out.println("z.com exists: " + productNames.contains("Samsung ultra"));

        //remove one element  name
        productNames.remove("MacBook");

        //Display after remove
        System.out.println("After remove MacBook : " + productNames);

        /*==================
        size(): total element count
        ==================*/
        System.out.println("Total products: " + productNames.size());

        //clear all element
        productNames.clear();

        //Display after clear
        System.out.println("After clear: " + productNames);

        /*=================
        clear(): remove all elements
        ==================*/
        System.out.println("Final size: " + productNames.size());
    }
}
