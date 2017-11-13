package Week11;

public class Employee {
    private static final String SEPARATOR = "#@#";
    
    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    
    public String getDataToSave(){
        return id + SEPARATOR + name + SEPARATOR + salary;
    }
    
    public static Employee getEmployee(String s){
        String[] data = s.split(SEPARATOR);
        return new Employee(data[0], data[1], Double.valueOf(data[2]));
    }
}
