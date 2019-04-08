/** The Customer class will contain all the containers for the customer's
 *  information as well as the if statement for deciding whether or not to enter
 *  another customer's information.
 *
 * @author Jared Wesolaski
 */
 public class Customer {
     /** Declare variables to hold the customers information that will be received
      *  from InputHelper
      */
      private String customerName;
      private int yardWidth;
      private int yardLength;
      private int numberOfPayments;
      private int seasonCharge;
      private int serviceCharge;
      private int totalDue;

        /**
        * Returns value of customerName
        * @return customerName
        */
        public String getCustomerName() {
        	return customerName;
        }

        /**
        * Sets new value of customerName
        * @param customerName
        */
        public void setCustomerName(String customerName) {
        	this.customerName = customerName;
        }

        /**
        * Returns value of yardWidth
        * @return yardWidth
        */
        public int getYardWidth() {
        	return yardWidth;
        }

        /**
        * Sets new value of yardWidth
        * @param yardWidth
        */
        public void setYardWidth(int yardWidth) {
        	this.yardWidth = yardWidth;
        }

        /**
        * Returns value of yardLength
        * @return yardLength
        */
        public int getYardLength() {
        	return yardLength;
        }

        /**
        * Sets new value of yardLength
        * @param yardLength
        */
        public void setYardLength(int yardLength) {
        	this.yardLength = yardLength;
        }

        /**
        * Returns value of numberOfPayments
        * @return numberOfPayments
        */
        public int getNumberOfPayments() {
        	return numberOfPayments;
        }

        /**
        * Sets new value of numberOfPayments
        * @param numberOfPayments
        */
        public void setNumberOfPayments(int numberOfPayments) {
        	this.numberOfPayments = numberOfPayments;
        }

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

        /**
        * Returns value of totalDue
        * @return totalDue
        */
        public int getTotalDue() {
            return totalDue;
        }

        /**
        * Sets new value of totalDue
        * @param totalDue
        */
        public void setTotalDue(int totalDue) {
            this.totalDue = totalDue;
        }

        /** Method to display all of the customer's information
         */
        public String display() {
            return "Name: " + getCustomerName()
                    + "\nYard Width: " + getYardWidth()
                    + "\nYard Length: " + getYardLength()
                    + "\nNumber of Payments Chosen: " + getNumberOfPayments()
                    + "\nSeason Charge: $" + getSeasonCharge()
                    + "\nService Charge: $" + getServiceCharge()
                    + "\nTotal Charge: $" + getTotalDue();
        }
}
