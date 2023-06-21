package homewWorkS3;

import java.util.Scanner;

public class homeWork10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Input a positive number: ");
            int number = scan.nextInt();
            int summ = number * (number + 1);
            System.out.println("Summ from 0: " + number + " are " + summ);
            System.out.println("Are you want to continue? ");
            if (scan.next().toLowerCase().equals("n")) {
                return;
            }
        }
    }
}
