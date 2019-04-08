/**
* Class file conataining all the inforation for an item.
*
* @author Jared Wesolaski
*/
public class Item {

// private instance variables for Item
private int itemID;
private int itemQuantity;
private double itemPrice;
private String itemDescription;

    /** get method for Item ID
     *  @return itemID
     */
    public int getItemID() {
        return itemID;
    }

    /** set method for Item ID
     *  @param itemID
     */
    public void setItemID(int newItemID) {
        itemID = newItemID;
    }

    /** get method for Item Quantity
     *  @return itemQuantity
     */
    public int getItemQuantity() {
        return itemQuantity;
    }

    /** set method for Item Quantity
     *  @param itemQuantity
     */
    public void setItemQuantity(int newItemQuantity) {
        itemQuantity = newItemQuantity;
    }

    /** get method for Item Price
     *  @return itemPrice
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /** set method for Item Price
     *  @param itemPrice
     */
    public void setItemPrice(double newItemPrice) {
        itemPrice = newItemPrice;
    }

    /** get method for Item Description
     *  @return itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /** set method for Item Description
     *  @param itemDescription
     */
    public void setItemDescription(String newItemDescription) {
        itemDescription = newItemDescription;
    }

    /** Method to calculate the item total. Does not put results in a variable
     *  only returns the value.
     *  @return Item Total
     */
    public double calculateItemTotal() {
        return getItemQuantity() * getItemPrice();
    }

    public String display() {
        return ("Item ID: " + getItemID() + " Quantity: " + getItemQuantity()
               + " Price: $" + getItemPrice() + " Description: " + getItemDescription()
               + " Total Cost: $" + calculateItemTotal() );
    }

}
