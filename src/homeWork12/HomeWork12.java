package homeWork12;
import homeWork12.Exceptions.InvalidInput;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork12 {
    public static void main(String[] args) throws InvalidInput {



        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        Pattern p = Pattern.compile("([A-Z]{2,6}+)");
        Matcher m = p.matcher(str1);
        while (m.find()) {
            System.out.println("Number is found " + m.group() +
                    " with indexes started from " + m.start() + " to " + m.end());
        }




        }





    }


