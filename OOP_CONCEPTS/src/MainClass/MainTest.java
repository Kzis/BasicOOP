package MainClass;

import ExamMidTerm.DemoExam;

public class MainTest {
	
	private static final String TAB = "\t";

	public static void main(String[]args) throws Exception{
		
		//พนักงาน 
		
		int workDay = 20;
		double salary = 70000;
		
		DemoExam demoExam = new DemoExam();
		
		System.out.println("==========  Employee 1 ==========");
		System.out.println("Working Day" + TAB + " : " + TAB + workDay );
		System.out.println("Salary" + TAB + TAB + " : " + TAB + salary );
		System.out.println("Balance" + TAB + TAB + " : " + TAB + demoExam.getBalance(workDay) );
		System.out.println("Commission"  + TAB + " : " + TAB + demoExam.getCommision(salary) );
		System.out.println("Net Amount"  + TAB + " : " + TAB + demoExam.getNetAmount(workDay, salary));
	}

}
