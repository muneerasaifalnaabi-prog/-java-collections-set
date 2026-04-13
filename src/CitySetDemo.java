import java.util.HashSet;
import java.util.Set;

public class CitySetDemo {
    public static void main(String[] args) {
        Set<String> cityNames = new HashSet<>();

        //add 5 city names
        cityNames.add("Mascut");
        cityNames.add("Jeddah");
        cityNames.add("Ibra");
        cityNames.add("Ibri");
        cityNames.add("Madinah");

        //Display all city names
        System.out.println("Initial cities: " + cityNames);

        //Try to add duplicate city name
        cityNames.add("Mascut");

        //Display after duplicate
        System.out.println("After duplicate Mascut: " + cityNames);
        
        /*==================
        contains(): check if city exists
        ==================*/
        System.out.println("Mascut exists: " + cityNames.contains("Mascut"));
        System.out.println("Dubai exists: " + cityNames.contains("Dubai"));

        //remove one city name
        cityNames.remove("Jeddah");

        //Display after remove
        System.out.println("After remove Jeddah: " + cityNames);
        
        /*==================
        size(): total city count
        ==================*/
        System.out.println("Total cities: " + cityNames.size());

        //clear all city names
        cityNames.clear();

        //Display after clear
        System.out.println("After clear: " + cityNames);
        
        /*=================
        clear(): remove all cities
        ==================*/
        System.out.println("Final size: " + cityNames.size());
    }
}