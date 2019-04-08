import java.util.*;
/** This Reports class will contain everything needed to gather customer information,
 *  run calculation methods from the PaymentCalculation class as well as display
 *  each customer and their information and the total customers, yards, and revenue.
 *
 *  @author Jared Wesolaski
 */
public class Reports {
    // Declare variables to be used
    private ArrayList            customers; // This will hold all of the customers
    private PaymentCalculation   calculate;
    private InputHelper          input;
    int                          totalCustomers;
    int                          totalSquareYards;
    int                          totalRevenue;

    /** Main method to run all the other methods below
    */
    public void run() {
        getCustomers();
        calculatePayments();
        System.out.println();
        System.out.println("Customers List: ");
        displayCustomers();
        System.out.println();
        displayTotal();
    }

    /** Method to ask the user for customer information and input the information
     *  into the customers array list.
     */
    public void getCustomers() {
        customers = new ArrayList();
        input = new InputHelper();

        String customerName           = "";
        String yardWidthString        = "";
        String yardLengthString       = "";
        String numberOfPaymentsString = "";
        String more                   = "";
        int yardWidth                 = 0;
        int yardLength                = 0;
        int numberOfPayments          = 0;
        Customer newCustomer          = null;

        while (true) {
            customerName = input.getUserInput("Enter the name of the customer.");
            yardWidthString = input.getUserInput("Enter the width of the yard.");
            yardLengthString = input.getUserInput("Enter the length of the yard.");
            numberOfPaymentsString = input.getUserInput("Enter the number of payments.");
            yardWidth = Integer.parseInt(yardWidthString);
            yardLength = Integer.parseInt(yardLengthString);
            numberOfPayments = Integer.parseInt(numberOfPaymentsString);
            newCustomer = new Customer();
            newCustomer.setCustomerName(customerName);
            newCustomer.setYardWidth(yardWidth);
            newCustomer.setYardLength(yardLength);
            newCustomer.setNumberOfPayments(numberOfPayments);
            customers.add(newCustomer);
            more = input.getUserInput(
                    "Would you like to enter another customer?");
            if (!more.equals("y")) {
                break;
            }
        }
    }

    /** Method to loop through each customer and calculate their season and service
     *  charges as well as their total charge due.
     */
    public void calculatePayments() {
        calculate = new PaymentCalculation();
        Customer customer = null;
        int yardSize = 0;
        int payments = 0;
        for (int counter = 0; counter < customers.size(); counter++) {
            customer = (Customer) customers.get(counter);
            yardSize = customer.getYardWidth() * customer.getYardLength();
            payments = customer.getNumberOfPayments();
            customer.setSeasonCharge(calculate.calculateSeasonCharge(yardSize));
            customer.setServiceCharge(calculate.calculateServiceCharge(payments));
            customer.setTotalDue(customer.getSeasonCharge() + customer.getServiceCharge());
        }
    }

    /** Method to display each customer and their corresponding information.
    */
    public void displayCustomers() {
        Customer customer  = null;
        for (int counter = 0; counter < customers.size(); counter++) {
            customer = (Customer) customers.get(counter);
            System.out.println(customer.display());
            System.out.println();
        }

    }

    /** Method to display the total amount of customers, the total amount of square
     *  yards to service, and the total revenue at the end of the season.
     */
    public void displayTotal() {
        Customer customer  = null;
        int yardSize = 0;
        for (int counter = 0; counter < customers.size(); counter++) {
            customer = (Customer) customers.get(counter);
            yardSize = customer.getYardWidth() * customer.getYardLength();
            totalCustomers++;
            totalSquareYards = totalSquareYards + yardSize;
            totalRevenue = totalRevenue + customer.getTotalDue();
        }

        System.out.println("Total Customers: " + totalCustomers
                            + "\nTotal Square Yards: " + totalSquareYards
                            + "\nTotal Revenue: $" + totalRevenue);
    }

}
