import java.util.*;

public class EmployeeList {
    ArrayList employeeList;
    
    public void run() {
        employeeList = new ArrayList();
        Employee currentEmployee = null;
        
        Employee employeeOne = new Employee();
        employeeOne.setFirstName("Mike");
        employeeOne.setLastName("Miller");
        employeeOne.setEmployeeID(1);
        employeeList.add(employeeOne);
        
        Employee employeeTwo = new Employee();
        employeeTwo.setFirstName("Tina");
        employeeTwo.setLastName("Turner");
        employeeTwo.setEmployeeID(2);
        employeeList.add(employeeTwo);
        
        Employee employeeThree = new Employee();
        employeeThree.setFirstName("Captain");
        employeeThree.setLastName("Marvel");
        employeeThree.setEmployeeID(3);
        employeeList.add(employeeThree);
        
        Employee employeeFour = new Employee();
        employeeFour.setFirstName("Tony");
        employeeFour.setLastName("Stark");
        employeeFour.setEmployeeID(4);
        employeeList.add(employeeFour);
        
        
        for (int counter = 0; counter < employeeList.size(); counter++) {
            currentEmployee = (Employee) employeeList.get(counter);
            currentEmployee.displayInfo();
            System.out.println(""); // separate employees
        }
    }
}