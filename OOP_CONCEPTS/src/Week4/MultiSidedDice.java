package Week4;

import java.util.Random;

public class MultiSidedDice {
	
	int minValue;
	int maxValue;
	int rollValue;
	
	//Constructor แบบที่1
	public MultiSidedDice(int minValue, int maxValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
	
	//Constructor แบบที่2
	public MultiSidedDice() {
		//
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getRollValue() {
		Random random = new Random();
		this.rollValue = random.nextInt(getMaxValue() + 1 - getMinValue()) + getMinValue();
		return rollValue;
	}

}
