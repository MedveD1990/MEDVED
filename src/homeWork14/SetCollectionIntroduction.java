package homeWork14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetCollectionIntroduction {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input negative number to finish program");
        Integer num1 = scanner.nextInt();
        while (num1>=0) {
            numbers.add(num1);
            num1 = scanner.nextInt();
        }

       System.out.println(numbers);
        System.out.println();
        System.out.println(numbers);
    }
}
