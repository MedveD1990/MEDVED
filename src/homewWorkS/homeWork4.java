package homewWorkS;

import java.util.Scanner;

public class homeWork4 {
    public static void main(String[] args) {

        System.out.println("Введите цену: ");
        Scanner scan = new Scanner(System.in);
        float price = scan.nextFloat();
        String cash = (price >= 1400) ? "Итоговая цена - " + (price * 93)/100 : "Итоговая цена - " + price;
        System.out.println(cash);
    }
}
