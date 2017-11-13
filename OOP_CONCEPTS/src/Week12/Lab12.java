package Week12;

public class Lab12 {

    public static void main(String[] args) {
        System.out.println("PhoneBook1 example==========");
        
        PhoneBook phoneBook1 = new PhoneBook1();
        phoneBook1.add("John", "000000");
        phoneBook1.add("John", "111111");
        phoneBook1.add("Jack", "222222");
        phoneBook1.add("Jane", "333333");
        
        System.out.println();
        System.out.println("show phone no of John");
        phoneBook1.showPhoneNoOf("John");
        
        System.out.println();
        System.out.println("show all");
        phoneBook1.showAll();
        
        
        System.out.println();
        System.out.println("PhoneBook2 example==========");
        
        PhoneBook phoneBook2 = new PhoneBook2();
        phoneBook2.add("Tom", "555555");
        phoneBook2.add("Tom", "666666");
        phoneBook2.add("Tim", "777777");
        phoneBook2.add("Toon", "888888");
        
        System.out.println();
        System.out.println("show phone no of John");
        phoneBook2.showPhoneNoOf("Tom");
        
        System.out.println();
        System.out.println("show all");
        phoneBook2.showAll();
        
    }
    
}
