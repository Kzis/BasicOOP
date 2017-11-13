package Week9;

public class Triangle extends Shape{
    private double base;
    private double height;
    
    public Triangle(double base, double height){
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public String getInfo() {
        return name + " (base = " + base + ", height = " + height + ")";
    }
    
}
