package homeWork9;

public class LibraryRunner {
    public static void main(String[] args) {

        Reader reader1 = new Reader("ivanov", "i", "i", 123);
        Reader reader2 = new Reader("petrov", "v", "v", 124);
        Reader[] readers = {reader1, reader2};

        Book book1 = new Book("приключение", "Пират");
        Book book2 = new Book("энциклопедия", "xxx");
        Book book3 = new Book("словарь", "даль");
        Book[] books1 = {book1, book3};
        Book[] books2 = {book2};
        readers[0] = new Reader();
        readers[1] = new Reader();

        reader1.takeBook(3);
        reader1.takeBook("приключение", "словарь");
        reader1.takeBook(books1);
        reader1.counterBook();
        reader2.takeBook("словарь");
        reader2.takeBook(1);
        reader2.counterBook();

    }
}
