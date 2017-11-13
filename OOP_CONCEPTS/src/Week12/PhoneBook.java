package Week12;

public interface PhoneBook {
    void add(String name, String phoneNo);
    void remove(String name);
    void showPhoneNoOf(String name);
    void showAll();
}
