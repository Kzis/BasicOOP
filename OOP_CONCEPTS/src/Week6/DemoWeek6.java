package Week6;

import java.util.Scanner;

import Utils.InputUtil;

public class DemoWeek6 {

	/**
	 * เขียนโปรแกรม Discount Calculator เพื่อคำนวณหาส่วนลดในการซื้อเมล็ดกาแฟ
	 * โดยมีราคาถุงละ $5.50 และเปอเซนต์ส่วนลดจะปรับเปลี่ยนตามจำนวนถุงที่ซื้อตามตาราง
	 * 
	 * Order Volume		Discount
	 * >= 25 bags		5% of total price
	 * >= 50 bags		10% of total price
	 * >= 100 bags		15% of total price
	 * >= 150 bags		20% of total price
	 * >= 200 bags		25% of total price
	 * >= 300 bags		30% of total price
	 * 
	 * โดยโปรแกรมจะรับค่าจำนวนที่ซื้อ และแสดงผลจำนวนที่ซื้อราคาเต็ม , เปอเซนต์ส่วนลด , ส่วนลด และ ราคาสุทธิ
	 */
	public static void discountCalculator(){
		
		Scanner sc = new Scanner(System.in);
		
		String bags = InputUtil.getValue(sc, "buy volume(bags)");
	
		CoffeeBean coffeeBean = new CoffeeBean(bags);
		coffeeBean.discountCalculator();
		
	}
	
	/**
	 * เขียน Student Class เพื่อเก็บข้อมูลรหัสนักศึกษา และชื่อ โดย Student Class 
	 * จะต้องสามารถแสดงผลชั้นปีของนักศึกษาได้ (กำหนดให้ใช้ enum constants ใน Student Classs)
	 */
	public static void testStudentClass(){
		
		Student s1 = new Student("580010", "Anne");
		Student s2 = new Student("570010", "John");
		Student s3 = new Student("600010", "Jane");
		
		System.out.println(s1.getName() + " is " + s1.getStringLevel() + " ( " + s1.getLevel() + " ) ");
		System.out.println(s2.getName() + " is " + s2.getStringLevel() + " ( " + s2.getLevel() + " ) ");
		System.out.println(s3.getName() + " is " + s3.getStringLevel() + " ( " + s3.getLevel() + " ) ");
		
	}
	
	/**
	 * เขียนโปรแกรม Area Calculator เพื่อคำนวณหาพื้นที่ของรูปเรขาคณิตแบบต่างๆ
	 * โดยโปรแกรม จะต้องแสดงเมนูให้เลือกว่า จะคำควณหาพื้นที่ของ รูปเรขาคณิตชนิดใด
	 * และมีเมนูให้เลือกเพื่อจบการทำงานของโปรแกรม 
	 */
	public static void areaCalculator(){
		
		while(true){
			
			AreaCalculator.printMenu();
			
			System.out.print("Input Comman (Number of menu) : ");
			Scanner scanner = new Scanner(System.in);
			int command = scanner.nextInt();
			scanner.close();
			
			if(command == AreaCalculator.MENU_QUIT){
				break;
			}
			
			AreaCalculator.doCommand(command);
			
		}
		
	}
	
}
