package Models;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Library {
    private  List<User> libraryUsersOnQueue = new LinkedList<>();

    private  List<Book> bookShelf = new ArrayList<>();


    public List<User> getLibraryUsersOnQueue() {
        return libraryUsersOnQueue;
    }

    public  List<Book> getBookShelf(){
        List<Book> bookShelf = new ArrayList<>();
        bookShelf.add(new Book("Principles of Java",  "Paul",3));
        bookShelf.add(new Book("Java OOP",  "Hamlet", 2));
        bookShelf.add(new Book("Introduction to Biology",  "John", 4));
        bookShelf.add(new Book("Bible",  "King James", 7));
        bookShelf.add(new Book("Healthy Living",  "Harry", 3));

        return bookShelf;
    }

}