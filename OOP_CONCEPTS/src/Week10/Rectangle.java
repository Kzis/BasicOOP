package Week10;

public class Rectangle extends Shape{
    private double width;
    private double height;
    
    public Rectangle(double w, double h){
        super("rectangle");
        width = w;
        height = h;
    }
    
    public double getArea(){
        return width * height;
    }
    
    public String getInfo(){
        return name + "(width = " + width + ", height = " + height + ")";
    }
}
