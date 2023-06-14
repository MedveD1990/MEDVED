import java.util.Scanner;

public class homeWork3 {
    public static void main (String[] args){


        double bel = 2345.67;
        double us1 = 2.925;
        double us2 = 2.923;
        double rus1 = 3.65;
        double rus2 = 2.655;
        double Ktod = 0.0365;
        double Ktom = 0.03655;
        double Ktod1 = 2.925;
        double Ktom1 = 2.923;
        System.out.println(bel*Ktod + bel*Ktom);
        System.out.println(bel*Ktod1 + bel*Ktom1);

        System.out.println("Введите сумму ");
        Scanner RUS1 = new Scanner(System.in);
        double name1 = RUS1.nextDouble();
        float cash1 = (float) (Ktod * name1);
        System.out.println("Курс: " + cash1);
        double cash2 = (double) (Ktom * name1);
        System.out.println("Курс: " + cash2);
        double cash3 = name1 / Ktod1;
        System.out.println("Курс: " + cash3); // Scanner можно вводить только один раз и каждый раз обращаться к Scanner перврому сканнеру!
        double cash4 = name1 / Ktom1;
        System.out.println("Курс: " + cash4);

//        String result1 = true ? "firstValue" : "secondValue"; // firstValue
//        String result2 = false ? "firstValue" : "secondValue"; //  secondValue

        String changedStatus = rus1 <= rus2 ? "decrease" : "increase";
        System.out.println(changedStatus);

    }
}
