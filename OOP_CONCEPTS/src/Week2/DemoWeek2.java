package Week2;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import Utils.InputUtil;

public class DemoWeek2 {
	
	/**
	 * 2.Write Simple Program
	 * เขียนโปรแกรมเพื่อแสดงผลวัน - เวลาปัจจุบัน ในรูปแบบ
	 * 1. Wed Aug 12 06:05 AM
	 * 2. 12 August 2015 [23.05]
	 * 3. 23:05:42 and 534 ms
	 */
	public static void testSimpleDateFormat(){
		
		//1.Wed Aug 12 06:05 AM
		Date today = new Date();
		System.out.println("TODAY : " + today);
		
		//2.2 August 2015 [23.05]
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy [HH.mm]" , new Locale("en","En"));
		String todayDDMMYYYY = sdf.format(today);
		
		System.out.println("TODAY(dd/MMMM/yyyy [HH.mm]) : " + todayDDMMYYYY);
		
		//3.23:05:42 and 534 ms
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss" , new Locale("en","En"));
		SimpleDateFormat sdf3 = new SimpleDateFormat("ms" , new Locale("en","En"));
		String todayHHMMSS = sdf2.format(today);
		String todayMS = sdf3.format(today);
		
		System.out.println("TODAY(HH:mm:ss and ms) : " + todayHHMMSS + " and " + todayMS + " ms ");
	}
	
	/**
	 * 3.Write Simple Program
	 * เขียนโปรแกรมเพื่อรับข้อมูล first name , middle name , last name 
	 * จากนั้นให้แสดงผล output เป็นตัวอักษรแรกของ first name , middle name , last name 
	 * มาเรียงต่อกัน โดยจะต้องแสดงผลเปนตัวพิมพ์ใหญ่
	 * Example Input : john winston lennon 
	 * Example Output : JWL
	 */
	public static void firstUppercaseName(){
		
		String words = InputUtil.getValue();
		
		String[] wordsArr = words.split(" ");
		
		String firstWords = "";
		
		System.out.print("New words : ");
		
		for(int i = 0; i < wordsArr.length; i++){
			
			firstWords = wordsArr[i].substring(0,1).toUpperCase();
			
			System.out.print(firstWords);
			
		}
		
	}
	
	/**
	 * 4.Write Simple Program
	 * เขียนโปรแกรมเพื่อรับข้อมูลเป็นประโยคเข้ามาเป็น input จากนั้นให้แสดงผล output 
	 * เป็นการเรียง input แบบกลับหลัง 
	 * Hint : ใช้ for loop แล้ว substring มาเรียงใหม่ทีละตัวอักษร
	 */
	public static void reverseWords(){
		
		String words = InputUtil.getValue();
		
		System.out.print("Reverse words : ");
		
		for(int i = words.length(); i > 0; i--){
			System.out.print(words.substring(i-1,i));
		}
		
	}
	
	/**
	 * ให้แนะนำตัว ส่ง Email
	 */
	public static void Assigment1(){
		
	}
	
	/**
	 * เขียนโปรแกรมเพื่อรับข้อมูลเป็นประโยคเข้ามาเป็น input จากนั้นให้แสดงผล output 
	 * โดยทุกคำจะต้องเรียงติดกัน โดยที่ทุกคำจะต้องเรียงติดกันโดยไม่มี space คั่นระหว่างคำ
	 * และ ตัวอักษรตัวแรกของแต่ละคำจะต้องเป็นตัวพิมพ์ใหญ่
	 * Hint : 	ใช้ method split() ใน class String 
	 * 			เพื่อตัดแต่ละคำมาเก็บไว้ใน String array 
	 */
	public static void Assigment2(){
		
		String words = InputUtil.getValue();
		
		String[] wordsArr = words.split(" ");
		
		String firstWords = "";
		String otherWords = "";
		
		System.out.print("New words : ");
		
		for(int i = 0; i < wordsArr.length; i++){
			
			firstWords = wordsArr[i].substring(0,1).toUpperCase();
			otherWords = wordsArr[i].substring(1).toLowerCase();
			
			System.out.print(firstWords+otherWords);
			
		}
		
	}

}
