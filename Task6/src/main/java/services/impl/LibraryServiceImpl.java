package services.impl;

import Models.Book;
import Models.Library;
import Models.User;
import services.LibraryService;

import java.util.*;


public class LibraryServiceImpl implements LibraryService {

    Library library = new Library();


    @Override

    public String addLibraryUserToQueue(User user) {
        library.getLibraryUsersOnQueue().add(user);

        return user.getName();
    }

    @Override
    public Optional<Book> checkBook(String nameOfBook, List<Book> books) {
        Optional<Book> optionalBook = books.stream()
                .filter(b -> nameOfBook.equals(b.getName()) && b.getNoOfCopies() >0)
                .findFirst();
        optionalBook.ifPresent(book -> book.setNoOfCopies(book.getNoOfCopies() -1));
        return optionalBook;
    }


    @Override
    public String giveBookBasedOnFifo(String book, List<Book> books) {
        library.getLibraryUsersOnQueue().forEach(p ->
                checkBook(book, books).ifPresent(b ->
                        System.out.println(book + " is with " + p.getName())
                )
        );
        return book;
    }


    @Override
    public String giveBookBasedOnPriority(String book, List<Book> books) {

        Collections.sort(library.getLibraryUsersOnQueue(), new RoleComparator());

        library.getLibraryUsersOnQueue().forEach(p ->
                checkBook(book, books).ifPresent(b ->
                        System.out.println(book + " is with " + p.getName())
                )
        );
        return book;
    }
}
