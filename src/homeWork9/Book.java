package homeWork9;

public class Book extends Reader {
    private String nameBook;
    private String authorName;
    public static final String LIBRARY_NAME = "Алмаз";

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthorName() {
        return authorName;
    }


    public Book(String nameBook, String authorName) {
        this.nameBook = nameBook;
        this.authorName = authorName;
    }

    public void printLibraryName() {
        System.out.println("Все книги относятся " + LIBRARY_NAME);
    }
}
