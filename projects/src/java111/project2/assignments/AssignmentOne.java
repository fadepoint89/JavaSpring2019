/**
* Class file for Assignment 1 of Module 2.
*
* @author Jared Wesolaski
*/
public class AssignmentOne {
    /**
    * @param counter Number of times to run through the loop
    * @param addValue Number to add to the total each time loop is ran
    * @param totalAmount Number that will hold the total throughout loop
    */
    int counter = 10;
    double addValue = 12.76;
    double totalAmount;

    /**
    * Method that will loop the amount of times listed in counter and add the
    * addValue variable to the totalAmount variable and then display the results
    */
    public void runLoop() {
        totalAmount = 0;

        while (counter > 0) {
            totalAmount = totalAmount + addValue;
            System.out.println("Total: " + totalAmount);
            counter = counter - 1;
        }
    }
}
