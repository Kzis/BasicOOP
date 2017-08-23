package Week3;

import java.util.Scanner;

import Utils.DemoUtils;
import Utils.InputUtil;

public class DemoWeek3 {
	
	/**
	 * Hint 1 	: ใช้สูตรคำนวฯหาระยะห่างของจุดทั้งสอง
	 * 			: d = sqrt( (x2-x1)^2 + (y2-y1)^2 )
	 * 
	 * Hint 2 	: ข้อมูลที่ใช้ทดสอบ A(0,0) , B(3,0) , C(3,4) จะต้องได้ค่าเส้นรอบรูปเป็น 12
	 */
	public static void Assigment1(){
		int x1 = 0;
		int y1 = 0;
		int x2 = 3;
		int y2 = 0;
		int x3 = 3;
		int y3 = 4;
		
		double result1 = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		double result2 = Math.sqrt( Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2) );
		double result3 = Math.sqrt( Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2) );
		
		System.out.println("input x1 : " + x1);
		System.out.println("input y1 : " + y1);
		System.out.println("input x2 : " + x2);
		System.out.println("input y2 : " + y2);
		System.out.println("input x3 : " + x3);
		System.out.println("input y3 : " + y3);
		System.out.println("===================");
		System.out.println("result 1 : " + result1);
		System.out.println("result 2 : " + result2);
		System.out.println("result 3 : " + result3);
		System.out.println("Permiter of triangle : " + (result1+result2+result3));
				
	}
	
	/**
	 * เขียนโปรมแกรมเพื่อรับค่าพิกัดของจุด A(x1,y1) , B(x2,y2) , C(x3,y3)
	 * แล้วคำนวณหาความยาวของเส้นรอบรูปของสามเหลี่ยม ABC และแสดงผลโดยใช้ทศนิยมสองตำแหน่ง
	 * @throws Exception 
	 * @throws NumberFormatException 
	 */
	public static void Assigment2() throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		
		//Point1
		String x1 = InputUtil.getValue(scanner,"x1");
		String y1 = InputUtil.getValue(scanner,"y1");
		
		//Point2
		String x2 = InputUtil.getValue(scanner,"x2");
		String y2 = InputUtil.getValue(scanner,"y2");
		
		//Point3
		String x3 = InputUtil.getValue(scanner,"x3");
		String y3 = InputUtil.getValue(scanner,"y3");
		
		scanner.close();
		
		double result1 = 0;
		double result2 = 0;
		double result3 = 0;
		
		if(	DemoUtils.validateStringNumber(x2) && DemoUtils.validateStringNumber(x1)	
				&& DemoUtils.validateStringNumber(y2) && DemoUtils.validateStringNumber(y1)	){
			
			//Result1 : Point1 --> Point2
			result1 = DemoUtils.calDistanceBetweenTwoPoint(Double.parseDouble(x2), 
													Double.parseDouble(y2), 
													Double.parseDouble(x1), 
													Double.parseDouble(y1)
												);
		}
		
		if(	DemoUtils.validateStringNumber(x3) && DemoUtils.validateStringNumber(x2)	
				&& DemoUtils.validateStringNumber(y3) && DemoUtils.validateStringNumber(y2)	){
				
			//Result2 : Point2 --> Point3
			result2 = DemoUtils.calDistanceBetweenTwoPoint(Double.parseDouble(x3), 
													Double.parseDouble(y3), 
													Double.parseDouble(x2), 
													Double.parseDouble(y2)
												);
		}
		
		
		if(	DemoUtils.validateStringNumber(x1) && DemoUtils.validateStringNumber(x3)	
				&& DemoUtils.validateStringNumber(y1) && DemoUtils.validateStringNumber(y3)	){
				
			//Result3 : Point3 --> Point1
			result3 = DemoUtils.calDistanceBetweenTwoPoint(Double.parseDouble(x1), 
													Double.parseDouble(y1), 
													Double.parseDouble(x3), 
													Double.parseDouble(y3)
												);
		}
		
		System.out.println("result 1 : " + result1);
		System.out.println("result 2 : " + result2);
		System.out.println("result 3 : " + result3);
		System.out.println("Permiter of triangle : " + (result1+result2+result3));
			
	}
		
}
