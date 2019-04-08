import java.util.Random;

public class RandomNumber {
    private int generatedRandom;

    /**
    * Returns value of generatedRandom
    * @return
    */
    public int getGeneratedRandom() {
        return generatedRandom;
    }

    /**
    * Sets new value of generatedRandom
    * @param
    */
    public void setGeneratedRandom(int generatedRandom) {
        this.generatedRandom = generatedRandom;
    }

    public void generateRandomNumber() {
        int pickedNumber;
        Random rand = new Random();
        pickedNumber = rand.nextInt(100) + 1;
        setGeneratedRandom(pickedNumber);
    }

}
