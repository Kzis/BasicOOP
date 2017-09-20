package Week5;

import Week4.DiceGame;

public class DemoWeek5 {

	/**
	 * เขียนโปรแกรมเพื่อสร้าง HiLoGame โดยการเล่นจะมีกติกา คือ ให้โยนลูกเต๋า 3 ลูก
	 * และ เอาแต้มของลูกเต๋าทั้งสามลูกมารวมกัน
	 * - ถ้าแต้มรวมสูงกว่า 11 ให้แสดงผลว่า High
	 * - ถ้าแต้มรวมเท่ากับ 11 ให้แสดงผลว่า 11 
	 * - ถ้าแต้มรวมน้อยกว่า 11 ให้แสดงผลว่า Low
	 * โดยให้แสดงแต้มของลูกเต๋าทั้ง 3 แต้มรวม และผลสูงต่ำดังนี้
	 * Ex.
	 * 3, 6, 6, [14], High
	 * 2, 4, 5, [11], 11
	 * 3, 3, 1, [7], Low
	 */
	public static void hiloGame(){
		
		DiceGame diceGame = new DiceGame();
		
		System.out.print("Output : " + diceGame.getResultString() + ", ["+ diceGame.getTotalResultString() +"],");
		
		if(Integer.parseInt(diceGame.getTotalResultString()) >= 11){
			System.out.println(" High");
		}else if(Integer.parseInt(diceGame.getTotalResultString()) == 11 ){
			System.out.println(" 11");
		}else{
			System.out.println(" Low");
		}
		
	}
	
	/**
	 * ให้เขียน Class Math2 โดยให้สร้าง method ดังนี้
	 * - long factorial(long x) : return ค่า factorial ของค่า x ใดๆ
	 * - int abs(int x) : return ค่า absolute ของค่า x ใดๆ
	 * โดยที่ Class Math2 จะต้องเอามาใช้กับ main() method ที่กำหนดให้โดยไม่เกิด error
	 * และต้องแสดงผลลัพธ์ได้ตามที่กำหนด
	 */
	public static void math2(){
		
		System.out.println("Factorail of 1 is : " + Math2.factorial(1));
		System.out.println("Factorail of 2 is : " + Math2.factorial(2));
		System.out.println("Factorail of 3 is : " + Math2.factorial(3));
		System.out.println("Factorail of 4 is : " + Math2.factorial(4));
		System.out.println("Factorail of 5 is : " + Math2.factorial(5));
		System.out.println("Factorail of 6 is : " + Math2.factorial(6));
		
		System.out.println("#########################################");
		
		System.out.println("Absolute of 100 is : " + Math2.abs(100));
		System.out.println("Absolute of -100 is : " + Math2.abs(-100));
		System.out.println("Absolute of 39 is : " + Math2.abs(39));
		System.out.println("Absolute of -39 is : " + Math2.abs(-39));
		System.out.println("Absolute of 1 is : " + Math2.abs(1));
		System.out.println("Absolute of -1 is : " + Math2.abs(-1));
		
	}
	
}
