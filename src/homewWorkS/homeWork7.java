package homewWorkS;

import java.util.Scanner;

public class homeWork7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size - ");
        String size = sc.nextLine();
        switch (size) {
            case "XS" -> System.out.print("Очень мальенький ");
            case "S" -> System.out.print("Маленький ");
            case "M" -> System.out.print("Средний ");
            case "L" -> System.out.print("Большой ");
            case "XL" -> System.out.println("Очень большой ");
            case "XXL" -> System.out.println("Очень - очень большой ");
            case "XXXL" -> System.out.println("Очень - очень большой ");
            case "XXXXL" -> System.out.println("Очень - очень большой ");
            case "XXXXXL" -> System.out.println("Очень - очень большой ");
            default -> System.out.print("Ошибка ввода ");

        }
    }
}