public class Boot extends Footwear {

    private int height;
    private String model;

	/**
	* Returns value of height
	* @return height
	*/
	public int getHeight() {
		return height;
	}

	/**
	* Sets new value of height
	* @param height
	*/
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	* Returns value of size
	* @return model
	*/
	public String getModel() {
		return model;
	}

	/**
	* Sets new value of model
	* @param model
	*/
	public void setModel(String model) {
		this.model = model;
	}

    public void display() {
        System.out.println("In the subclass...");
        System.out.println("Brand: " + getBrand());
        System.out.println("Gender: " + getGender());
        System.out.println("Model: " + getModel());
        System.out.println("Height: " + getHeight());
        System.out.println("Color: " + getColor());
    }
}
