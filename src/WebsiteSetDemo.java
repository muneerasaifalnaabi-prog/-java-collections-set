import java.util.HashSet;
import java.util.Set;

public class WebsiteSetDemo {
    public static void main(String[] args) {
        Set<String> websiteNames = new HashSet<>();

        //add 5 element
        websiteNames.add("google.com");
        websiteNames.add("youtube.com");
        websiteNames.add("facebook.com");
        websiteNames.add("amazon.com");
        websiteNames.add("x.com");

        //Display all element
        System.out.println("Initial websites: " + websiteNames);

        //Try to add duplicate element
        websiteNames.add("google.com");

        //Display after duplicate
        System.out.println("After duplicate : " + websiteNames);
        
        /*==================
        contains(): check if website exists
        ==================*/
        System.out.println("google.com exists: " + websiteNames.contains("google.com"));
        System.out.println("z.com exists: " + websiteNames.contains("netflix.com"));

        //remove one element  name
        websiteNames.remove("youtube.com");

        //Display after remove
        System.out.println("After remove youtube.com: " + websiteNames);
        
        /*==================
        size(): total element count
        ==================*/
        System.out.println("Total websites: " + websiteNames.size());

        //clear all element
        websiteNames.clear();

        //Display after clear
        System.out.println("After clear: " + websiteNames);
        
        /*=================
        clear(): remove all elements
        ==================*/
        System.out.println("Final size: " + websiteNames.size());
    }
}