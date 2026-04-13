import java.util.HashSet;
import java.util.Set;

public class RemoveSetDemo {
    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();
        productNames.add("product a");
        productNames.add("product b");
        productNames.add("product c");
        productNames.add("product d");
        productNames.add("product e");

          /*==================
          remove(): it remove from set by value
         ==================*/

        System.out.println("Set before removing any items :");
        //display all items in set
        System.out.println(productNames);
        System.out.println("Set After removing 1 items :");
        //remove last element in this set
        productNames.remove("product e");
        System.out.println(productNames);

    }
}
