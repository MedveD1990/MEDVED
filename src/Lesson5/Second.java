package Lesson5;

import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        int[][][] array = new int[][][]{
                {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
                {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
                {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}}
        };
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) ;
        for (int j = 0; j < array.length; j++) ;
        for (int k = 0; k < array.length; k++) ;
    }

}
