/**
* Class file for Assignment 2 of Module 2.
* Contains variables and methods for a fruit object.
*
* @author Jared Wesolaski
*/
public class Fruit {
    /**
    * Private variables for a fruit
    * @param fruitName Will hold the name of the fruit
    * @param fruitQuantity Will hold the number of fruitName
    private String fruitName;
    private int fruitQuantity;

	/**
	* Returns value of fruitName
	* @return fruitName
	*/
	public String getFruitName() {
		return fruitName;
	}

	/**
	* Sets new value of fruitName
	* @param fruitName
	*/
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	/**
	* Returns value of fruitQuantity
	* @return fruitQuantity
	*/
	public int getFruitQuantity() {
		return fruitQuantity;
	}

	/**
	* Sets new value of fruitQuantity
	* @param fruitQuantity
	*/
	public void setFruitQuantity(int fruitQuantity) {
		this.fruitQuantity = fruitQuantity;
	}
}
