package MetodyKonstruktory;

public class Calculate {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double a = 5.5;
        double b = 10;

        System.out.println(calc.multiply(a,b));
        System.out.println(calc.add(a,b));
        System.out.println(calc.add(55,33));


    }
}