
/**
 *  Lab 2 Debugging exercise
 *
 *@author Jared Wesolaski
 */
public class Lab2Debug {

    /**
     *  The main method for the Lab2Debug class
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {

        int counter = 0;

        while (counter < 6) {
            System.out.println("in the loop: " + counter);
            //what goes after this line to stop the loop?
            counter = counter + 1;
        }
    }

}
