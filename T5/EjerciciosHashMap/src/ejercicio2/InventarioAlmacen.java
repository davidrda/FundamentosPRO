package ejercicio2;

import java.util.HashMap;

public class InventarioAlmacen {

    HashMap<String, Integer> inventario;

    public InventarioAlmacen() {
        inventario = new HashMap<>();
    }

    public InventarioAlmacen(HashMap<String, Integer> inventario) {
        this.inventario = inventario;
    }

    public void agregarProducto(String codigo, int cantidad) {
        inventario.put(codigo, cantidad);
        System.out.println("Producto agregado. Producto: " + codigo + ", " + cantidad + " unidades.");
    }

    public boolean venderProducto(String codigo, int cantidad) {

        // Si existe el producto, se saca el stock actual. Si es mayor el stock que la cantidad que se vende,
        // Se reemplaza por el mismo código con (StockActual - cantidad)
        if (inventario.containsKey(codigo)) {

            int stockActual = inventario.get(codigo);
            if (stockActual >= cantidad) {
                inventario.put(codigo, stockActual - cantidad);
                System.out.print("Producto vendido: ");
                return true;
            }
        } else {
            System.out.println("No existe este producto");
        }
        return false;
    }

    public Integer consultarStock(String codigo) {
        int stockActual = inventario.get(codigo);

        if (stockActual > 0) {
            return inventario.get(codigo);
        } else {
            System.out.println("No hay stock de este producto");
        }
        return null;
    }

    public void listarInventario() {
        for (String producto : inventario.keySet()) {
            int unidades = inventario.get(producto);
            System.out.println("Producto: " + producto + ", " + unidades + " unidades");
        }
    }

    public void listarProductosBajoStock (int minimo) {
        for (String producto : inventario.keySet()) {
            int unidades = inventario.get(producto);
            if (unidades < minimo) {
                System.out.println("Producto: " + producto + ", " + unidades + " unidades");
            }
        }
    }

    public int calcularStockTotal(){
        int total = 0;
        for (int cantidad : inventario.values()) {
            total += cantidad;
        }
        return total;
    }

    public String productoConMasStock(){
        int maxStock = -1;
        String codigoMax = null;

        for (String codigo : inventario.keySet()) {
            int stock = inventario.get(codigo);

            if (stock > maxStock) {
                maxStock = stock;
                codigoMax = codigo;
            }
        }

        return codigoMax;
    }

    public HashMap<String, Integer> getInventario() {
        return inventario;
    }

    public void setInventario(HashMap<String, Integer> inventario) {
        this.inventario = inventario;
    }
}
