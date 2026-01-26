package ejercicio9;

import ejercicio4.Producto;

public class Main {

    public static void main(String[] args) {

        Tienda tienda1 = new Tienda("Nike");

        tienda1.agregarProducto(new Producto("1", "AirMax", 29, 89));
        tienda1.agregarProducto(new Producto("2", "Dunk", 5, 138));
        tienda1.agregarProducto(new Producto("3", "AirZoom", 180, 70));
        tienda1.agregarProducto(new Producto("4", "Malas", 0, 70));

        System.out.println();

        tienda1.buscarProducto("2");

        System.out.println();

        tienda1.listarProductos();

        System.out.println();

        double total = tienda1.calcularValorTotalInventario();
        System.out.println("Valor total del inventario: " + total);

        tienda1.listarProductosSinStock();

    }
}
