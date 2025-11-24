package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        // Se crea el array
        int[] numeros = {13, 45, 28, 93, 42};
        int objetivo = 93; // Número a buscar

        // Llamada al metod, que solo recibe datos. NO LOS CREA
        int resultado = controller.buscarNumero(numeros, objetivo);

        if (resultado != -1){
            System.out.println("El resultado es: " + resultado);
        } else  {
            System.out.println("No existe el resultado");
        }
    }


}
