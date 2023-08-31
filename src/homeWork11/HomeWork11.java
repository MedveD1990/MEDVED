package homeWork11;
// Регулярные выражения
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        Pattern p = Pattern.compile("([A-Z]{2,6}+)");
        Matcher m = p.matcher(str1);
        while (m.find()) {
            System.out.println("Number is found " + m.group() +
                    " with indexes started from " + m.start() + " to " + m.end());
        }

//        if (m.matches()){
//            System.out.println(m.matches());
//        }
//        else {
//            System.out.println("No match found in the given String! ");
//        }
    }

}
