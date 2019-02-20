/**
 * This is the class file for LabThreeTestDrive for Lab 3 of Module 2.
 *
 * @author Jared Wesolaski
 */
public class LabThreeTestDrive{

    /**
     * This is the main method for LabThreeTestDrive for Lab 3 of Module 2.
     *
     * @param args
     */
	public static void main(String[] args) {
        // Instantiate an object of LabThree
        LabThree hello1 = new LabThree();

        // Call the sayHello() method and pass a name to it
		hello1.sayHello("Fred");
		hello1.sayHello("Barney");
		hello1.sayHello("Wilma");
		hello1.sayHello("Betty");

		// Separate the two methods' display
		System.out.println("");

        // Call the sayHelloAgain() method and pass a name and loop number to it
        hello1.sayHelloAgain("Wilma", 5);
	}

}
