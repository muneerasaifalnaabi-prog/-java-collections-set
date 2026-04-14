import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo1 {
    public static void main(String[] args) {
        //USe set Interface
        Set<String> employeeNames = new HashSet<>();

        //add 5 element 
        employeeNames.add("Ali");
        employeeNames.add("Sara");
        employeeNames.add("Omar");
        employeeNames.add("Noor");
        employeeNames.add("Maha");

        //Display all element
        System.out.println("Initial employees: " + employeeNames);

        //Add one more employee name
        employeeNames.add("Khalid");
        System.out.println("After adding Khalid: " + employeeNames);

        //Try to add duplicate element 
        employeeNames.add("Ali");

        //Display after duplicate - Set allows only unique elements
        System.out.println("After duplicate Ali : " + employeeNames);
        
        /*==================
        contains(): check if employee exists
        ==================*/
        System.out.println("Ali exists: " + employeeNames.contains("Ali"));
        System.out.println("Fatima exists: " + employeeNames.contains("Fatima"));

        //remove one element  name
        employeeNames.remove("Sara");

        //Display after remove
        System.out.println("After remove Sara: " + employeeNames);
        
        /*==================
        size(): total element count
        ==================*/
        System.out.println("Total employees: " + employeeNames.size());

        //Add one new unique employee
        employeeNames.add("Ahmed");
        System.out.println("After adding Ahmed: " + employeeNames);
        System.out.println("New total employees: " + employeeNames.size());

        //clear all element
        employeeNames.clear();

        //Display after clear
        System.out.println("After clear: " + employeeNames);
        
        /*=================
        clear(): remove all elements
        ==================*/
        System.out.println("Final size: " + employeeNames.size());
    }
}