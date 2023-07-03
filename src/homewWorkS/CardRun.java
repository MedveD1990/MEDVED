package homewWorkS;

public class CardRun {
    public static void main(String[] args) {
        Card Belkart = new Card("Belkart", 2345, 3455.7);
        Card Visa = new Card("Visa", 9087, 9870.4);
        Card MasterCard = new Card("MasterCard", 6732, 1234.5);

        System.out.println("Belkart Account: " + Belkart);
        System.out.println("Visa Account: " + Visa);
        System.out.println("MasterCard Account: " + MasterCard);


    }
}
