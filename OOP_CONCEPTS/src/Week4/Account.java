package Week4;

public class Account {
	
	//Data Member
	private String ownerName;
	private double balance;
	
	public final static String TAX = "0.07";
	public static final String TTT = "0.07";
	
	//Constructor
	public Account() {
		this.ownerName = "Unassign";
		this.balance = 0.0;
	}
	
	//Get & Set Method
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Methdo Process
	public void add(double amt) {
		balance = balance + amt;
	}
	
	public void deduct(double amt) {
		balance = balance - amt;
	}

}
