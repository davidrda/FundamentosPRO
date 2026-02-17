package ejercicio8;

import java.util.Arrays;
import java.util.function.Predicate;

/*
Crea varios Predicates para filtrar una lista de números:

- Números mayores que 50
- Números pares
- Números divisibles por 3

Combínalos usando `and()`, `or()` y `negate()` para crear filtros complejos.
 */

public class Main {

    public static void main(String[] args) {

        int[] numeros = {0, 1, 2, 3, 4, 22, 33, 46, 59, 60, 64};

        Predicate<Integer> filtrar50 = n -> n > 50;
        Predicate<Integer> filtrarPares = n -> (n % 2 == 0);
        Predicate<Integer> filtrarDivisibles3 = n -> (n % 3 == 0);

        Arrays.stream(numeros)
                .filter(filtrar50::test)
                .forEach(System.out::println);

        System.out.println();

        Arrays.stream(numeros)
                .filter(filtrarPares::test)
                .forEach(System.out::println);

        System.out.println();

        Arrays.stream(numeros)
                .filter(filtrarDivisibles3::test)
                .forEach(System.out::println);

        Predicate<Integer> filtrar50YPar = filtrar50.and(filtrarPares);

        System.out.println("\nAhora +50 y pares:");

        Arrays.stream(numeros)
                .filter(filtrar50YPar::test)
                .forEach(System.out::println);

        System.out.println("\nAhora mayor de 50 o divisibles entre 3");

        Predicate<Integer> filtrarMayorODiv3 = filtrar50.or(filtrarDivisibles3);
        Arrays.stream(numeros)
                .filter(filtrarMayorODiv3::test)
                 .forEach(System.out::println);

        Predicate<Integer> noPares = filtrarPares.negate();

        System.out.println("\nAhora números impares");
        Arrays.stream(numeros)
                .filter(noPares::test)
                .forEach(System.out::println);
    }
}
