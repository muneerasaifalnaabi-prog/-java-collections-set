import java.util.HashSet;
import java.util.Set;

public class CitySetDemo1 {
    public static void main(String[] args) {
        //Use Set Interface
        Set<String> cityNames = new HashSet<>();

        //add 5 element 
        cityNames.add("Muscat");
        cityNames.add("Salalah");
        cityNames.add("Sohar");
        cityNames.add("Nizwa");
        cityNames.add("Sur");

        //Display all element
        System.out.println("Initial cities: " + cityNames);

        //Add one more city name
        cityNames.add("Ibri");
        System.out.println("After adding Ibri: " + cityNames);

        //Try to add duplicate element 
        cityNames.add("Muscat");

        //Display after duplicate - Set allows only unique elements
        System.out.println("After duplicate Muscat : " + cityNames);
        
        /*==================
        contains(): check if city exists
        ==================*/
        System.out.println("Muscat exists: " + cityNames.contains("Muscat"));
        System.out.println("Dubai exists: " + cityNames.contains("Dubai"));

        //remove one element  name
        cityNames.remove("Salalah");

        //Display after remove
        System.out.println("After remove Salalah: " + cityNames);
        
        /*==================
        size(): total element count
        ==================*/
        System.out.println("Total cities: " + cityNames.size());

        //Add one new unique city
        cityNames.add("Rustaq");
        System.out.println("After adding Rustaq: " + cityNames);
        System.out.println("New total cities: " + cityNames.size());

        //clear all element
        cityNames.clear();

        //Display after clear
        System.out.println("After clear: " + cityNames);
        
        /*=================
        clear(): remove all elements
        ==================*/
        System.out.println("Final size: " + cityNames.size());
    }
}