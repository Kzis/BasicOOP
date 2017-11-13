package Week12;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook2 implements PhoneBook{
    private List<Contact> contacts;

    public PhoneBook2() {
        contacts = new ArrayList<Contact>();
    }

    public void add(String name, String phoneNo) {
        contacts.add(new Contact(name, phoneNo));
    }

    public void remove(String name) {
        int size = contacts.size();
        for(int i = size - 1; i >= 0; i--){
            if(contacts.get(i).getName().equals(name)){
                contacts.remove(i);
            }
        }
    }

    public void showPhoneNoOf(String name) {
        for(Contact c : contacts){
            if(c.getName().equals(name)){
                System.out.println(c.getName() + ": " + c.getPhoneNo());
            }
        }
    }

    public void showAll() {
        for(Contact c : contacts){
            System.out.println(c.getName() + ": " + c.getPhoneNo());       
        }
    }
    
}
