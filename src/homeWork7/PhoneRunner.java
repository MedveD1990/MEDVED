package homeWork7;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone Phone1 = new Phone(12345678, "Lucious", "Apple", 350);
        Phone1.receiveCall(false);
        System.out.println("Звонит: " + Phone1.nameIncoming);
        Phone1.receiveCall(true);
        System.out.println("Номер абонента: " + Phone1.number);



    }
}
