package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class massiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Input: ");
        int number = sc.nextInt();
        Arrays.fill(array, number);
        System.out.println(Arrays.toString(array));

    }
}
