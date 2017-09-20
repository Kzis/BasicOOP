package Week7;

import java.util.Random;
import java.util.Scanner;

public class DemoWeek7 {

	/**
	 * เขียนโปรแกรม Guess Number Game ซึ่งเป็นเกมทายตัวเลข 
	 * โดยโปรแกรมจะสุ่มตัวเลขขึ้นมาหนึ่งตัว โดยมีค่าอยู่ในช่วง 1-100
	 * จากนั้นโปรแกรมจะรอรับค่าจาก user ให้ทายตัวเลขที่โปรแกรมสุ่มขึ้นมา
	 * 
	 * ถ้าค่าที่ user ทายสูงหรือต่ำกว่าตัวเลขที่โปรแกรมสุ่มขึ้นมา โปรแกรมก็จะ
	 * แสดงผลว่า "Too High" หรือ "Too Low" ตามลำดับ
	 * 
	 * แต่ละเกม user จะทายได้ 6 ครั้ง ถ้าทายไม่ถูกก็จะแสดงผลว่า "Game over"
	 * ถ้าทายถูกก็จะแสดงผลว่า "You win" จากนั้น โปรแกรมก็จะขึ้นข้อความถามว่า
	 * จะเล่นเกมใหม่อีกคัร้งหรือไม่
	 */
	public static void guessNumberGame(){
		
		GuessNumber guessNumber = new GuessNumber();
		int number = guessNumber.getResultString();
		int userNumber = 0;
		int i = 0;
		String result = "";
		
		while(true){
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Input Answer : ");
			userNumber = sc.nextInt();
			
			result = guessNumber.checkNumber(number, userNumber,i);
			
			if( i != 6){
				System.out.println(result);
			}else{
				if( !(result.substring(0, 2).equals("You")) ){
					System.out.println("Game over (answer =" + number +")");
				}
				
				System.out.print("Play new game? (y/n)");
				result = sc.nextLine();
				
				if(result.equals("y")){
					continue;
				}else{
					break;
				}
			}
			
			i++;
			
		}
		
	}
	
}
