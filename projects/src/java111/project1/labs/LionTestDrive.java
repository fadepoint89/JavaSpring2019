/**
 * This is the test drive class file for Part 4 of lab 4
 *
 * @author Jared Wesolaski
 *
 */
public class LionTestDrive {

    /**
     *  The main method for the LionTestDrive class
     *  which instatiate two Lion ojbects and have them roar.
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        Lion simba = new Lion();
        Lion mufasa = new Lion();

        simba.roar();
        mufasa.roar();
    }
}
