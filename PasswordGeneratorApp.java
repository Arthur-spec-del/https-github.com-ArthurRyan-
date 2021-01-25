// x20170386 Arthur Ryan
// CA1 - question 2B - Password Generator App Class

import javax.swing.JOptionPane;

public class PasswordGeneratorApp{
	public static void main(String[] args){

		//vars
		String input;
		String output;
		String password;

		//object
		PasswordGenerator pg;
		pg=new PasswordGenerator();

		//input
		input=JOptionPane.showInputDialog(null,"Please enter your choice of password for processing to an encrypted version.");

		//set
		// sends the user's input string to the instangiable class
		pg.setInput(input);

		//compute
		// runs/activates the computing/processing code to generate the password in an encrypted form
		pg.computePassword();

		//get
		// sends a call to the instangialbe class to run the getPassword method which returns a string named password (ie the password in the encryped form)
		password=pg.getPassword();

		//output
		JOptionPane.showMessageDialog(null," '" + input +"' string -> Changed to Password '"+ password+ "'");
	}
}
