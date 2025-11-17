package Ejercicio7;

public class Main {

    public static void main(String[] args) {
        int puntuacion = 0;

        switch (true){
            case (puntuacion >= 0 && puntuacion <= 100)->{
                System.out.println("Nivel principante");
            }
            case (puntuacion <=500)->{
                System.out.println("Nivel intermedio");
            }
            case (puntuacion <= 1000)->{
                System.out.println("Nivel avanzado");
            }
            case (puntuacion <= 5000)->{
                System.out.println("Nivel experto");
            }
            case (puntuacion > 5000)->{
                System.out.println("Nivel Maestro");
            }
        }
    }
}
