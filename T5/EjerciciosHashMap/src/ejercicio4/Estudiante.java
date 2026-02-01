package ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;

public class Estudiante {

    HashMap<String, ArrayList<Double>> estudiantes;

    public Estudiante() {
        estudiantes = new HashMap<>();
    }

    public Estudiante(HashMap<String, ArrayList<Double>> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregarEstudiante(String nombre) {
        estudiantes.put(nombre, new ArrayList<>());
        System.out.println("Estudiante agregado");
    }

    public void agregarCalificacion(String nombre, double calificacion) {
        // Si el estudiante existe, entonces saco su valor mediante .get y añado calificaciones mediante .add
        if (estudiantes.containsKey(nombre)) {
            estudiantes.get(nombre).add(calificacion);
            System.out.println("Calificación agregada");
        } else {
            System.out.println("Estudiante no identificado");
        }
    }

    public double calcularPromedio(String nombre) {
        double sumaTotal = 0;

        if (estudiantes.containsKey(nombre) && !estudiantes.get(nombre).isEmpty()) {
            for (double c : estudiantes.get(nombre)) {
                sumaTotal += c;
            }
            return sumaTotal / estudiantes.get(nombre).size();
        }
        return 0;

    }

    public void mostrarCalificaciones(String nombre) {
        if (estudiantes.containsKey(nombre)) {
            System.out.printf("Las notas de %s son: %n",nombre);
            for (double c : estudiantes.get(nombre)) {
                System.out.println(c);
            }
        }
    }

    public String mejorEstudiante() {
        String mejor = null;
        double mejorPromedio = -1;

        for (String nombre : estudiantes.keySet()) {
            double promedio = calcularPromedio(nombre);

            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejor = nombre;
            }
        }
        return mejor;
    }

    public void listarEstudiantesAprobados(double notaMinima) {
        boolean hayAprobados = false;
        System.out.printf("Mostrando lista de estudiantes aprobados (nota mínima %.2f):%n",notaMinima);
        for (String e : estudiantes.keySet()) {
        double promedio = calcularPromedio(e);
            if (promedio >= notaMinima) {
                System.out.println(e);
                hayAprobados = true;
            }
        }

        if (!hayAprobados) {
            System.out.println("No hay estudiantes aprobados");
        }
    }

    public double promedioGeneral() {
        if (estudiantes.isEmpty()) {
            return 0;
        }
        double sumaPromedio = 0;

        for (String e : estudiantes.keySet()) {
            double promedio = calcularPromedio(e);
            sumaPromedio += promedio;
        }
        double promedioGeneral = sumaPromedio / estudiantes.size();

        return promedioGeneral;


    }
}
