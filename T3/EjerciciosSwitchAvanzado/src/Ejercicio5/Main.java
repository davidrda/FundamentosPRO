package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 12;
        double num2 = 4;
        char operador = '+';
        double resultado;
        System.out.println("Introduce operador: ");
        operador = sc.next().charAt(0);

        switch (operador){
            case '+'->{
                resultado = num1 + num2;
                System.out.println(resultado);
            }
            case '-'->{
                resultado = num1 - num2;
                System.out.println(resultado);
            }
            case '*'->{
                resultado = num1 * num2;
                System.out.println(resultado);
            }
            case '/'->{
                if (num1 != 0 && num2 != 0){
                    resultado = num1 / num2;
                    System.out.println(resultado);
                } else{
                    System.out.println("No se puede dividir por zero");
                }
            }
            default -> System.out.println("Operador invalido");
        }
    }
}
