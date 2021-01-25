// x20170386 Arthur Ryan
// CA1 - question 1G - Interest Calculator Instangiable Class
// Instangiable class

import javax.swing.JOptionPane;

public class InterestCalculator{

		//declare vars
		private int term; // length of deposit period in whole months
		private int access; // account type ie allows access before the end of the term or not
		private double balance; // amount of money
		private double interest; // holds the compute output ie what interest was earned in euro



		//constructor
		public InterestCalculator(){

		}

		// set
		// receive the variables term, access, balance form the App class and assign them to the instangiable class equivalents
		public void setTerm(int term){
			this.term=term;
		}

		public void setAccess(int access){
			this.access=access;
		}

		public void setBalance(double balance){
			this.balance=balance;
		}


		// compute/process
		// compute the interest in euro - formula is term divided by 12 months x euro balance on deposit x interest rate per annum
		public void computeInterest(){

			if(access == 0){
					//
					switch(term){
						case 12:
						interest = (term/12 * balance * 0.0001); //  0.0001);
						break;
						case 24:
						interest = (term/12 * balance * 0.002); // 0.002);
						break;
						case 36:
						interest = (term/12 * balance * 0.0025); // 0.0025);
						break;
						default:
						JOptionPane.showMessageDialog(null,"Your term length needs to one of 12 or 24 or 36");

					}
			}
			else if(access == 1){

					switch(term){
						case 12:
						interest = (term/12 * balance * 0.0004); // 0.0004);
						break;
						case 24:
						interest = (term/12 * balance * 0.003); // 0.003);
						break;
						case 36:
						interest = (term/12 * balance * 0.05); // 0.05);
						break;
						default:
						JOptionPane.showMessageDialog(null,"Your term length needs to one of 12 or 24 or 36");
					}

			}

		}

		// get
		// return to the App class the interest in euro
		public double getInterest(){
				return  interest;
				}
}
