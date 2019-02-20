public class LabFiveVariables {
    private int count = 1;

	/**
	* Returns value of count
	* @return count
	*/
	public int getCount() {
		return count;
	}

	/**
	* Sets new value of count
	* @param count
	*/
	public void setCount(int count) {
		this.count = count;
	}

    public void run() {
        int count = 15;

        System.out.println("The local variable named count is: " + count);
        System.out.println("The instance variable named count is: " + getCount() + " (printed from the run() method)");
    }
}
