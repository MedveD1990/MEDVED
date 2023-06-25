package homeworks4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class homework12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input array size: ");
        int in = sc.nextInt();
        int[] mass = new int[in];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(mass));

//Не совсем понял как вывести максимальное и мнимальное, а также ср.арифметичнское.
    }
}
