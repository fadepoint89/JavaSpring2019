/**
* Fruit Counter class that creates an array of fruits and sets the names and
* quantities of each fruit. It will then loop through the array and display each
* fruit and its' quantity.
*
* @author Jared Wesolaski
*/
public class FruitCounter {
    /**
    * @param fruitList Will hold an array of fruit objects
    * @param totalFruits Will hold the number of total fruits inside the fruitList array
    */
    Fruit[] fruitList;
    int totalFruits;

    public void run() {
        fruitList = new Fruit[5];

        fruitList[0] = new Fruit();
        fruitList[1] = new Fruit();
        fruitList[2] = new Fruit();
        fruitList[3] = new Fruit();
        fruitList[4] = new Fruit();
        fruitList[5] = new Fruit();

        fruitList[0].setFruitName("Orange");
        fruitList[0].setFruitQuantity(5);

        fruitList[1].setFruitName("Apple");
        fruitList[1].setFruitQuantity(6);

        fruitList[2].setFruitName("Pear");
        fruitList[2].setFruitQuantity(7);

        fruitList[3].setFruitName("Grape");
        fruitList[3].setFruitQuantity(8);

        fruitList[4].setFruitName("Grapefruit");
        fruitList[4].setFruitQuantity(9);

        fruitList[5].setFruitName("Watermelon");
        fruitList[5].setFruitQuantity(10);

    }
}
