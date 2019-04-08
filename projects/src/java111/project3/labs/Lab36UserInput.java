/**
* Lab 6 class file to ask a user to input a string
*
* @author Jared Wesolaski
*/
public class Lab36UserInput {
    
    InputHelper helper = new InputHelper();
    
    public void run() {
        int counter = 0;
        String input = "";
        String testString = "quit";
        while (counter < 1) {
            input = helper.getUserInput("Enter some input that is a string");
            
            if (input.equals(testString)) {
                counter++;
                break;
            }

        }
            
    }
    
}