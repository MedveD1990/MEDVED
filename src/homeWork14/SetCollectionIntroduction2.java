package homeWork14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetCollectionIntroduction2 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet();
        Scanner scanner = new Scanner(System.in);

        Integer num1 = scanner.nextInt();
        while (num1>=0) {
            numbers.add(num1);
            System.out.println("If you want to continue input 'y' or any other character to finish");
            String yesOrNo = scanner.next();
            if (!yesOrNo.equals("y")){
                break;
            }
            System.out.println("Input number");
            num1 = scanner.nextInt();
        }

        System.out.println();
        System.out.println(numbers);
    }
}
