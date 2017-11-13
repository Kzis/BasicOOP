package Week9;

public class Circle extends Shape{
    private double radius;
    
    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getInfo() {
        return name + " (radius = " + radius + ")";
    }
}
