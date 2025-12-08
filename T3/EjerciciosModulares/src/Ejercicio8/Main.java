package Ejercicio8;

// Crear un métod0 que valide edades en un array, saltando valores inválidos con continue.

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        int[] edades = {12, 19, -90, 130, 22, -3};

        int totalValidas = controller.contarEdadesValidas(edades);
        System.out.println("Edades válidas: " + totalValidas);

        System.out.print("Listado de edades válidas: ");
        controller.mostrarEdadesValidas(edades);
    }
}