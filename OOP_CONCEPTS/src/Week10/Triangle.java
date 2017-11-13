package Week10;

public class Triangle extends Shape{
    private double base;
    private double height;
    
    public Triangle(double b, double h){
        super("triangle");
        base = b;
        height = h;
    }
    
    public double getArea() {
        return 0.5 * base * height;
    }

    public String getInfo() {
        return name + "(base = " + base + ", height = " + height + ")";
    }
    
}
