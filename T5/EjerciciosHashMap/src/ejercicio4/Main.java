package ejercicio4;

public class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        // Crear estudiantes
        estudiante.agregarEstudiante("Ana");
        estudiante.agregarEstudiante("David");
        estudiante.agregarEstudiante("Borja");

        // Añadir calificaciones
        estudiante.agregarCalificacion("Ana", 6.7);
        estudiante.agregarCalificacion("Ana", 7.8);
        estudiante.agregarCalificacion("David", 10);
        estudiante.agregarCalificacion("David", 9.6);
        estudiante.agregarCalificacion("Borja", 5.6);
        estudiante.agregarCalificacion("Borja", 4.9);

        // Mostrar promedios
        System.out.println("Promedios:");
        System.out.println("Ana: " + estudiante.calcularPromedio("Ana"));
        System.out.println("David: " + estudiante.calcularPromedio("David"));
        System.out.println("Borja: " + estudiante.calcularPromedio("Borja"));

        // Mostrar calificaciones
        estudiante.mostrarCalificaciones("Ana");
        estudiante.mostrarCalificaciones("David");
        estudiante.mostrarCalificaciones("Borja");

        // Mejor estudiante
        System.out.println("Mejor estudiante: " + estudiante.mejorEstudiante());

        // Aprobados
        estudiante.listarEstudiantesAprobados(6);

        // Promedio general
        System.out.println("Promedio general: " + estudiante.promedioGeneral());
    }
}
