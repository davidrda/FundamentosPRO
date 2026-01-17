package ejercicio1;

public class Libro {

    private String titulo, autor;
    private int numPaginas;
    private double precio;

    public Libro(String titulo, String autor, int numPaginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precio = precio;
    }

    public void mostrarInfo(Libro libro) {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numPaginas);
        System.out.println("Precio: " + precio);
    }

    public boolean esLibroLargo() {
        if (getNumPaginas() > 300) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + precio + ", Precio: " + precio;
    }

    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento del " + porcentaje + "%...");
        double precioDescontado = precio * (porcentaje / 100);
        System.out.printf("Nuevo precio: %.2f ", (precio - precioDescontado));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
