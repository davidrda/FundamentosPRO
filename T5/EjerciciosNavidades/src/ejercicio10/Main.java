package ejercicio10;

import ejercicio1.Libro;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("La Fábrica");

        biblioteca.agregarLibro(new Libro("El Quijote","David", "123", 350, 23.99));
        biblioteca.agregarLibro(new Libro("Dragon Ball","Akira", "124", 256, 29.99));
        biblioteca.agregarLibro(new Libro("Naruto","Goku", "125", 853, 33));
        biblioteca.agregarLibro(new Libro("One piece","Luffy", "126", 245, 99));

        System.out.println("Buscando libros por isbn: ");
        System.out.println(biblioteca.buscarLibroPorIsbn("123"));

        System.out.println();
        System.out.println("Prestando libro por isbn: " + biblioteca.prestarLibro("123"));

        System.out.println("Devolviendo libro: " + biblioteca.devolverLibro("126"));
        System.out.println("Devolviendo libro: " + biblioteca.devolverLibro("123"));

        biblioteca.prestarLibro("126");
        biblioteca.listarLibrosDisponibles();

        System.out.println();
        biblioteca.listarLibrosPrestados();
    }
}
