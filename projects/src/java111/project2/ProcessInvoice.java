/**
* Class file containing all the information and methods to process
* an invoice.
*
* @author Jared Wesolaski
*/
public class ProcessInvoice {
    Invoice newInvoice = new Invoice();

    private void createItems() {
        Item[] listOfItems;
        listOfItems = new Item[3];
        listOfItems[0] = new Item();
        listOfItems[0].setItemID(123);
        listOfItems[0].setItemQuantity(2);
        listOfItems[0].setItemPrice(9.99);
        listOfItems[0].setItemDescription("widgets");

        listOfItems[1] = new Item();
        listOfItems[1].setItemID(4444);
        listOfItems[1].setItemQuantity(1);
        listOfItems[1].setItemPrice(15.46);
        listOfItems[1].setItemDescription("doodads");

        listOfItems[2] = new Item();
        listOfItems[2].setItemID(99);
        listOfItems[2].setItemQuantity(20);
        listOfItems[2].setItemPrice(1.99);
        listOfItems[2].setItemDescription("thingies");
        newInvoice.setListOfItems(listOfItems);
    }

    public void runProcess() {
        Invoice invoiceNew = new Invoice();
        createItems();
        newInvoice.calculateInvoice();
        newInvoice.displayInvoice();
    }


}
