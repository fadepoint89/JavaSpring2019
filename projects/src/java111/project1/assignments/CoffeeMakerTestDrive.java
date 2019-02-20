/**
 * This is the test drive class file for the Coffee Maker
 * for Assignment 2 Part 1.
 *
 * @author Jared Wesolaski
 */
public class CoffeeMakerTestDrive {

    /**
     * This is the main method that will create an instance of CoffeeMaker
     * and run the two available methods from the class.
     *
     * @param args
     */
    public static void main(String[] args) {
        CoffeeMaker keurig = new CoffeeMaker();

        keurig.brewWeakCoffee();
        keurig.brewStrongCoffee();
    }
}
