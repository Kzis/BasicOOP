package Week10;

public class Circle extends Shape{
    private double radius;
    
    public Circle(double r){
        super("circle");
        radius = r;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public String getInfo() {
        return name + "(radius = " + radius + ")";
    }
      
}
