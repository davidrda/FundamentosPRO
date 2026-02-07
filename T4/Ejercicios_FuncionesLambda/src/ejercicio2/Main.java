package ejercicio2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> esPar = n -> n % 2 == 0;

        for (int i = 1; i <= 20; i++) {
            if (esPar.test(i)) {
                System.out.println(i);
            }
        }

        /* OTRA FORMA:
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            numeros.add(i);
        }

        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
         */
    }
}
