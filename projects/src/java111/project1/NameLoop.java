/**
 * This is the class for the java program called NameLoop
 *
 * @author Jared Wesolaski
 */
public class NameLoop {
    String fullName = "";
    int counter = 7;

    // Method that loops the name 7 times
    public void nameLoop() {
        while (counter > 0) {
            System.out.println(fullName);
            counter = counter - 1;
        }
    }
}
