public class Footwear {

    private String brand;
    private String gender;
    private String color;

	/**
	* Returns value of brand
	* @return brand
	*/
	public String getBrand() {
		return brand;
	}

	/**
	* Sets new value of brand
	* @param brand
	*/
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	* Returns value of gender
	* @return gender
	*/
	public String getGender() {
		return gender;
	}

	/**
	* Sets new value of gender
	* @param gender
	*/
	public void setGender(String gender) {
		this.gender = gender;
	}

    /**
    * Returns value of color
    * @return color
    */
    public String getColor() {
        return color;
    }

    /**
    * Sets new value of color
    * @param color
    */
    public void setColor(String color) {
        this.color = color;
    }

  public void display() {
      System.out.println("In the superclass...");
      System.out.println("Brand: " + getBrand());
      System.out.println("Gender: " + getGender());
      System.out.println("Color: " + getColor());
      System.out.println("");
  }

}
