/**
 * This is the class file for Assignment 1 Part 2 of Module 1.
 *
 * @author Jared Wesolaski
 *
 */
public class Assignment1Part2 {

    /**
     * This is the main method for Assignment 1 Part 2
     * This method will create a loop and inform the user
     * of the status of the loop.
     * @param args
     */
    public static void main(String[] args) {
        int counter = 0; // counter initially set to 0

        while (counter < 20) {
            if (counter == 0) {
                System.out.println("First time!");
            } else if (counter == 9) {
                System.out.println("Half-way there");
            } else if (counter == 19) {
                System.out.println("All done!");
            }
            counter =  counter + 1; // counter increments by 1 each time the loop is ran
        }
    }
}
