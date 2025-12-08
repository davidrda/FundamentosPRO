package Ejercicio8;

import org.w3c.dom.ls.LSOutput;

public class Controller {

    public int contarEdadesValidas(int[] edades){ // el parametro necesita una variable, el no las crea

        int valida = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] < 0 || edades[i] > 120){
                continue;
            }
            valida++;
        }
        return valida;
    };

    public void mostrarEdadesValidas(int[] edades){ // el parametro necesita una variable, el no las crea
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= 0 && edades[i] <= 120){
                System.out.print(edades[i]+" ");
            }
        }
        System.out.println();
    }
}
