package ExamMidTerm;

public class DemoExam {
	
	/**
	 * 
	 * ให้หาเงินสุทธิ โดยเงินสุทธิเท่ากับเงิน Balance บวกกับเงิน Commission
	 * เงิน balance หาได้จากจำนวน วันที่ทำงาน x 500
	 * เงิน commission หาได้จาก เปอร์เซตน์ของเงินเดือน
	 * 
	 * ถ้า				เงินเดือน	<=	10,000	เงินคอมมิชชั่น 5% ของเงินเดือน
	 * 		10,000	<=	เงินเดือน	<= 	50,000	เงินคอมมิชชั่น 7% ของเงินเดือน
	 * 		50,000	<=  เงินเดือน	<=	100,000	เงินคอมมิชชั่น 15% ของเงินเดือน
	 * 
	 * โดยกำหนด Method ดังนี้
	 * 	1. double getBalance(int workDay)
	 * 	2. double getCommission(double salary)
	 *  3. double getNetAmount(int workDay,double salary)
	 * 
	 */
	

	double balance;
	double commission;
	double netAmount;
	
	private static final double COMMISSION_5_PERCENT = 0.05;
	private static final double COMMISSION_7_PERCENT = 0.07;
	private static final double COMMISSION_15_PERCENT = 0.15;
	
	/**
	 * ใช้สำหรับ Get Balance 
	 * โดย Balance = workDay * 500
	 * 
	 * @param workDay = จำนวนวันที่ทำงานใน 1 เดือน
	 * @return Balance
	 */
	public double getBalance(int workDay) {
		return workDay*500;
	}

	
	/**
	 * ใช้สำหรับ Get Commission
	 * 
	 * @param salary = เงินเดือน
	 * @return Commission
	 */
	public double getCommision(double salary) {
		
		if(salary <= 10000){
			
			this.commission = salary * COMMISSION_5_PERCENT;
			
		}else if(salary <= 50000){
			
			this.commission = salary * COMMISSION_7_PERCENT;
			
		}else if(salary <= 100000){
			
			this.commission = salary * COMMISSION_15_PERCENT;
			
		}else{
			this.commission = 0.0;
		}
		
		return commission;
	}

	public double getNetAmount(int workDay , double salary) {
		return getBalance(workDay) + getCommision(salary);
	}

	
}
