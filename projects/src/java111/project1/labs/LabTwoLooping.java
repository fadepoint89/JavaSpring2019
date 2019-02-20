/**
 * This is the class for Lab 2.1
 *
 * @author Jared Wesolaski
 *
 */
public class LabTwoLooping {

    /**
     * This is the main method for this class which will
     * output a welcome message.
     *
     * @param args
     */
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 13) {
            System.out.println(counter + " " + (counter * counter));
            counter = counter + 1;
        }
    }
}
