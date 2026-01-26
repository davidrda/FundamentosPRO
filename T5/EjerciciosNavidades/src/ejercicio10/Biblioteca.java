package ejercicio10;

import ejercicio1.Libro;
import lombok.Getter;
import lombok.Setter;

public class Biblioteca {

    @Setter
    @Getter

    private String nombre;
    private Libro[] libros;
    private int numLibros;

    public Biblioteca() {
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new Libro[15];
        this.numLibros = numLibros;
    }

    public boolean agregarLibro(Libro libro) {
        if (numLibros < libros.length) {
            libros[numLibros] = libro;
            numLibros++;
            return true;
        }
        return false;
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getIsbn().equals(isbn)) {
                return libros[i];
            }
        }
        return null;
    }

    public boolean prestarLibro(String isbn) {
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getIsbn().equals(isbn)) {
                return libros[i].prestar();
            }
        }
        return false;
    }

    public boolean devolverLibro(String isbn) {
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getIsbn().equals(isbn)) {
                return libros[i].devolver();
            }
        }
        return false;
    }

    public void listarLibrosDisponibles() {
        boolean hayDiponibles = false;

        for (int i = 0; i < numLibros; i++) {
            if (!libros[i].isPrestado()) {
                System.out.println(libros[i]);
                hayDiponibles = true;
            }
        }

        if (!hayDiponibles) {
            System.out.println("No hay libros disponibles");
        }
    }

    public void listarLibrosPrestados() {
        boolean hayPrestados = false;

        for (int i = 0; i < numLibros; i++) {
            if (libros[i].isPrestado()) {
                System.out.println(libros[i]);
                hayPrestados = true;
            }
        }

        if (!hayPrestados) {
            System.out.println("No hay libros prestados");
        }
    }
}
