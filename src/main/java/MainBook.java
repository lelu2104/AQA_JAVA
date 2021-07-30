import java.util.ArrayList;

public class MainBook {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList <Book>();
        Book book1 = new Book(1, "Harry Potter1", "Rouling", 1998, 256, 50, "bind");
        Book book2 = new Book(1, "Harry Potter2", "Rouling", 1999, 300, 60, "nobind");
        Book book3 = new Book(1, "Harry Potter3", "Rouling", 1989, 286, 35, "bind");
        Book book4 = new Book(1, "Harry Potter4", "Rouling", 1999, 426, 25, "nobind");
        Book book5 = new Book(1, "Harry Potter5", "Rouling", 2000, 856, 45, "bind");
        Book book6 = new Book(1, "Harry Potter6", "Rouling", 2001, 1026, 80, "nobind");
        Book book7 = new Book(1, "Harry Potter7", "Rouling", 2002, 89, 74, "bind");
        Book book8 = new Book(1, "Harry Potter8", "Rouling", 2010, 1476, 35, "nobind");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
            }
}
