package ejercicio9;

import ejercicio4.Producto;
import lombok.Getter;
import lombok.Setter;

public class Tienda {

    @Setter
    @Getter

    private String nombre;
    private Producto[] productos;
    private int numProductos;

    public Tienda() {
    }

    public Tienda(String nombre) {
        this.nombre = nombre;
        productos = new Producto[50];
        numProductos = 0;
    }

    public boolean agregarProducto(Producto producto) {
        if (numProductos < productos.length) {
            productos[numProductos] = producto;
            numProductos++;
            return true;
        } else {
            return false;
        }
    }

    public Producto buscarProducto(String codigo) {
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                return productos[i];
            }
        }
        return null;
    }

    public void listarProductos() {
        System.out.println("Lista de productos: ");

        for (int i = 0; i < numProductos; i++) {
            System.out.println(productos[i]);
        }
    }

    public double calcularValorTotalInventario() {
        double valorTotal = 0;
        for (int i = 0; i < numProductos; i++) {
            valorTotal += productos[i].getPrecio();
        }
        return valorTotal;
    }

    public void listarProductosSinStock(){
        System.out.println("Los productos sin stock son:");
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getStock() == 0) {
                System.out.println(productos[i]);
            }
        }
    }
}
