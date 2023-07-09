package homeWork7;

public class Phone {
    int number;
    String nameIncoming;
    double weight;
    String model;
    public Phone (int number, String nameIncoming, String model,  double weight){
        this.number = number;
        this.nameIncoming = nameIncoming;
        this.weight = weight;
        this.model = model;
    }
    // далее создание метода
    public void receiveCall (boolean receiveCall){
        if (receiveCall) {
            System.out.println("Звонит " + nameIncoming);
        }else {
            this.nameIncoming = nameIncoming;
        }

    }
    public void getNumber (int numberIncoming){

    }

}
