package Week10;

public class Book implements Printable{
    private String isbn;
    private String name;

    public Book(String isbn, String name) {
        this.isbn = isbn;
        this.name = name;
    }

    public void display() {
        System.out.println(TITLE + isbn + ", " + name);
    }
}
