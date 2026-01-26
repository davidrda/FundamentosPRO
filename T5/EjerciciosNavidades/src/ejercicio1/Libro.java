package ejercicio1;

import lombok.Getter;
import lombok.Setter;

public class Libro {

    @Getter
    @Setter

    private String titulo, autor, isbn;
    private int numPaginas;
    private double precio;
    private boolean prestado;

    public Libro(String titulo, String autor, String isbn, int numPaginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.precio = precio;
        prestado = false;
    }

    public void mostrarInfo(Libro libro) {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numPaginas);
        System.out.println("Precio: " + precio);
    }

    public boolean prestar(){
        if (!prestado) {
            prestado = true;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (prestado) {
            prestado = false;
            return true;
        }
        return false;
    }

    public boolean esLibroLargo() {
        if (numPaginas > 300) {
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

    public boolean isPrestado() {
        return prestado;
    }

    public String getIsbn() {
        return isbn;
    }
}
