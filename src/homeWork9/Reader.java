package homeWork9;

import java.util.Arrays;

public class Reader {
    private String name;
    private String surname;
    private String fatherName;
    private int libraryCardNumber;
    private static int counterBook;

    public Reader(String surname, String name, String fatherName, int libraryCardNumber) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.libraryCardNumber = libraryCardNumber;
    }

    public Reader() {
    }


    public void takeBook(String... books) {
        Reader.counterBook += books.length;
        System.out.println(surname + " " + name.charAt(0) + ". " + fatherName.charAt(0) + ".  взял книги: " + Arrays.toString(books));
    }

    public void takeBook(int counterBook) {

        Reader.counterBook += counterBook;
        System.out.println(surname + " " + name.charAt(0) + ". " + fatherName.charAt(0) + ".  взял " + counterBook +
                " книги.");
    }


    public void takeBook(Book... books) {
        Reader.counterBook += books.length;
        System.out.println(surname + " " + name.charAt(0) + ". " + fatherName.charAt(0) + ". " + " взял книги: " + Arrays.toString(books));

    }

    public void counterBook() {
        System.out.println("Взяли всех книг: " + counterBook);
    }

}
