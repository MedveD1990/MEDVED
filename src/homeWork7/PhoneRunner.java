package homeWork7;

import java.util.Arrays;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone Phone1 = new Phone(12345678, "Lucious", "Apple", 350);
        Phone1.receiveCall(false);
        System.out.println("Parametrs of Phone1 are: " + Phone1);
        System.out.println("Звонит: " + Phone1.nameIncoming);
        System.out.println("Звонит: " + Phone1.number + " " + Phone1.nameIncoming);



    }
}
//
