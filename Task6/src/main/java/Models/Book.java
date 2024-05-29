package Models;

public class Book {
    private String name;
    private String author;
    private int noOfCopies;

    public Book(String name, String author, int noOfCopies) {
        this.name = name;
        this.author = author;
        this.noOfCopies = noOfCopies;
    }

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", noOfCopies=" + noOfCopies +
                '}';
    }
}
