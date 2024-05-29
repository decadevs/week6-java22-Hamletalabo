import Models.Library;
import Models.User;
import enums.Gender;
import enums.Role;
import services.impl.LibraryServiceImpl;

public class Main {
    public static void main(String[] args) {

        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        Library library = new Library();


        User seniorStudent = new User("Senior John", 12, Gender.MALE, Role.SENIOR_STUDENT);
        User teacher = new User(" Teacher Johnmary ",34, Gender.MALE,Role.TEACHER);
        User juniorStudent= new User(" Junior Tinubu", 10, Gender.FEMALE, Role.JUNIOR_STUDENT);


        libraryService.addLibraryUserToQueue(seniorStudent);
        libraryService.addLibraryUserToQueue(juniorStudent);
        libraryService.addLibraryUserToQueue(teacher);

        System.out.println("\n");
        System.out.println("Book Given Based On Priority");
        System.out.println("-------------------------------------");
//        libraryService.giveBookBasedOnPriority("Principles of Java", library.getBookShelf());

        System.out.println("\n");
        System.out.println("Book given based On First Come bases");
        System.out.println("-------------------------------------");
        libraryService.giveBookBasedOnFifo("Introduction to Biology", library.getBookShelf());

    }
}
