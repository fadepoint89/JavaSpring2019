/**
 * This is the class for Lab 1.2
 *
 * @author Jared Wesolaski
 *
 */
public class LabOneSelection {

    /**
    * Main method for this class which will compare
    * a variable to the number 100 and output message
    * indicating whether or not the variable is bigger than 100.
    *
    * @param args command line arguments
    */
    public static void main(String[] args) {
        int testNumber = 90;

        if (testNumber > 100) {
            System.out.println("It's bigger than 100");
        } else if (testNumber < 100) {
            System.out.println("Its not bigger than 100");
        }
    }
}
