package homeWork10;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class stringFormat {
    public static void main(String[] args) {
        System.out.println("Input a String in format nnnn - lll - nnnn - lll - nlnl: ");
        Scanner scanner = new Scanner(System.in);
        String size = scanner.nextLine();
        System.out.println(size);
//      String are:   1111 - lll - 2222 - lll - a1a1
        System.out.println(size.substring(0, 4) + " " + size.substring(13, 17));
        System.out.println(size.replace("lll", "***")); /*Вывести на экран номер документа, но блоки из трех букв заменить
        на *** (каждая буква заменятся на *).*/
        System.out.println(size.substring(7, 10) + " " + size.substring(21, 24));
    }
}
