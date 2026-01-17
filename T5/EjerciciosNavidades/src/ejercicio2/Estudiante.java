package ejercicio2;

public class Estudiante {

    private String nombre;
    private int edad;
    private double notaMatematicas, notaProgramacion, notaIngles;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double notaMatematicas, double notaProgramacion, double notaIngles) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMatematicas = notaMatematicas;
        this.notaProgramacion = notaProgramacion;
        this.notaIngles = notaIngles;
    }

    public double calcularPromedio(){
        double sumaTotal = notaMatematicas + notaProgramacion + notaIngles;
        double promedio = sumaTotal / 3;
        return promedio;
    }

    private double promedio = calcularPromedio();

    public boolean estaAprobado(){
        if (promedio >= 5){
            return true;
        }
        return false;
    }

    public String obtenerCalificacion(){
        if (promedio >= 9 && promedio <= 10) {
            return "Sobresaliente";
        } else if (promedio >= 7 && promedio <= 8.9) {
            return "Notable";
        } else if (promedio >= 6 && promedio <= 6.9) {
            return "Bien";
        } else if (promedio >= 5 && promedio <= 5.9) {
            return "Suficiente";
        } else if (promedio < 5) {
            return "Insuficiente";
        }
        return "Nota no válida";
    }

    public void mostrarInforme(){

        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Nota de Inglés: "+notaIngles);
        System.out.println("Nota de Programación: "+notaProgramacion);
        System.out.println("Nota de Matemáticas: "+notaMatematicas);
        System.out.printf("Promedio: %.1f\n",promedio);
        System.out.println("Calificación: "+obtenerCalificacion());
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getNotaMatematicas() {
        return notaMatematicas;
    }
    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }
    public double getNotaProgramacion() {
        return notaProgramacion;
    }
    public void setNotaProgramacion(double notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }
    public double getNotaIngles() {
        return notaIngles;
    }
    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }
}
