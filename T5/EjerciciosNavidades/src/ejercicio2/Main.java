package ejercicio2;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("David",25,8,9.4,6.2);
        System.out.printf("El promedio de "+estudiante1.getNombre()+" es de: %.2f\n",estudiante1.calcularPromedio());
        System.out.println("¿Está aprobado? "+estudiante1.estaAprobado());
        System.out.println("Su calificación es: "+estudiante1.obtenerCalificacion());
        System.out.println();
        estudiante1.mostrarInforme();
    }
}
