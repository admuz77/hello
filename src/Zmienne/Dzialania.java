package Zmienne;

import java.util.Random;

public class Dzialania {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);

        System.out.println(x);
        System.out.println(y);

        System.out.print("Czy X jest większy od Y? ");
        System.out.println(x > y);

        System.out.print("Czy Y jest większy od X? ");
        System.out.println(x < y);

        System.out.print("Czy X pomnożone przez 2 jest większe od Y? ");
        System.out.println(2*x > y);

        System.out.print("Czy Y jest mniejsze od sumy X+3 i jednocześnie większe od X pomniejszonego o 2? ");
        System.out.println(y < x+3 && y > x-2);

        System.out.print("Czy iloczyn liczb x i y jest parzysty? ");
        int z = x * y;
        int mod = z % 2;
        System.out.println(z%2 == 0);


    }
}
