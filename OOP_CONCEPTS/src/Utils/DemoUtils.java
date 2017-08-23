package Utils;

public class DemoUtils {
	
	/**
	 * 
	 * @param x2 : axis x of destination point
	 * @param y2 : axis y of destination point
	 * @param x1 : axis x 0f original point
	 * @param y1 : axis y of original point
	 * @return distance between the two point
	 */
	public static double calDistanceBetweenTwoPoint(double x2 , double y2 , double x1 , double y1){
		
		double distance = Math.sqrt( (Math.pow( x2-x1 , 2)) + (Math.pow( y2-y1 , 2)) );
		
		return distance;
	}
	
	/**
	 * Validate String if compare then is number 
	 * @param number
	 * @return
	 */
	public static boolean validateStringNumber(String number) throws Exception{
		
		Double numberPoint;
		
		try {
			
			numberPoint = Double.parseDouble(number);
			
			if(numberPoint >= 0){
				return true;
			}else if(numberPoint < 0){
				return true;
			}else{
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}
			
	}

}
