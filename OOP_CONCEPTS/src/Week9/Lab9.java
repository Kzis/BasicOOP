package Week9;

public class Lab9 {

    public static void main(String[] args) {
        Shape t = new Triangle(100, 10);
        Shape c = new Circle(10);
        Shape r = new Rectangle(10, 10);
        
        displayArea(t);
        displayArea(c);
        displayArea(r);
    }
    
    
    public static void displayArea(Shape s){
        System.out.println("Area of " + s.getInfo() + "\n= " + s.getArea());
    }
    
}
