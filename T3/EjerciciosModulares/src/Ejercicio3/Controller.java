package Ejercicio3;

public class Controller {
    int contador = 0;

    public void mostrarPares(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 1){
                continue;
            } else {
                System.out.println("Este si que es par. El numero es: " + numeros[i]);
                contador++;
            }
        }
        System.out.println("Contador: " + contador);
    }
}
