package ejercicio9;

import java.util.*;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        for (int i = 1; i < 21; i++) {
            lista1.add(i);
            lista2.add(i + 10);
        }

        BiFunction<List<Integer>, List<Integer>, List<Integer>> listaDefinitiva =
                (a, b) -> {
                    // Usamos TreeSet porque:
                    // - No permite duplicados
                    // - Mantiene orden natural (menor a mayor)
                    Set<Integer> conjunto = new TreeSet<>();

                    // Añadimos a y b al Set
                    conjunto.addAll(a);
                    conjunto.addAll(b);

                    // Retorna el Set conjunto pero convertido en ArrayList
                    return new ArrayList<>(conjunto);
                };

        List<Integer> resultado = listaDefinitiva.apply(lista1,lista2);

        resultado.forEach(System.out::println);


    }
}
