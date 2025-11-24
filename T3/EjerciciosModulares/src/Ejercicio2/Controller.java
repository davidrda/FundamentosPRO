package Ejercicio2;

public class Controller {

    public int buscarNumero(int[] numeros, int objetivo) {

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == objetivo) {
                return i; // Paso 4: devuelve el índice si se encuentra
            }
        }
        return -1; // Devuelve -1 si no se encuentra
    }
}

