package Week4;

public class Bicycle {
	
	private String ownerName;
	private String xxx;
		
	//แบบที่ 1
	public Bicycle() {
		ownerName = "namee ";
		xxx = "sdsdsdfsdfsdfsdfwqerwerwer";
	}
	
//	public Bicycle(int x) {
//		ownerName = "namee ";
//		xxx = "sdsdsdfsdfsdfsdfwqerwerwer";
//	}
	
	//แบบที่ 2
//	public Bicycle(String name) {
//		ownerName = name;
//		xxx = "sdsdsdfsdfsdfsdfwqerwerwer";
//	}
	
	//แบบที่ 3
//	public Bicycle(String ownerName , String xxx) {
//		//Use this for set
//		this.ownerName = ownerName;
//		this.xxx = xxx;
//	}
	
	//แบบที่ 4
//	public Bicycle(String ownerName) {
//		//Call Setter
//		setOwnerName(ownerName);
//		setXxx("This is xxx");	
//	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String name) {
		ownerName = name;
	}

	public String getXxx() {
		return xxx;
	}

	public void setXxx(String xxx) {
		this.xxx = xxx;
	}

}
