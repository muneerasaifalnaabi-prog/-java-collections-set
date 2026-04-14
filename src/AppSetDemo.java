import java.util.HashSet;
import java.util.Set;

public class AppSetDemo {
    public static void main(String[] args) {
        Set<String> appNames = new HashSet<>();

        //add 5 mobile app names
        appNames.add("WhatsApp");
        appNames.add("Instagram");
        appNames.add("TikTok");
        appNames.add("Spotify");
        appNames.add("Netflix");

        //Display all app names
        System.out.println("Initial apps: " + appNames);

        //Try to add duplicate app name
        appNames.add("WhatsApp");

        //Display after duplicate
        System.out.println("After duplicate WhatsApp: " + appNames);

        /*==================
        contains(): check if app exists
        ==================*/
        System.out.println("WhatsApp exists: " + appNames.contains("WhatsApp"));
        System.out.println("Facebook exists: " + appNames.contains("Facebook"));

        //remove one app name
        appNames.remove("Instagram");

        //Display after remove
        System.out.println("After remove Instagram: " + appNames);

        /*==================
        size(): total app count
        ==================*/
        System.out.println("Total apps: " + appNames.size());

        //clear all app names
        appNames.clear();

        //Display after clear
        System.out.println("After clear: " + appNames);

        /*=================
        clear(): remove all apps
        ==================*/
        System.out.println("Final size: " + appNames.size());
    }
}