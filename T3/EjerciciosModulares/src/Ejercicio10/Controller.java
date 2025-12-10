package Ejercicio10;

public class Controller {

    public boolean verificarStock(int cantidad, int stock){

        if (cantidad <= stock){
            return true;
        }
        return false;
    }

    public double calcularDescuento(double precio, int cantidad){

        if (cantidad > 10){
            return precio * 0.70;
        }
        return precio;

    }

    public void procesarPedidos(String[] productos, int[] cantidades, double[] precios){

        double totalPedido = 0;

        for (int i = 0; i < productos.length; i++) {

            int cantidad = cantidades[i];
            if (cantidad == 0){
                continue;
            }

            double precio = precios[i];

            if (!verificarStock(cantidades[i],20)){
                System.out.println("No hay suficente stock para "+productos[i]);
                continue;
            }

            double precioConDescuento = calcularDescuento(precio,cantidad);
            totalPedido += cantidad * precioConDescuento;

            if (totalPedido >= 1000) {
                System.out.println("Límite alcanzado. Pedido interrumpido");
                break;
            }
            System.out.println("Producto: " + productos[i]);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio unitario: "+precio);
            System.out.print("Precio unitario con descuento (si hay): " + precioConDescuento);
            System.out.println("Subtotal: " + (precioConDescuento * cantidad));
            System.out.println("Total del pedido: " + totalPedido);

        }

    }
}
