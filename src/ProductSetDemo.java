import java.util.HashSet;
import java.util.Set;

public class ProductSetDemo {
    public static void main(String[] args) {
        Set<String> productCodes = new HashSet<>();
        productCodes.add("aaa");
        productCodes.add("bbb");
        productCodes.add("ccc");
        productCodes.add("ddd");
        productCodes.add("eee");
        System.out.println(productCodes);
        productCodes.add("fff");
        System.out.println(productCodes);
    }
}
