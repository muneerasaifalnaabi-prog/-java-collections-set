import java.util.HashSet;
import java.util.Set;

public class ClearSetDemo {
    public static void main(String[] args) {
        Set<String> tempUserNames = new HashSet<>();
        //add element in set
        tempUserNames.add("Ali");
        tempUserNames.add("Muneera");
        tempUserNames.add("Sara");
        tempUserNames.add("Mawadda");
        tempUserNames.add("Hajer");
        tempUserNames.add("huda");
        //Display all the elements in the set before clearing
        System.out.println(tempUserNames);

        //display the number of elements before clearing
        System.out.println(tempUserNames.size());

        //remove all elements from the set
        tempUserNames.clear();

        //Display the set after clearing
        System.out.println(tempUserNames.size());

        /*==================
         clear(): remove all element in set
         ==================*/


    }
}
