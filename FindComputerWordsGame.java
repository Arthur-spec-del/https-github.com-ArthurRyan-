// Arthur Ryan 20170386
// TABA Software Dev NCI-HDAIML

import javax.swing.JOptionPane;
import java.lang.Math;
import java.lang.*;
import java.util.Random;


public class FindComputerWordsGame{

		//declare vars
		private String playerWord;
		private String validatedWord;
		private StringBuffer strBuff;
		private StringBuffer strBuffmatch;
		private StringBuffer strBuffvalidatedWord;
		private String matchedWord;
		private int validatedWordlength;
		private int inputLength;
		private double player1Points;
		private double player2Points;
		private int matchedWordlength;
		private int roundsNumber;
		private int roundsLimit = 4;
		private int playerNumber;
		private int wordCompareperformed;
		private int illegalCharacter = 0;


		//constructor
		public FindComputerWordsGame(){

		roundsNumber = 1;
		player1Points = 0;
		player2Points = 0;
		matchedWord = "";
		illegalCharacter = 0;

		strBuff=new StringBuffer();

		strBuffmatch =new StringBuffer();

		JOptionPane.showMessageDialog(null,"Welcome to 'Find Computer Words Game'.  The Rules are a) 1 point per letter for words greater than a length of 5, b) 0.75 points per letter for words of length 5 or less");
		}

		//set
		public void setWord(String playerWord){
		this.playerWord=playerWord;
		// JOptionPane.showMessageDialog(null,"From Set Block Player1 Word in Set Block  = " + player1Word);
		}

		//compute/process
		public void compute(){
			}


		public void requestWord(int roundsNumber, int playerNumber){
		String[] alphabet={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
				for(int i=0;i<26;i++){
					alphabet[i]=alphabet[i].toUpperCase();
		}

		Random rnd = new Random();

		JOptionPane.showMessageDialog(null,"Round Number " + roundsNumber
		+ "  Player" + playerNumber
		+ " From the 12 randomly choosen letter from the alphabet displayed here '"
		+ alphabet[rnd.nextInt(25)] + alphabet[rnd.nextInt(25)] + alphabet[rnd.nextInt(25)] + alphabet[rnd.nextInt(25)]
		+ alphabet[rnd.nextInt(25)] + alphabet[rnd.nextInt(25)] + alphabet[rnd.nextInt(25)] + alphabet[rnd.nextInt(25)]
		+ alphabet[rnd.nextInt(25)] + alphabet[rnd.nextInt(25)] + alphabet[rnd.nextInt(25)] + alphabet[rnd.nextInt(25)]
		+ "' try to form the largest word you can manage");
		}

		// *** Validation method - player 1
		public void wordValidator(String playerWord, int playerNumber){

				// load the valid 100 word list to a String array
				String[] validWordsarray={"algorithm", "application", "backup", "bit", "buffer", "bandwidth", "broadband", "bug", "binary", "browser", "bus",
							"cache", "command", "computer", "cookie", "compiler", "cyberspace", "compress", "configure", "database",
							"digital", "data", "debug", "desktop", "disk", "domain", "decompress", "development", "download", "dynamic",
							"email", "encryption", "firewall", "flowchart", "file", "folder", "graphics", "hyperlink", "host", "hardware", "icon",
							"inbox", "internet", "kernel", "keyword", "keyboard", "laptop", "login", "logic", "malware", "motherboard", "mouse",
							"mainframe", "memory", "monitor", "multimedia", "network", "node", "offline", "online", "path", "process",
							"protocol", "password", "phishing", "platform", "program", "portal", "privacy", "programmer", "queue",
							"resolution", "root", "restore", "router", "reboot", "runtime", "screen", "security", "shell", "snapshot", "spam",
							"screenshot", "server", "script", "software", "spreadsheet", "storage", "syntax", "table", "template", "thread",
							"terminal", "username", "virtual", "virus", "web", "website", "window", "wireless"};

				// check length of player1 input word
				inputLength=playerWord.length();

				// error message in the case the player enters more than 12 characters
				if(inputLength > 12){
						JOptionPane.showMessageDialog(null,"Player1 input more than 12 letters!!");
				}


				// check if player input is of length 12 and under ie as per the rules
				if(inputLength <= 12){
				for(int i=0;i<inputLength;i++){
						if (playerWord.charAt(i)=='0' || playerWord.charAt(i)=='1' || playerWord.charAt(i)=='2' || playerWord.charAt(i)=='3'
						|| playerWord.charAt(i)=='4' || playerWord.charAt(i)=='5' || playerWord.charAt(i)=='6' || playerWord.charAt(i)=='7'
						|| playerWord.charAt(i)=='8' || playerWord.charAt(i)=='9' || playerWord.charAt(i)=='!' || playerWord.charAt(i)=='"'
						|| playerWord.charAt(i)=='£' || playerWord.charAt(i)=='$' || playerWord.charAt(i)=='%' || playerWord.charAt(i)=='^'
						|| playerWord.charAt(i)=='&' || playerWord.charAt(i)=='*' || playerWord.charAt(i)=='(' || playerWord.charAt(i)==')'
						|| playerWord.charAt(i)=='_' || playerWord.charAt(i)=='+' || playerWord.charAt(i)=='-' || playerWord.charAt(i)=='='
						|| playerWord.charAt(i)=='¬' || playerWord.charAt(i)==' ')
					illegalCharacter = 1;
					}
				}

				if(illegalCharacter == 1){
						JOptionPane.showMessageDialog(null, "Word entry must be a letter ie either upper or lower case letter, no numbers or special characters");
						illegalCharacter = 0;
				}

				// check if player input is of length 12 and under ie as per the rules
				if(inputLength <= 12){

				// traverse the play1Word from left to right to check that it contains Only latin alphabet letters, either lower or upper case
				for(int i=0;i<inputLength;i++){
						if(playerWord.charAt(i)=='a' || playerWord.charAt(i)=='A' || playerWord.charAt(i)=='b' || playerWord.charAt(i)=='B'
						|| playerWord.charAt(i)=='c' || playerWord.charAt(i)=='C' || playerWord.charAt(i)=='d' || playerWord.charAt(i)=='D'
						|| playerWord.charAt(i)=='e' || playerWord.charAt(i)=='E' || playerWord.charAt(i)=='f' || playerWord.charAt(i)=='F'
						|| playerWord.charAt(i)=='g' || playerWord.charAt(i)=='G' || playerWord.charAt(i)=='h' || playerWord.charAt(i)=='H'
						|| playerWord.charAt(i)=='i' || playerWord.charAt(i)=='I' || playerWord.charAt(i)=='j' || playerWord.charAt(i)=='J'
						|| playerWord.charAt(i)=='k' || playerWord.charAt(i)=='K' || playerWord.charAt(i)=='l' || playerWord.charAt(i)=='L'
						|| playerWord.charAt(i)=='m' || playerWord.charAt(i)=='M' || playerWord.charAt(i)=='n' || playerWord.charAt(i)=='N'
						|| playerWord.charAt(i)=='o' || playerWord.charAt(i)=='O' || playerWord.charAt(i)=='p' || playerWord.charAt(i)=='P'
						|| playerWord.charAt(i)=='q' || playerWord.charAt(i)=='Q' || playerWord.charAt(i)=='r' || playerWord.charAt(i)=='R'
						|| playerWord.charAt(i)=='s' || playerWord.charAt(i)=='S' || playerWord.charAt(i)=='t' || playerWord.charAt(i)=='T'
						|| playerWord.charAt(i)=='u' || playerWord.charAt(i)=='U' || playerWord.charAt(i)=='v' || playerWord.charAt(i)=='V'
						|| playerWord.charAt(i)=='w' || playerWord.charAt(i)=='W' || playerWord.charAt(i)=='x' || playerWord.charAt(i)=='X'
						|| playerWord.charAt(i)=='y' || playerWord.charAt(i)=='Y' || playerWord.charAt(i)=='z' || playerWord.charAt(i)=='Z')

						// as each character in the string of the player input word is validated as being from the alphabet then add it to the string buffer carialbe called strBuff
						strBuff.append(playerWord.charAt(i));
						}
				}


				// add validation for numbers ie screening out numbers / may be a ! clause ie to cover special characters as well

				// convert strBuff to standard string variable type and assign to validatedWord
				validatedWord=strBuff.toString();
				// measure and record the length of the validateWord
				validatedWordlength=validatedWord.length();
				// clear the string buffer variable strBuff by calling the delete method
				strBuff.delete(0,validatedWordlength);



				// call wordCompare method (see line 119 for that method specification)
				wordCompare(validatedWord, validWordsarray, validatedWordlength, playerNumber); // calls comparison
		}

				// *** Method - wordCompare ie to compare the validated player entry with the offical array of 100 valid words
				// compare validated word with array of 100 approved valid words and allocat points based on being a match and also the word length
				public void wordCompare(String validatedWord, String[] validWordsarray, int validatedWordlength, int playerNumber){
									// traverse the array of 100 valid offical game words
								wordCompareperformed = 0;
								matchedWord = "";
								if(playerNumber == 1){
										for(int j=0;j<100;j++){
												// check if the player validated word is equal to one of the 100 offical valid game words in the array
												if(validatedWord.equals(validWordsarray[j])){
														// if there is a match, then record the word that was matched
														matchedWord = validWordsarray[j];
														// points calculation - calculate the points as per the rules
														matchedWordlength = matchedWord.length();
														if(matchedWordlength > 5){
																// sum the points, cumulatively
																player1Points = player1Points + matchedWordlength;
																}
														else if(matchedWordlength <= 5) {
																// sum the points, cumulatively
																player1Points = player1Points + (5 * 0.75);
																}
													}
										}
								}


								if(playerNumber == 2){
								for(int j=0;j<100;j++){
												// check if the player validated word is equal to one of the 100 offical valid game words in the array
												if(validatedWord.equals(validWordsarray[j])){
														// if there is a match, then record the word that was matched
														matchedWord = validWordsarray[j];
														// points calculation - calculate the points as per the rules
														matchedWordlength = matchedWord.length();
														if(matchedWordlength > 5){
																// sum the points, cumulatively
																player2Points = player2Points + matchedWordlength;
																}
														else if(matchedWordlength <= 5) {
																// sum the points, cumulatively
																player2Points = player2Points + (5 * 0.75);
																}
													}

									}
								}
								wordCompareperformed = 1;
			}


		//get
		// return the validatedWord
		public String getOutputvalidated(){ // return
				return validatedWord;
		}

		public String getOutputmatched(){ // return
				// return the matchedWord
				return matchedWord;
		}

		public double getPlayer1points(){ // return
				// return the player1 points scored
				return player1Points;
		}

		public double getPlayer2points(){ // return
				// return the player2 points scored
				return player2Points;
		}

		public int getWordcomparePerformed(){ // return
				// return whether Comparison method ran ie to know if all rounds of the game have completed
				return wordCompareperformed;
			}

}