public class FruityTestDrive {

    public static void main(String[] args) {
        Fruit fruit1 = new Orange();
        Fruit fruit2 = new Orange();
        Fruit fruit3 = new Orange();

        fruit1.displayClassName();
        fruit2.displayClassName();
        fruit3.displayClassName();

        fruit1.orangeMessage();
        fruit2.orangeMessage();
        fruit3.orangeMessage();
    }

}
