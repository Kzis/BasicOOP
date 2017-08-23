package Week2;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import Utils.InputUtil;

public class DemoWeek2 {
	
	/**
	 * 2.Write Simple Program
	 * ��¹����������ʴ����ѹ - ���һѨ�غѹ ��ٻẺ
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
	 * ��¹����������Ѻ������ first name , middle name , last name 
	 * �ҡ�������ʴ��� output �繵���ѡ���á�ͧ first name , middle name , last name 
	 * �����§��͡ѹ �¨е�ͧ�ʴ���໹��Ǿ�����˭�
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
	 * ��¹����������Ѻ�������繻���¤������� input �ҡ�������ʴ��� output 
	 * �繡�����§ input Ẻ��Ѻ��ѧ 
	 * Hint : �� for loop ���� substring �����§������е���ѡ��
	 */
	public static void reverseWords(){
		
		String words = InputUtil.getValue();
		
		System.out.print("Reverse words : ");
		
		for(int i = words.length(); i > 0; i--){
			System.out.print(words.substring(i-1,i));
		}
		
	}
	
	/**
	 * ����йӵ�� �� Email
	 */
	public static void Assigment1(){
		
	}
	
	/**
	 * ��¹����������Ѻ�������繻���¤������� input �ҡ�������ʴ��� output 
	 * �·ء�Өе�ͧ���§�Դ�ѹ �·��ء�Өе�ͧ���§�Դ�ѹ������� space ��������ҧ��
	 * ��� ����ѡ�õ���á�ͧ���ФӨе�ͧ�繵�Ǿ�����˭�
	 * Hint : 	�� method split() � class String 
	 * 			���͵Ѵ���Ф��������� String array 
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
