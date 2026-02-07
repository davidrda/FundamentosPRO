package ejercicio1;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // Declaramos una variable llamada "cuadrado"
        // - recibe un Integer
        // - devuelve un Integer
        // La lambda: n -> n * n
        // - n es el parámetro que recibe
        // - n * n es lo que devuelve
        Function<Integer, Integer> cuadrado = n -> n * n;

        // Bucle for para probar la función con números del 1 al 5
        for (int i = 1; i <= 5; i++) {

            // cuadrado.apply(i) ejecuta la lambda, (i) sería el valor n
            System.out.println(cuadrado.apply(i));
        }
    }
}
