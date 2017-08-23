package Utils;

import java.util.Scanner;

public class InputUtil {
	
	/**
	 * Method for get 1 words in lines
	 * @return : String input
	 */
	public static String getValue(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input words : ");
		String words = scanner.nextLine();
		
		System.out.println("Your input : " + words);
		
		scanner.close();
		
		return words;
	}

	/**
	 * 
	 * @param wordsInput : String value
	 * @return
	 */
	public static String getValue(Scanner sc ,String wordsInput){
		
		Scanner scanner = sc;
		System.out.print("Input " + wordsInput + " : ");
		String words = scanner.nextLine();
				
		return words;
	}

}
