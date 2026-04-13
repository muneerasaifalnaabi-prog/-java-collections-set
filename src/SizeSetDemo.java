import java.util.HashSet;
import java.util.Set;

public class SizeSetDemo {
    public static void main(String[] args) {
        Set<String> departmentNames = new HashSet<>();
        //add element in set
        departmentNames.add("HR");
        departmentNames.add("Finance");
        departmentNames.add("IT");
        departmentNames.add("Marketing");
        departmentNames.add("Sales");
        departmentNames.add("IT");
        //Display all the elements in the set
        System.out.println(departmentNames);
        //count the number of elements
        System.out.println( departmentNames.size());
        // add 1 more department name
        departmentNames.add("Operations");

        System.out.println( departmentNames.size());

        /*==================
         size(): count the number of elements in set
         ==================*/



    }
}
