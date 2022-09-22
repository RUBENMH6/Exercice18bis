import java.util.Scanner;

public class Exercice18bis {

    public static void main(String[] args) {
        double hour, price, gross, taxes, net;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Enter hours: ");
        hour= inputValue.nextDouble();
        System.out.println("Enter hour/price: ");
        price = inputValue.nextDouble();

        if (hour > 35) {
            gross = 35 * price + ( hour - 35 ) * 1.5 * price;
        } else {
            gross = hour * price;
        }
        if (gross > 900) {
            taxes = (gross - 900) * 0.45 + 400 * 0.25;
            net = gross - taxes;
        } else if (gross > 500) {
            taxes = (gross - 500) * 0.25;
            net = gross - taxes;
        } else {
            taxes = 0;
            net = gross;
        }
        System.out.println("Gross: " + gross);
        System.out.println("Net: " + net);
        System.out.println("Taxes: " + taxes);
    }
}
