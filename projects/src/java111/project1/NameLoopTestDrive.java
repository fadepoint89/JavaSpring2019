/**
 * This is the test drive file for the Name Loop program.
 * It will create an instance of NameLoop and pass a string to the instance
 * and then loop the name 7 times.
 *
 * @author Jared Wesolaski
 */
public class NameLoopTestDrive {

    /**
     * This is the main method that will instantiate a NameLoop object
     * and pass a String with a name and then call the nameLoop() method
     * and loop the name 7 times.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Instantiate NameLoop object
        NameLoop newNameLoop = new NameLoop();

        // Pass a name to the fullName String variable
        newNameLoop.fullName = "Jared Wesolaski";

        // Call the nameLoop() method on the object which loops
        // and prints the name 7 times
        newNameLoop.nameLoop();
    }

}
