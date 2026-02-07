package ejercicio5;

import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {

        BiConsumer<String,Integer> infoEstudiantes =
                (nombre, edad) -> System.out.printf("Nombre: %s, Edad: %d%n", nombre,edad);

        infoEstudiantes.accept("David",25);
        infoEstudiantes.accept("Vanessa",24);
        infoEstudiantes.accept("Nuri",19);
    }
}
