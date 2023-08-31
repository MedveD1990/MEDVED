package homewWork;

public class Card {
    String name;
    int AccNumber;
    double balance;

    public Card(String name, int AccNumber, double balance) {
        this.name = name;
        this.AccNumber = AccNumber;
        this.balance = balance;
    }

    public void In(double i) {
        balance += i;
    }

    public void Out(double j) {
        balance -= j;
    }

    public String toString() {
        return "Card Name: " + name + " AccountNumber,: " + AccNumber + " ,Balance: " + balance;
    }


}

