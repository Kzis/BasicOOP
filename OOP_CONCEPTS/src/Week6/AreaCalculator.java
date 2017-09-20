package Week6;

public class AreaCalculator {
	
	public static final int MENU_TRIANGLE = 1;
	public static final int MENU_RECTANGLE = 2;
	public static final int MENU_CIRCLE = 3;
	public static final int MENU_QUIT = 4;
	
	public static void printMenu(){
		System.out.println(" ### SELECT SHAPE YOU WANT TO CALCULATE AREA ###");
		System.out.println(" # \t 1) TRIANGLE");
		System.out.println(" # \t 2) RECTANGLE");
		System.out.println(" # \t 3) CIRCLE");
		System.out.println(" # \t 4) QUIT");
		System.out.println(" ################################################");
	}

	public static void doCommand(int command) {

		switch (command) {
		case MENU_TRIANGLE:
			System.out.println("Calculate triangle area...");
			break;
		case MENU_RECTANGLE:
			System.out.println("Calculate rectangle area...");
			break;
		case MENU_CIRCLE:
			System.out.println("Calculate circle area...");
			break;
		default:
			System.out.println("Input error...");
			break;
		}
		
	}

}
