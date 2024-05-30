package services.impl;

import Models.Library;
import Models.User;
import enums.Gender;
import enums.Role;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LibraryServiceImplTest {
LibraryServiceImpl libraryService = new LibraryServiceImpl();
Library library = new Library();
    @Test
    void addLibraryUserToQueue() {
        assertEquals("Hamlet",libraryService.addLibraryUserToQueue(new User("Hamlet",23, Gender.MALE, Role.JUNIOR_STUDENT)));
    }

    @Test
    void checkBook() {
        assertNotNull(libraryService.checkBook("Principles of Java",library.getBookShelf()));
    }

    @Test
    void giveBookBasedOnFifo() {
        assertEquals("Principles of Java",libraryService.giveBookBasedOnFifo("Principles of Java",library.getBookShelf()));
    }

    @Test
    void giveBookBasedOnPriority() {
        assertEquals("Principles of Java",libraryService.giveBookBasedOnPriority("Principles of Java",library.getBookShelf()));
    }
}