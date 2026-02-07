package ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /*
         * =====================================================
         * 1️⃣ LISTA DE NÚMEROS DE ENTRADA
         * =====================================================
         * Creamos un ArrayList de Integer y lo rellenamos
         * con números del 0 al 14.
         */
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            numeros.add(i);
        }


        /*
         * =====================================================
         * 2️⃣ PRIMERA FUNCIÓN: OPERACIONES NUMÉRICAS
         * =====================================================
         * Function<Integer, Integer>
         *
         * Esta función recibe un número y devuelve otro número:
         * 1) Le suma 10
         * 2) El resultado lo multiplica por 2
         */
        Function<Integer, Integer> sumarYMultiplicar =
                dato -> (dato + 10) * 2;


        /*
         * =====================================================
         * 3️⃣ ENCADENAR CON andThen()
         * =====================================================
         * Aquí encadenamos una segunda operación a la función anterior.
         *
         * andThen() hace lo siguiente:
         * - Ejecuta primero 'sumarYMultiplicar'
         * - Toma su resultado (Integer)
         * - Se lo pasa a esta lambda
         * - Convierte el Integer en String
         *
         * El resultado final de la cadena será un String.
         */
        Function<Integer, String> cadenaFinal =
                sumarYMultiplicar.andThen(dato -> dato.toString());


        /*
         * =====================================================
         * 4️⃣ APLICAR LA FUNCIÓN A LA LISTA CON STREAM (EN PROFUNDIDAD)
         * =====================================================
         *
         * 👉 numeros.stream()
         * -------------------
         * - Convierte la lista 'numeros' en un Stream<Integer>
         * - Un Stream NO es una lista
         * - Es una "línea de producción" por la que pasan los datos
         *
         * En este punto tenemos:
         * Stream<Integer>


         * 👉 .map(cadenaFinal)
         * -------------------
         * - map recibe una Function
         * - Aplica esa Function a CADA elemento del Stream
         * - No modifica la lista original
         * - Devuelve un NUEVO Stream
         *
         * Transformación de tipos:
         * Integer  --->  String
         *
         * En este punto tenemos:
         * Stream<String>


         * 👉 .collect(...)
         * ----------------
         * - Un Stream no se puede usar directamente
         * - Necesita una operación TERMINAL
         * - collect() es una operación terminal
         *
         * collect(toCollection(...)) hace:
         * - Recorre el Stream<String>
         * - Crea un ArrayList nuevo
         * - Va metiendo dentro cada elemento transformado
         *
         * Resultado final:
         * ArrayList<String>
         */
        ArrayList<String> resultados = numeros.stream()
                .map(cadenaFinal)
                .collect(Collectors.toCollection(ArrayList::new));


        /*
         * =====================================================
         * 5️⃣ MOSTRAR EL RESULTADO
         * =====================================================
         * forEach recorre la lista final y muestra
         * cada String por consola.
         */
        resultados.forEach(System.out::println);
    }
}
