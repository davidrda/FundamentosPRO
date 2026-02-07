package ejercicio4;

import java.util.ArrayList;
import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {

        BiPredicate<String, String> mismaLongitud = (s1,s2) -> s1.length() == s2.length();

        System.out.println(mismaLongitud.test("Hola", "Hola"));
        System.out.println(mismaLongitud.test("Hola", "Adios"));

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Adios");
        lista.add("Buenas");
        lista.add("Chao");

        // Recorre cada elemento de la lista (s), y comprueba si hay algún elemento
        // que tenga la misma longitud que Hola. Nada más encuentra un true, devuelve true y no recorre más
        lista.stream()
                .anyMatch(s -> mismaLongitud.test(s, "Hola"));


    }
}
