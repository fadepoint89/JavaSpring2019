/** This PaymentCalculation class will contain everything needed to calculate
 *  how much a customer's season charge and service charge will be.
 *
 *  @author Jared Wesolaski
 */
public class PaymentCalculation {
    // Declare constant variables for use in payment calulcation formula
    private int SMALL_YARD_500 = 500;
    private int LARGE_YARD_800 = 800;
    private int LESS_THAN_500 = 25; // $25 dollars per week
    private int UNDER_800 = 35; // $35 dollars per week
    private int OVER_800 = 50; // $50 dollars per week
    private int seasonCharge;
    private int serviceCharge;


	/**
	* Returns value of seasonCharge
	* @return seasonCharge
	*/
	public int getSeasonCharge() {
		return seasonCharge;
	}

	/**
	* Sets new value of seasonCharge
	* @param seasonCharge
	*/
	public void setSeasonCharge(int seasonCharge) {
		this.seasonCharge = seasonCharge;
	}

	/**
	* Returns value of serviceCharge
	* @return serviceCharge
	*/
	public int getServiceCharge() {
		return serviceCharge;
	}

	/**
	* Sets new value of serviceCharge
	* @param serviceCharge
	*/
	public void setServiceCharge(int serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

    /** Method to calculate the season charge based on the size of the customer's
     *  yard.
     */
    public int calculateSeasonCharge(int yardSize) {
        if (yardSize < SMALL_YARD_500) {
            setSeasonCharge(LESS_THAN_500);
        } else if (yardSize >= SMALL_YARD_500 && yardSize < LARGE_YARD_800) {
            setSeasonCharge(UNDER_800);
        } else if (yardSize >= LARGE_YARD_800) {
            setSeasonCharge(OVER_800);
        }

        return getSeasonCharge() * 22;
    }

    /** Method to calculate how much the service charge will be based on the number
     *  of payments chosen by the customer.
     */
    public int calculateServiceCharge(int payments) {
        if (payments == 1) {
            setServiceCharge(0);
        } else if (payments == 2) {
            setServiceCharge(10);
        } else if (payments == 22) {
            setServiceCharge(66);
        }

        return getServiceCharge();
    }

}
