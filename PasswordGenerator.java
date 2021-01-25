// x20170386 Arthur Ryan
// CA1 - question 2B - Password Generator Instangiable Class

import javax.swing.JOptionPane;

public class PasswordGenerator{

	//declare vars
	private String input; // input string from user
	private int inputLength; // length of input string from user
	// private String output; //
	private StringBuffer strBuff; // java holding class for user input
	private int penultimateDigitlocation; // location in input string of the second from last digit
	private char penultimateDigit; // second from last digit of user input string
	private String password; // output string displayed back to user

	//constructor
	// generates the object strBuff of class type StringBuffer
	public PasswordGenerator(){
		strBuff=new StringBuffer();
	}

	//set
	// places the user input string into the instangiable class variable this.input
	public void setInput(String input){
		this.input=input;
	}

	//compute
	//computes the encrypted password using the penultimate character of the user string in placec of any consonants and removing any spaces
	public void computePassword(){
		inputLength=input.length();
		penultimateDigitlocation = inputLength - 2;// -2 beccause length is at -1 ie last digit so penultimate is at -2
		penultimateDigit = input.charAt(penultimateDigitlocation);
		// JOptionPane.showMessageDialog(null, "penultimatedigit = " + penultimateDigit + " at " + penultimateDigitlocation + " penultimateDigitlocation");

		//for(int i=input.length()-1;i>=0;i--){
		for(int i=0 ; i < input.length();i++){ // -1 removed after length
			// selects only consonants through listed both lower and upper case vowels(the shorter list) plus the digits 0 to 9
			if(input.charAt(i) != 'a' && input.charAt(i) != 'A' && input.charAt(i) != 'e' && input.charAt(i) != 'E' && input.charAt(i) != 'i' && input.charAt(i) != 'I'
				&& input.charAt(i) != 'o' && input.charAt(i) != 'O' && input.charAt(i) != 'u' && input.charAt(i) != 'U'
				&& input.charAt(i) != '0' && input.charAt(i) != '1'&& input.charAt(i) != '2'&& input.charAt(i) != '3'&& input.charAt(i) != '4'&& input.charAt(i) != '5'
				&& input.charAt(i) != '6'&& input.charAt(i) != '7'&& input.charAt(i) != '8'&& input.charAt(i) != '9'
				&& input.charAt(i) != ' '){
				strBuff.append(input.charAt(penultimateDigitlocation));
			}
			// removes spaces in the password
			else if (input.charAt(i) ==' '){
				strBuff.append("");
				}

			else {
				strBuff.append(input.charAt(i));
				}
		}

	password=strBuff.toString();

	}

	public String getPassword(){
			return password;
	}

}
