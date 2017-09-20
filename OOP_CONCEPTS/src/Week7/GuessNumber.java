package Week7;

import Week4.MultiSidedDice;

public class GuessNumber {
	
	MultiSidedDice multiSidedDice;

	public GuessNumber() {
		this.multiSidedDice = new MultiSidedDice(1, 100);;
	}
	
	public int getResultString() {	
		return multiSidedDice.getRollValue();
	}
	
	public String checkNumber(int guessNumber , int userNumber, int i){
		
		if(userNumber > guessNumber){
			return "Too high";
		}else if(userNumber < guessNumber){
			return "Too low";
		}else{
			return "You win (answer = " + guessNumber + ")";
		}
		
	}

}
