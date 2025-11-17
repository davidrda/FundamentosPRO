package Ejercicio2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Moneda moneda = Moneda.DOLAR;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cantidad en euros: ");
        int cantidadEuros = sc.nextInt();
        int opcion;
        double operacion = 0;

        do {
            System.out.println("Elige moneda: ");
            System.out.println("1. Dolar");
            System.out.println("2. Libra");
            System.out.println("3. Yen");
            System.out.println("4. Peso");
            opcion = sc.nextInt();
            if (opcion == 1){
                operacion = cantidadEuros * Moneda.DOLAR.conversion;
                System.out.println("La conversion es: " + operacion);
            } else if (opcion == 2) {
                operacion = cantidadEuros * Moneda.LIBRA.conversion;
                System.out.println("La conversion es: " + operacion);
            } else if (opcion == 3) {
                operacion = cantidadEuros * Moneda.YEN.conversion;
                System.out.println("La conversion es: " + operacion);
            } else if (opcion == 4) {
                operacion = cantidadEuros * Moneda.PESO.conversion;
                System.out.println("La conversion es: " + operacion);
            }

        }while(opcion >= 1 && opcion <= 4);

        sc.close();
    }
}