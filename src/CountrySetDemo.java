import java.util.HashSet;
import java.util.Set;

public class CountrySetDemo {
    public static void main(String[] args) {
        //Declare a Set variable using the Set interface
        Set<String> countryNames = new HashSet<>();

        //add 5 element
        countryNames.add("Oman");
        countryNames.add("UAE");
        countryNames.add("Saudi Arabia");
        countryNames.add("Qatar");
        countryNames.add("Bahrain");

        //Display all element
        System.out.println("Initial countries: " + countryNames);

        //Add one more country name
        countryNames.add("Kuwait");
        System.out.println("After adding Kuwait: " + countryNames);

        //Try to add duplicate element
        countryNames.add("Oman");

        //Display after duplicate - Set allows only unique elements
        System.out.println("After duplicate Oman : " + countryNames);

        /*==================
        contains(): check if country exists
        ==================*/
        System.out.println("Oman exists: " + countryNames.contains("Oman"));
        System.out.println("Egypt exists: " + countryNames.contains("Egypt"));

        //remove one element  name
        countryNames.remove("UAE");

        //Display after remove
        System.out.println("After remove UAE: " + countryNames);

        /*==================
        size(): total element count
        ==================*/
        System.out.println("Total countries: " + countryNames.size());

        //Add one new unique country
        countryNames.add("Jordan");
        System.out.println("After adding Jordan: " + countryNames);
        System.out.println("New total countries: " + countryNames.size());

        //clear all element
        countryNames.clear();

        //Display after clear
        System.out.println("After clear: " + countryNames);

        /*=================
        clear(): remove all elements
        ==================*/
        System.out.println("Final size: " + countryNames.size());
    }
}