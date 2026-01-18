package ejerciccio3;

import java.util.HashMap;

public class Diccionario {

    HashMap<String, String> diccionario;

    public Diccionario() {
        diccionario = new HashMap<>();
    }

    public Diccionario(HashMap<String, String> diccionario) {
        this.diccionario = diccionario;
    }

    public void agregarTraduccion(String espanol, String ingles) {
        diccionario.put(espanol, ingles);
        System.out.println("Traducción agregada.");
    }

    public String traducir(String palabra) {
        if (diccionario.containsKey(palabra)) {
            System.out.print("La traducción es: ");
            return diccionario.get(palabra);
        }
        return "No existe esa palabra";
    }

    public void agregarVariasTraducciones(String[][] traducciones) {
        for (String[] pareja : traducciones) {
            String espanol = pareja[0];
            String ingles = pareja[1];
            diccionario.put(espanol, ingles);
        }
    }

    public void listarDiccionario() {
        for (String espanol : diccionario.keySet()) {
            String traduccion = diccionario.get(espanol);
            System.out.println(espanol + ", " + traduccion);
        }
    }

    public int tamanioDiccionario (){
        return diccionario.size();
    }

    public void traducirFrase (String frase) {
        // 1. Separar la frase en palabras
        String[] palabras = frase.split(" ");

        // 2. String para construir la frase traducida
        String resultado = "";

        // 3. Recorrer cada palabra
        for (String palabra : palabras) {

            // 4. Comprobar si existe traducción
            if (diccionario.containsKey(palabra)) {
                resultado += diccionario.get(palabra) + " ";
            } else {
                // 5. Si no existe, dejar la palabra igual
                resultado += palabra + " ";
            }
        }

        // 6. Mostrar la frase traducida
        System.out.println(resultado.trim());
    }

    public HashMap<String, String> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(HashMap<String, String> diccionario) {
        this.diccionario = diccionario;
    }
}
