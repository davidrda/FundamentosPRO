package Ejercicio10;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        String[] productos = {"Monitor", "Raton", "Teclado"};
        int[] cantidades = {2,11,5};
        double[] precios = {20, 3, 8};

        controller.procesarPedidos(productos,cantidades,precios);
    }
}
