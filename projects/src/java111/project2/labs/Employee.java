/**
* Class file for Lab 4 of Module 2. Contains methods and variables for
* employee information.
*
* @author Jared Wesolaski
*/
public class Employee {
    /**
    * Employee's information variables
    * @param firstName The employees first name
    * @param lastName The employees last name
    * @param employeeID The employees id number
    * @param salary The employees salary (ex. 25000.00)
    */
    private String firstName;
    private String lastName;
    private int employeeID;
    private double salary;

	/**
	* Returns value of firstName
	* @return firstName
	*/
	public String getFirstName() {
		return firstName;
	}

	/**
	* Sets new value of firstName
	* @param firstName
	*/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	* Returns value of lastName
	* @return lastName
	*/
	public String getLastName() {
		return lastName;
	}

	/**
	* Sets new value of lastName
	* @param lastName
	*/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	* Returns value of employeeID
	* @return employeeID
	*/
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	* Sets new value of employeeID
	* @param employeeID
	*/
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	/**
	* Returns value of salary
	* @return salary
	*/
	public double getSalary() {
		return salary;
	}

	/**
	* Sets new value of salary
	* @param salary
	*/
	public void setSalary(double salary) {
		this.salary = salary;
	}

    /**
    * Method that uses get and set methods to output the values of all the instance variables
    */
    public void display() {
        System.out.println("Employee First Name: " + getFirstName());
        System.out.println("Employee Last Name: " + getLastName());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Employee Salary: " + getSalary());

    }
}
