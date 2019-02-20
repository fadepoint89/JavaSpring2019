/**
* Class file for Lab Part 2 of Module 2
*
* @author Jared Wesolaski
*/
public class LabFiveVariablesTestDrive {

    /**
    * The main method for LabFiveVariablesTestDrive that will create a LabFiveVariables object,
    * call the run() command and print the count using the getCount() method.
    *
    * @param args
    */
    public static void main(String[] args) {
        LabFiveVariables lab5 = new LabFiveVariables();

        lab5.run();

        System.out.println("The instance variable named count is: " + lab5.getCount() + " (printed from the main() method)");
    }

}
