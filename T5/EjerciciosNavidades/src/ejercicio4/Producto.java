package ejercicio4;

public class Producto {

    private String codigo, nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, int stock, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public boolean hayStock() {
        if (stock > 0) {
            return true;
        }
        return false;
    }

    public boolean vender(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
            return true;
        }
        return false;
    }

    public void reabastecer(int cantidad) {
        stock += cantidad;
        System.out.println("Se han añadido " + cantidad + " unidades.");
    }

    public double calcularValorInventario() {
        double valorTotalInventario = stock * precio;
        return valorTotalInventario;
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock + ", Valor " +
                "total: " + calcularValorInventario());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
