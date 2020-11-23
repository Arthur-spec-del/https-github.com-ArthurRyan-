public class Epos{

		//declare vars
		private date transactionDate;
		private int creditCardnumber;
		private date expiryDate;
		private String cardHoldername;
		private String appointmentType;



		//constructor
		public (){
		}

		//set

		public void setTransactiondate(date transactionDate){
				this.transactionDate = transactionDate;
		}

		public void setCardnumber(int creditCardnumber){
				this.creditCardnumber = creditCardnumber;
		}

		public void setExpirydate(date expiryDate){
				this.expiryDate = expiryDate;
		}

		public void setcardHoldername(String cardHoldername){
				this.cardHoldername = cardHoldername;
		}

		public void setappointmentType(String appointmentType){
				this.appointmentType = appointmentType;
		}


		//compute/process
		public void processPayment(){
			pseudocode -> based on appointType the amount for the bill is made

		}

		public void makeRefund(){
			pseudocode -> based on appointType the amount for the bill is made
		}


		//get
		public int getBilltotal(){
		return billTotal;
		}

}