package homeWork13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class homeWork13 {
    private static String joke = "На цепь посажен кот учёный чтоб знал собака как гулять";

    public static void main(String[] args) {

        File dirJoke = new File("E:\\TeachMeSkills\\MEDVED\\src\\homeWork13", "joke.txt");
        try {
            System.out.println(dirJoke.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter writer = new FileWriter(dirJoke)) {
            writer.write(joke);
        } catch (IOException e) {
            System.out.println("Failed to write to the file");
        }
        String[] strArray = joke.split(" ");
        System.out.println("Самое длинное слово: " + strArray[findLongestWord(strArray)]);

        File dirJoke2 = new File("E:\\TeachMeSkills\\MEDVED\\src\\homeWork13", "longest-word.txt");
        try {
            System.out.println(dirJoke2.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter writer = new FileWriter(dirJoke2)) {
            writer.write(strArray[findLongestWord(strArray)]);
        } catch (IOException e) {
            System.out.println("Failed to write to the file");
        }
    }

    public static int findLongestWord(String[] strArray) {
        int maxLong = strArray[0].length();
        int index = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > maxLong) {
                maxLong = strArray[i].length();
                index = i;
            }
        }
        return index;
    }

//    public static void main(String[] args) {
//        File dir = new File("E:/TeachMeSkills/MEDVED/src/homeWork13");
//
//        File file1 = new File ("E:/TeachMeSkills/MEDVED/src/homeWork13", "Joke.txt");
//        File file2 = new File (dir, "Joke.txt");
//        if (dir.mkdir()){
//            System.out.println("Created");
//        }

    }
