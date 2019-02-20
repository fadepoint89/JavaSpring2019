/**
* Class test drive file for Lab 4 of Module 2.
*
* @author Jared Wesolaski
*/
public class EmployeeTestDrive {

    /**
    * The main method that can create employees, assign information, and display
    * the information.
    *
    * @param args
    */
    public static void main(String[] args) {
        // Create an employee
        Employee employee1 =  new Employee();

        // Assign information to the employee using set methods
        employee1.setFirstName("Jared");
        employee1.setLastName("Wesolaski");
        employee1.setEmployeeID(01);
        employee1.setSalary(25500.00);

        // Call display() method to display all of the "set" information
        employee1.display();
    }

}
