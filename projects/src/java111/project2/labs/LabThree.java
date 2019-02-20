/**
 * This is the class file for Lab 3  of Module 2.
 *
 * @author Jared Wesolaski
 */
public class LabThree {

    /**
    * Method that receives a string variable and prints a greeting to the name
    * @param name The person's name you would like to say hi to
    */
	public void sayHello(String name) {
		System.out.println("Hello there " + name);
	}

    /**
    * Method that receives a name and number
    * and loops a greeting to the name for specified number
    * @param name2 The person's name you would like to say hi to
    * @param counter The number of times you would like to say hi
    */
    public void sayHelloAgain(String name2, int counter) {
		while (counter > 0) {
			System.out.println("Hello there " + name2);
			counter = counter - 1;
		}
	}

}
