/**
* Class file for information regarding an invoice.
*
* @author Jared Wesolaski
*/
public class Invoice {
    Item[] listOfItems;

    double invoiceTotal = 0.0;

    /** Get method for invoice total
     *  @return invoiceTotal
     */
    public double getInvoiceTotal() {
        return invoiceTotal;
    }

    /** Set method for for the array of Item objects.
     *  This will take an array of type Item and assign it to the instance variable.
     */
    public void setListOfItems(Item[] newListofItems) {
        listOfItems = newListofItems;
    }

    public void calculateInvoice() {
        for (int counter = 0; counter < listOfItems.length; counter++) {
            invoiceTotal = (double) invoiceTotal + listOfItems[counter].calculateItemTotal();
        }
    }

    public void displayInvoice() {
        for (int counter2 = 0; counter2 < listOfItems.length; counter2++) {
            System.out.println(listOfItems[counter2].display() );
        }

        System.out.println("Invoice Total: $" + getInvoiceTotal());
    }


}
