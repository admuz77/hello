package MetodyKonstruktory;

public class PrzelicznikJednostek {
    public static void main(String[] args) {
        Jednostki converter = new Jednostki();
        double m = 2.5;
        double mToCm = converter.metersToMm(m);
        double mToMm = converter.metersToMm(m);
        System.out.println(m + "m to " + mToCm + "cm i " + mToMm + "mm");
    }
}

