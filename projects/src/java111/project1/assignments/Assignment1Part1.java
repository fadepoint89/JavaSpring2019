/**
 * This is the class file for Assignment 1 Part 1 of Module 1.
 *
 * @author Jared Wesolaski
 *
 */
public class Assignment1Part1 {

    /**
     * This is the main method for Assignment 1 Part 1
     * This method will create a loop inform the user what the counter
     * number currently is at.
     * @param args
     */
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 8) {
            System.out.println("Counter: " + counter);
            counter = counter + 1;
        }
    }
}
