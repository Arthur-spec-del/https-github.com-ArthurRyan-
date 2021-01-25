// x20170386 Arthur Ryan
// CA1 - question 1G - Interest Calculator App Class

import javax.swing.JOptionPane;
public class InterestCalculatorApp{
	public static void main(String[] args){


		// declare
		int term; // length of deposit period in whole months
		int access; // account type ie allows access before the end of the term or not
		double balance; // amount of money
		double interest; // holds the compute output ie what interest was earned in euro
		double interestEuro;; // holdds euro amount of interest

		// objects
		// declare object interestCal of class type InterestCalculator
		InterestCalculator interestCal;
		interestCal = new InterestCalculator();

		// input
		// get user input for term, balance, access prefence
		term = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your preferred length of deposit please"));
		balance = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your balance on deposit please"));
		access = (JOptionPane.showConfirmDialog(null,"Do you want access to your funds before the end of the deposit term?, enter 'y' for yes, or 'n' for no"));


		// set
		// transfer the values of the terms, balance and access preference to the instrangiable class
		interestCal.setTerm(term);
		interestCal.setBalance(balance);
		interestCal.setAccess(access);

		// process
		// instruct the instangiable class to run the computeInterest method ie to compute teh interest amount
		interestCal.computeInterest();

		// get
		// request and return the interest in euro from the instangiable class
		interestEuro = interestCal.getInterest();

		// output
		//print to screen the euro amount of the interest
		System.out.println("Your interest in Euro is " + interestEuro);
	}

}