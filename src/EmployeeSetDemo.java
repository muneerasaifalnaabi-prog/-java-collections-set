import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {
    public static void main(String[] args) {
        Set<String> employeeIds = new HashSet<>();

        //add at least 5 employee IDs using add()
        employeeIds.add("EMP001");
        employeeIds.add("EMP002");
        employeeIds.add("EMP003");
        employeeIds.add("EMP004");
        employeeIds.add("EMP005");

        //Display all elements
        System.out.println( employeeIds);

        //Try to add duplicate employee ID
        employeeIds.add("EMP003");

        //Display set after duplicate attempt
        System.out.println(employeeIds);
        
        /*==================
        contains(): check if ID exists
        true = exists, false = not exists
        ==================*/
        System.out.println("EMP003 exists: " + employeeIds.contains("EMP003"));
        System.out.println("EMP999 exists: " + employeeIds.contains("EMP999"));

        //remove one employee ID
        employeeIds.remove("EMP002");

        //Display after remove
        System.out.println( employeeIds);
        
        /*==================
        size(): count total elements
        ==================*/
        System.out.println( employeeIds.size());

        //clear all elements
        employeeIds.clear();

        //Display after clear
        System.out.println( employeeIds);
        
        /*==================
        clear(): remove ALL elements
        ==================*/
        System.out.println(employeeIds.size());
    }
}