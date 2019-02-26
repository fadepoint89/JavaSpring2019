public class EmployeeFactory {
    Employee[] employeeList;

    public void setup() {
        employeeList = new Employee[3];
        employeeList[0] = new Employee();
        employeeList[1] = new Employee();
        employeeList[2] = new Employee();

        employeeList[0].setFirstName("Jared");
        employeeList[0].setLastName("Wesolaski");
        employeeList[0].setEmployeeID(1);
        employeeList[0].setSalary(22.50);


        employeeList[1].setFirstName("Mike");
        employeeList[1].setLastName("Miller");
        employeeList[1].setEmployeeID(2);
        employeeList[1].setSalary(30.00);


        employeeList[2].setFirstName("Tammy");
        employeeList[2].setLastName("Smith");
        employeeList[2].setEmployeeID(3);
        employeeList[2].setSalary(25.75);
    }

    public void runWhile() {
        int counter = 0;

        while (counter < employeeList.length) {
            employeeList[counter].display();
            System.out.println("while counter: " + counter);
            counter++;
        }
    }

    public void runFor() {
        for (int counter2 = 0; counter2 < employeeList.length; counter2++) {
            employeeList[counter2].display();
            System.out.println(" for counter: " + counter2);
        }
    }

}
