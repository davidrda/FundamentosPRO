package ejercicio6;

public class Pelicula {

    private String titulo, director;
    private int anio, duracion;
    private double calificacion;

    public Pelicula(String titulo, String director, int anio, int duracion, double calificacion) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.duracion = duracion;
        setCalificacion(calificacion);
    }

    public String getPelicula() {
        return titulo;
    }
    public void setPelicula(String pelicula) {
        this.titulo = pelicula;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10){
            this.calificacion = calificacion;
        } else {
            System.out.println("Calificación inválida. Debe de estar entre el 0 y el 10");
            this.calificacion = 0;
        }
    }

    public String obtenerDuracionFormateada() {
        int horas = duracion / 60;
        int minutos = duracion % 60;
        return horas + "h " + minutos + "min";
    }

    public boolean esClasica(){
        int anioActual = 2026;
        if ((anioActual - anio) > 25){
            return true;
        }
        return false;
    }

    public boolean esRecomendable(){
        if (calificacion >= 7){
            return true;
        }
        return false;
    }

    public void mostrarInfo(){
        System.out.println("Título: "+titulo);
        System.out.println("Director: "+director);
        System.out.println("Duración: "+obtenerDuracionFormateada());
        System.out.println("Año: "+anio);
        System.out.println("Calificación: "+calificacion);

    }
}
