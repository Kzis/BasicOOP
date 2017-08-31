package Week4;

public class DiceGame {
	
	String resultString;
	String totalResultString;
	MultiSidedDice multiSidedDice;
		
	public DiceGame() {
		this.multiSidedDice = new MultiSidedDice(1, 20);
	}
	
	public String getResultString() {
		
		this.resultString = multiSidedDice.getRollValue() + "," 
						+  multiSidedDice.getRollValue() + "," 
						+ multiSidedDice.getRollValue();
		
		return resultString;
	}

	public String getTotalResultString() {
		
		this.totalResultString = String.valueOf(
				 					Integer.parseInt(this.resultString.split(",")[0]) + 
				 					Integer.parseInt(this.resultString.split(",")[1]) + 
				 					Integer.parseInt(this.resultString.split(",")[2])
								);
		
		return totalResultString;
	}
	

}
