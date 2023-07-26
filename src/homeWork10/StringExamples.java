package homeWork10;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {
        String str = "I Like Java!!!";
        System.out.println(str.charAt(13));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I Like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(7, 11));

    }
}
