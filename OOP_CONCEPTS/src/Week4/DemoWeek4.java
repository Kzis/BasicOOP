package Week4;

import java.util.Scanner;

import Utils.InputUtil;

public class DemoWeek4 {
	
	/**
	 * เขียนโปรแกรมเพื่อสร้าง Class MultiSidedDice โดยโปรแกรมจะรับค่าที่เป็นช่วง ของค่าของหน้าลูกเต๋า
	 * และลูกเต๋าจะทอดออกมาได้ค่าในช่วงของค่าที่รับเข้ามาเท่านั้น โดยให้ได้ผลตามนี้
	 * 
	 * Output
	 * 	Enter min value : 1
	 *  Enter max value : 100
	 *  Output : 59
	 */
	public static void multiSidedDiceProgram(){
		
		Scanner sc = new Scanner(System.in);
		
		String minValue = InputUtil.getValue(sc, "min value");
		String maxValue = InputUtil.getValue(sc, "min value");
		
		//New Object  แบบที่ 1
		MultiSidedDice multiSidedDice = new MultiSidedDice(Integer.parseInt(minValue), Integer.parseInt(maxValue));
		System.out.println("Output : " + multiSidedDice.getRollValue());
		
		System.out.println("");
		System.out.println("### End Program Multi-Sided Dice Program : 1");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//New Object แบบที่ 2 
		MultiSidedDice multiSidedDice2 = new MultiSidedDice();
		multiSidedDice2.setMinValue(Integer.parseInt(minValue));
		multiSidedDice2.setMaxValue(Integer.parseInt(maxValue));
		
		System.out.println("Output : " + multiSidedDice.getRollValue());
		
		System.out.println("");
		System.out.println("### End Program Multi-Sided Dice Program : 2");
		
		
	}
	
	/**
	 * เขียนโปรแกรมเพื่อสร้าง Class DiceGame ให้ได้ผลตาม Output โดย DiceGame
	 * จะทำการทอดลูกเต๋า MultiSidedDice 3 ลูกพร้อมกัน โดยกำหนดว่าจะมีหน้าจาก 1-20
	 * โดยกำหนดให้ DiceGame มี Method ดังนี้
	 * 
	 * - String getResultString() : โดยจะ return String ที่เป็นค่าของหน้าลูกเต๋า เช่น "15,4,10"
	 * - String getTotalResultString() : โดยจะ return String ที่เป็นผลรวมของหน้าลูกเต๋าทั้ง 3 ลูกเช่น "29" 
	 * 
	 * Output
	 *  Output : 13,3,16
	 *  Total : 32
	 * 
	 */
	public static void diceGameProgram(){
			
		DiceGame diceGame = new DiceGame();
		
		System.out.println("Output : " + diceGame.getResultString());
		System.out.println("Total : " + diceGame.getTotalResultString());
		
	}
	
	/**
	 * เขียนโปรแกรมเพื่อสร้าง Class SalaryCalculator และ Class Employee
	 * เพื่อคำนวณหาเงินเดือนใหม่ของ Employee โดยเงินเดือนจะเพิ่มขึ้นจากเงินเดือนเดิม 7%
	 * โดยกำหนดให้ Employee มีข้อมูลคือชื่อ และ เงินเดือน
	 * โดยกำหนดให้ Employee มี 2 คน คือ
	 * - John เงืนเดือน 10,000
	 * - Jack เงินเดือน 15,000
	 */
	public static void salaryCalculatorProgram(){
		
		Employee employee1 = new Employee("John", 10000.0);
		Employee employee2 = new Employee("Jack", 15000.0);
		
		System.out.println(employee1.getName() 
				+ " new salary is: " 
				+ SalaryCalculator.calculate(employee1.getSalary())
				+ " [" + employee1.getSalary() + "]"
				);
		System.out.println(employee2.getName() 
				+ " new salary is: " 
				+ SalaryCalculator.calculate(employee2.getSalary())
				+ " [" + employee2.getSalary() + "]"
				);
		
	}
	
	/**
	 * ให้เขียนโปรแกรมตามโจทย์ Assignment3 โดยให้เขียนในรูปแบบของ Class ที่ใช้ในการคำนวณ
	 * โดยกำหนดให้ Class ชื่อ TriangleCalculator และใน Class นี้จะต้องมี data member
	 * เป็นค่า x1,y1,x2,y2,x3,y3 และมี method ที่ return ค่าความยาวของเส้นรอบรูปของสามเหลี่ยมชื่อว่า getPerimeter()
	 * โดย return ค่าออกมาเป็น double
	 */
	public static void calculatePerimeter(){
		
		TriangleCalculator triangleCalculator = new TriangleCalculator(0, 0, 3, 0, 3, 4);
		System.out.println("Permiter of triangle : " + triangleCalculator.getPerimeter());
		
	}

}
