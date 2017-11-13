package Week11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Lab11 {
    public static final String WORKING_DIRECTORY = "c:\\data\\";
    public static final String DATA_FILE = "employee.data";
    
    public static void main(String[] args) throws FileNotFoundException {
        
        //write employee data into file
        Employee e1 = new Employee("101", "John", 10000);
        Employee e2 = new Employee("102", "Jane", 12000);
        Employee e3 = new Employee("103", "Jack", 13000);
        Employee e4 = new Employee("104", "Jo", 14000);
        Employee[] employees = {e1, e2, e3, e4};
        
        //check directory c:\data is exist or not, if not exist then create it
        File outputDir = new File(WORKING_DIRECTORY);
        if(!outputDir.exists()){
            outputDir.mkdir();
        }
        
        File outputFile = new File(WORKING_DIRECTORY + DATA_FILE);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        
        for(Employee e : employees){
            printWriter.println(e.getDataToSave());
        }
        printWriter.close();
        
        
        //read employee data from file and create employee objects
        ArrayList<Employee> emps = getEmployeesFromFile();
        for(Employee e : emps){
            System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
        }
    }

    private static ArrayList<Employee> getEmployeesFromFile() throws FileNotFoundException {
        ArrayList<Employee> emps = new ArrayList<>();
        
        JFileChooser chooser = new JFileChooser(WORKING_DIRECTORY);
        int status = chooser.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                Employee e = Employee.getEmployee(sc.nextLine());
                emps.add(e);
            }
            sc.close();
        }
        return emps;
    }
    
}
