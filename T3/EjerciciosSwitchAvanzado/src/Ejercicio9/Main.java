package Ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu peso");
        double peso = sc.nextDouble();
        System.out.println("Dime tu altura");
        double altura = sc.nextDouble();

        final double IMC = peso / (altura * altura);

        switch (IMC){
            case (IMC < 18.5)->{
                System.out.println("Normal");
                System.out.println("Tu IMC es: "+IMC);
            }
            case (IMC < 24.9)->{
                System.out.println("Sobrepeso");
                System.out.println("Tu IMC es: "+IMC);
            }
            case (IMC < 25.9)->{
                System.out.println("Sobrepeso");
                System.out.println("Tu IMC es: "+IMC);
            }
            case (IMC >= 30)->{
                System.out.println("Obesidad");
                System.out.println("Tu IMC es: "+IMC);
            }
        }

    }
}
