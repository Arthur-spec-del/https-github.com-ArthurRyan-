// Arthur Ryan 20170386
// TABA Software Dev NCI-HDAIML

import javax.swing.JOptionPane;

public class FindComputerWordsGameApp{

public static void main(String[] args){

		//declare vars
		String playerWord;
		String validatedWord;
		String strBuffmatch;
		String matchedWord;
		int roundsNumber = 1;
		int roundsLimit = 4;
		double player1Points;
		double player2Points;
		int wordCompareperformed = 0;
		int anotherRound;

		FindComputerWordsGame game = new FindComputerWordsGame();

		//constructor

while (roundsNumber < roundsLimit){

for (int playerNumber=1; playerNumber < 3; playerNumber++){ // increments number of rounds

		// input
		game.requestWord(roundsNumber, playerNumber);
		playerWord = (JOptionPane.showInputDialog(null, "Round Number " + roundsNumber + "  Player" + playerNumber + " Please enter your word (up to 12 letters long) made up from/using the 12 letters just presented"));

		JOptionPane.showMessageDialog(null, "Player"+ playerNumber +"'s word is = '" + playerWord + "'");

		//set
		game.setWord(playerWord);

		//compute/process
		game.compute();
		game.wordValidator(playerWord, playerNumber);


		//get
		validatedWord=game.getOutputvalidated();
		matchedWord=game.getOutputmatched();
		player1Points=game.getPlayer1points();
		player2Points=game.getPlayer2points();
		wordCompareperformed=game.getWordcomparePerformed();

		//output
		// Player1 display output
		if(playerNumber == 1){
			if(matchedWord != ""){
				JOptionPane.showMessageDialog(null, "Player"+ playerNumber + " - you are correct!/Player" + playerNumber + "'s word Matched the dictionary and are = "
				+ matchedWord + " and Player" + playerNumber + "'s score is = " + player1Points);
		}

			else if(playerNumber == 1 && matchedWord == ""){
				JOptionPane.showMessageDialog(null, "Player" + playerNumber + " - no Match this round, but your score is still = " + player1Points);
			}
		}

		// Player2 display output
		if(playerNumber == 2){
			if(matchedWord != ""){
				JOptionPane.showMessageDialog(null, "Player"+ playerNumber + " - you are correct!/Player" + playerNumber + "'s word Matched the dictionary and are = "
				+ matchedWord + " and Player" + playerNumber + "'s score is = " + player2Points);
		}

			else if(matchedWord == "" && playerNumber == 2){
				JOptionPane.showMessageDialog(null, "Player" + playerNumber + " - no Match this round, but your score is still = " + player2Points);
			}
		}



		// display the game results only if all rounds played and both players have also played the final round and a word comparison has happened
		if (roundsNumber == roundsLimit - 1 && playerNumber == 2 && wordCompareperformed == 1){
					if (player1Points > player2Points){
						JOptionPane.showMessageDialog(null, "Congratulations Player1 - you have Won the game, your points are " + player1Points + " versus Player2, who had " + player2Points);
						}
					if (player2Points > player1Points){
						JOptionPane.showMessageDialog(null, "Congratulations Player2 - you have Won the game, your points are " + player2Points + " versus Player1, who had " + player1Points);
						}
					if (player1Points == player2Points){
						JOptionPane.showMessageDialog(null, "Congratulations to both Player1 and Player2 you have achieved the same points, Player1 your points are " + player1Points + " versus Player2, who had " + player2Points);
						}
		}

	} // closes for loop on playerNumber

roundsNumber = roundsNumber + 1; // increments number of rounds

if(roundsNumber < roundsLimit){
anotherRound = JOptionPane.showConfirmDialog(null, "Would you like to play another round of the game 'Find the Word'?");
if (anotherRound == 0){
	// continue the game
	}
else if (anotherRound == 1){
	// end the game
	break;
	}
else{
	// continue the game
	}
}



} // closes while loop

} // closes public static void main

} // closes public class

