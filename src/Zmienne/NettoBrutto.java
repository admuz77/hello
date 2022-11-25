package Zmienne;

import java.util.Random;

public class NettoBrutto {
    public static void main(String[] args) {
        Random rand = new Random();
        double netto = rand.nextInt(10,100);
        double vat = (netto * 0.23);
        double brutto = (vat + netto);

        System.out.println("Netto to: " + netto + " vat to: " + vat);
        System.out.println("Brutto to: " + brutto);
    }
}
