/**
 * This is the test drive class file for Project1's Contact class.
 * This class is able to create contact objects, assign information,
 * and display the contact's information to the user.
 *
 * @author Jared Wesolaski
 */
public class ContactTestDrive {

    /**
     * This will create two contact objects, assign information to them
     * and display them to the user.
     */
    public static void main(String[] args) {
        // Create first contact
        Contact newContact1 = new Contact();

        // Assign information to the contact
        newContact1.firstName = "Thor";
        newContact1.lastName = "Odinson";
        newContact1.address = "Avengers HQ, New York, NY";
        newContact1.phone = "1-800-AVE-NGER Ext 3";
        newContact1.email = "strongestavenger@avengers-inc.com";

        // Display the contacts information to the user
        newContact1.display();
        // Create a line between the contacts
        System.out.println("");

        // Create the second contact
        Contact newContact2 = new Contact();

        // Assign information to the second contact
        newContact2.firstName = "Iron";
        newContact2.lastName = "Man";
        newContact2.address = "Avengers HQ, New York, NY";
        newContact2.phone = "1-800-AVE-NGER Ext 1";
        newContact2.email = "ironman@avengers-inc.com";

        // Display the second contact's information to the user
        newContact2.display();
    }

}
