package Week5;

public class Math2 {
	
	public static long factorial(long x){
		
		long result = 1;
		
		for(int i = 1; i<=x; i++){
			result = result * i;
		}
		
		return result;
	}
	
	public static int abs(int x){
		return (x < 0) ? (0-x):x ;
	}

}
