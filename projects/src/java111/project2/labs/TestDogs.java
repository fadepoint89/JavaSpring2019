/**
 * This is the class file for TestDogs to test if the DogLabTwo class works
 * properly when created into an object.
 * For Lab 2 of Module 2
 *
 * @author Jared Wesolaski
 */
public class TestDogs {

    /**
     * This is the main method that will create dog objects, assign them names,
     * and make them bark.
     *
     * @param args
     */
	public static void main(String[] args) {
        // Create first dog object
        DogLabTwo dog1 = new DogLabTwo();

        // Give first dog a name
		dog1.name = "Fido";

        // Create second dog object
		DogLabTwo dog2 = new DogLabTwo();

        // Give second dog a name
		dog2.name = "Spot";

        // Make the dogs bark
		dog1.bark();
		dog2.bark();

        // Assign first dog to second dog
		dog2 = dog1;

        // Make the dogs bark
		dog1.bark();
		dog2.bark();
	}

}
