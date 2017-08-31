package Week4;

import Utils.DemoUtils;

public class TriangleCalculator {
	
	double x1;
	double y1;
	
	double x2;
	double y2;
	
	double x3;
	double y3;
	
	double perimeter;

	public TriangleCalculator(double x1, double y1, double x2, double y2,double x3, double y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	public double getX3() {
		return x3;
	}

	public void setX3(double x3) {
		this.x3 = x3;
	}

	public double getY3() {
		return y3;
	}

	public void setY3(double y3) {
		this.y3 = y3;
	}

	public double getPerimeter() {
		
		//Result1 : Point1 --> Point2
		double result1 = DemoUtils.calDistanceBetweenTwoPoint(x2, y2, x1, y1);
		
		//Result2 : Point2 --> Point3
		double result2 = DemoUtils.calDistanceBetweenTwoPoint(x3, y3, x2, y2);
				
		//Result3 : Point3 --> Point1
		double result3 = DemoUtils.calDistanceBetweenTwoPoint(x1, y1, x3, y3);
		
		this.perimeter = (result1+result2+result3);
		
		return perimeter;
	}

}
