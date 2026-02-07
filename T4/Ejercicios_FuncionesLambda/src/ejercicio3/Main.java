package ejercicio3;

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> suma = (a,n) -> a + n;
        System.out.println(suma.apply(2,10));

        BiFunction<Integer, Integer, Integer> resta = (a,n) -> a - n;
        System.out.println(resta.apply(10,7));

        BiFunction<Integer, Integer, Integer> multiplicacion = (a,n) -> a * n;
        System.out.println(multiplicacion.apply(10,10));

        BiFunction<Integer, Integer, Integer> division = (a,n) -> a / n;
        System.out.println(division.apply(20,2));
    }
}
