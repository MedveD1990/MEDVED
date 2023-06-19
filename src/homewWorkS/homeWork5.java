package homewWorkS;

import java.util.Scanner;

public class homeWork5 {
    public static void main(String[] args) {

        System.out.println("Введите температуру - ");
        Scanner scanner = new Scanner(System.in);
        float temperature = scanner.nextFloat();
        if (temperature > -5) {
            System.out.println("Warm! ");
        } else if (temperature<=-20) {
            System.out.println("Cold! ");
        } else if (temperature >=-20 && temperature <= -5); {
            System.out.println("Normal! ");
        }

    }
}
