public class NumberGuessingTestDrive {

    public static void main(String args[]) {
        RandomNumber newNumber = new RandomNumber();

        newNumber.generateRandomNumber();
        System.out.println("Random Number: " + newNumber.getGeneratedRandom());
    }

}
