import java.util.HashSet;
import java.util.Set;

public class CustomerSetDemo {
    public static void main(String[] args) {
        Set<String> customerId = new HashSet<>();
        customerId.add("cust1");
        customerId.add("cust2");
        customerId.add("cust3");
        customerId.add("cust4");
        customerId.add("cust5");
        System.out.println("the set after adding the first 5 values :");
        System.out.println(customerId);
        customerId.add("cust4");
        System.out.println("after adding the duplicate");
        System.out.println(customerId);

        //In set we cannot duplicate it remove the duplicated value



    }
}
