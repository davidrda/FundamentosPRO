package ejercicio4;

public class Main {

    public static void main(String[] args) {

        Producto portatil = new Producto("10", "Portatil",223,599.99);

        System.out.println(portatil.hayStock());
        System.out.println(portatil.vender(9));
        portatil.reabastecer(244);
        System.out.println(portatil.calcularValorInventario());
        portatil.mostrarInfo();
    }
}
