package ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Alumno> listaAlumnos = new ArrayList<>();

        Alumno alumno1 = new Alumno("David", 6.99, 8.99);
        Alumno alumno2 = new Alumno("Vanessa", 4.99, 9.99);
        Alumno alumno3 = new Alumno("Adrian", 2.0, 8.32);
        Alumno alumno4 = new Alumno("Sergio", 6.99, 3.64);

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);


        Gestor gestor = new Gestor();
        gestor.generarInforme(listaAlumnos);
        gestor.mostrarAprobados(listaAlumnos);
    }
}
