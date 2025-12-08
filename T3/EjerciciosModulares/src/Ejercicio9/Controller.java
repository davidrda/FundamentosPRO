package Ejercicio9;

public class Controller {



    public int contarVocales(String texto){
        int contador = 0;

        //Se recorre el parametro
        for (int i = 0; i < texto.length(); i++) {
            // Obtiene el carácter de la posición i
            char letra = texto.charAt(i);

            // Si NO es vocal, saltamos
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra!= 'o' && letra != 'u'){
                continue;
            }
            //Si llega aquí, es vocal, y se suma
            contador++;
        }

        return contador;
    }

    public boolean contienePalabraProhibida(String texto, String[] palabrasProhibidas){

        for (int i = 0; i < palabrasProhibidas.length; i++) {
            if (texto.contains(palabrasProhibidas[i])){
                return true;
            }
        }
        return false;
    }

    public String primeraPalabraLarga(String texto, int longitudMinima){

        // Separa el texto en palabras, usando el espacio, punto, coma, como separador
        String[] palabras = texto.split("[ .,]+");

        // Recorre cada palabra separada
        for (int i = 0; i < palabras.length; i++) {
            // A cada palabra de la iteración, se le asigna a String palabra
            String palabra = palabras[i];

            // Si la longitud de la palabra es mayor a longitudMinima, retorna la palabra buscada
            if (palabra.length() > longitudMinima){
                return palabra;
            }
        }
        // Si llega hasta aquí, es que no he encontrado ninguna palabra
        return "No encontrada";
    }
}
