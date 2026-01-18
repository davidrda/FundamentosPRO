package ejercicio2;

public class Main {

    public static void main(String[] args) {

        InventarioAlmacen inventarioAlmacen = new InventarioAlmacen();
        inventarioAlmacen.agregarProducto("0001", 25);
        System.out.println(inventarioAlmacen.venderProducto("0001", 12));
        System.out.println(inventarioAlmacen.consultarStock("0001"));
        inventarioAlmacen.agregarProducto("0002", 150);
        inventarioAlmacen.agregarProducto("0003", 90);
        inventarioAlmacen.listarInventario();

        System.out.println();
        System.out.println("Productos con stock mínimo:");
        inventarioAlmacen.listarProductosBajoStock(100);

        System.out.println("El total de productos es: " + inventarioAlmacen.calcularStockTotal());

        System.out.println();
        System.out.println("El producto con más stock es: " + inventarioAlmacen.productoConMasStock());

    }
}
