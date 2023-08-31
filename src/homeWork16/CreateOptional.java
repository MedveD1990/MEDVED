package homeWork16;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class CreateOptional {
    public static void main(String[] args) {
        printFourSymbol("");
    }

    public static void printFourSymbol(String s) {
        String name = (String) Optional.empty().orElse(s);
        System.out.println(name);
        if (name.length() > 4) {
            System.out.println(name.substring(0, 4));
        } else {
            System.out.println("JAVA");
        }
    }
}

