package MainClass;

import java.util.Scanner;

public class HomeWorkIce {
	
	private static String TAB = "\t";
	
	public static void main(String[]args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number of H5N1 at Begining : ");
		
		String H5N1 = scanner.nextLine();
		
		System.out.println("");
		System.out.println("Minute" + TAB + "Begin" + TAB + "net");
		
		int begin = Integer.parseInt(H5N1);
		int net = Integer.parseInt(H5N1) * 3;
		
		for(int i = 0; i>=0; i++){
			
			System.out.println(i + TAB + begin + TAB + net);
			
			begin = net;
			net = net*3;
			
			if(net >= 1000000){
				System.out.println((i+1) + TAB + begin + TAB + net);
				break;
			}
		}
		
	}

}
