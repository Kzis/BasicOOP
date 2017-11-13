package Week10;

public class Lab10 {

    public static void main(String[] args) {
        Shape t = new Triangle(10, 10);
        Shape c = new Circle(10);
        Shape r = new Rectangle(10, 10);
        
        printArea(t);
        printArea(r);
        printArea(c);
        
        System.out.println("==================");
        
        Printable p1 = t;
        Printable book1 = new Book("1234", "Math101");
        
        p1.display();
        book1.display();
    }
    
    public static void printArea(Shape s){
        System.out.println("Area of " + s.getInfo() + "\n = " + s.getArea() + "\n");
    }
}
