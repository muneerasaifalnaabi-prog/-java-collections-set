import java.util.HashSet;
import java.util.Set;

public class CheckSetDemo {
    public static void main(String[] args) {
        Set<String> employeeIds = new HashSet<>();
        employeeIds.add("0125j");
        employeeIds.add("0126r");
        employeeIds.add("0127u");
        employeeIds.add("0126g");
        employeeIds.add("0127k");

        System.out.println(employeeIds);

        /*==================
        Set.Contains()
        check if the value exit in that
        set or not if not exit it return false
         ==================*/
        System.out.println(employeeIds.contains("0126g"));  // true
        System.out.println(employeeIds.contains("0129n"));  // false
    }
}