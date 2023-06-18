package homewWorkS;

import java.util.Scanner;

public class homeWork6 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input time ");
        int time = scanner1.nextInt();
        if ((time >= 10) && (time <= 19)) {
            System.out.println("Welcom! ");
        } else if (time > 24) {
            System.out.println("Ошибка ввода! ");
        } else {
            System.out.println("Closed! ");
        }
    }
}






