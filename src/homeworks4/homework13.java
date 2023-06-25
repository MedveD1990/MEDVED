package homeworks4;

import java.util.Arrays;
import java.util.Scanner;

public class homework13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();
        String [] strings = new String[str.length()];
        char[] characters = str.toCharArray();
        System.out.println(Arrays.toString(characters));
        String reverse = new StringBuffer(Arrays.toString(characters)).reverse().toString();
        System.out.println("String after reverse: " + reverse);

    }
}
