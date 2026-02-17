package ejercicio7;

import ejercicio7.model.Producto;

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        Producto p1 = new Producto("TV", 1999);
        Producto p2 = new Producto("Monitor", 500);
        Producto p3 = new Producto("Ratón", 20);
        Producto p4 = new Producto("Teclado", 89);
        Producto p5 = new Producto("Macbook", 1350);

        BiFunction<Producto, Producto, Producto> gestionProductos = (prod1, prod2) ->
                prod1.getPrecio() > prod2.getPrecio() ? prod1 : prod2; // condicion ? verdadero : falso

        Producto masCaro = gestionProductos.apply(p3,p4);
        System.out.println("El producto más caro es: "+masCaro.getNombre());
    }


}
