/**
 * This is the class file for Project 1 Part 1
 * This class will have the information needed to hold information for a contact.
 *
 * @author Jared Wesolaski
 */
public class Contact {
    // Contact's Personal Information in string variables
    String firstName = "";
    String lastName = "";
    String address = "";
    String phone = "";
    String email = "";

    // Method to display the information contained in the contact's variables.
    public void display() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);
        System.out.println(phone);
        System.out.println(email);
    }
}
