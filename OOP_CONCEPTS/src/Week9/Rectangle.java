package Week9;

public class Rectangle extends Shape{
    private double width;
    private double height;
    
    public Rectangle(double width, double height){
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        return width * height;
    }

    public String getInfo() {
        return name + " (width = " + width + ", height = " + height + ")";
    }
}
