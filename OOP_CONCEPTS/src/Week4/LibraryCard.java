package Week4;

public class LibraryCard {

	//Date Member
	private Student owner;
	private int borrowCnt;

	//Constructor
	public LibraryCard() {
		this.owner = null;
		this.borrowCnt = 0;
	}
	
	//Get & Set Methods
	public Student getOwner() {
		return owner;
	}

	public void setOwner(Student owner) {
		this.owner = owner;
	}

	public int getNumberOfBooks() {
		return borrowCnt;
	}

	//Method Process
	public void checkOut(int numOgBooks){
		borrowCnt = borrowCnt + numOgBooks;
	}
	
	public String toString(){
		return "Owner Name : " + owner.getName() + "\n" +
				"Emial     : " + owner.getEmail() + "\n" + 
				"Books Borrowed: " + borrowCnt;
	}
}
