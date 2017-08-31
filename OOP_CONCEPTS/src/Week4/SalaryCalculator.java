package Week4;

import java.text.DecimalFormat;

public class SalaryCalculator {
		
	
	public static String calculate(Double salary){
		
		DecimalFormat decimalPoints2 = new DecimalFormat(".##");
		
		String newSalary = decimalPoints2.format((salary * 0.07 + salary));
		
		return newSalary;
	}
	
}
