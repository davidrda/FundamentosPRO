package Ejercicio4;

public class Controller {
    double total;
    int contador = 0;
    double media;
    int aprobado = 0;

    double calcularPromedio(double[] notas){
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] > 10){
                continue;
            } else  {
                total += notas[i];
                contador++;
            }
            if (notas[i] > 5){
                aprobado++;
            }
        }
        media = total / contador;
        System.out.println("Media: " + media);
        System.out.println("El número de notas válidas es: " + contador);
        System.out.println("El número de aprobados es: " + aprobado);
        return media;
    }
}
