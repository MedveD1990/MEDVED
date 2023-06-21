package Lesson4;

import java.util.Random;


public class random {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 4; i++) {
            System.out.println(Math.random());
        }
        Random random = new Random();
        int[] array = new int[7];
        int sum = 0;

        sum += array[i];
        System.out.println(i + "-й 'Элемент равен " + array[i]);
    }

}


