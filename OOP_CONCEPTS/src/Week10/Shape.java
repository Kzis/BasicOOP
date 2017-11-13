package Week10;

public abstract class Shape implements Printable{
    protected String name;
    
    public Shape(String n){
        name = n;
    }
    
    public abstract double getArea();
    public abstract String getInfo();

    public void display() {
        System.out.println(TITLE + getInfo());
    }
    
}
