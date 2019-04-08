public class FootwearTestDrive {

    public static void main(String[] args) {
        Footwear footwear1 = new Footwear();

        footwear1.setBrand("Adidas");
        footwear1.setGender("Male");
        footwear1.setColor("White");

        footwear1.display();

        Boot boot1 = new Boot();

        boot1.setBrand("Timberland");
        boot1.setGender("Male");
        boot1.setHeight(11);
        boot1.setModel("Pro");
        boot1.setColor("Brown");

        boot1.display();
    }

}
