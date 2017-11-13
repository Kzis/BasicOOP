package Week12;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook1 implements PhoneBook{
    private Map<String, String> contacts;

    public PhoneBook1() {
        contacts = new TreeMap<>();
    }

    public void add(String name, String phoneNo) {
        contacts.put(name, phoneNo);
    }

    public void remove(String name) {
        contacts.remove(name);
    }

    public void showPhoneNoOf(String name) {
        System.out.println(name + ": " + contacts.get(name));
    }

    public void showAll() {
        for(Map.Entry<String, String> entry: contacts.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    
}
