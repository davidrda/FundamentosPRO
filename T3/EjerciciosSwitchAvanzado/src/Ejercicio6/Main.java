package Ejercicio6;

public class Main {
    public static void main(String[] args) {

        Metodos metodos = new Metodos();

        int hora = metodos.obtenerHoraActual();

        switch (true){
            case (hora >= 0 && hora <= 5):
                System.out.println("Buenas madrugadas");
                break;
            case (hora >= 6 && hora <= 11):
                System.out.println("Buenos días");
                break;
            case (hora >= 12 && hora <= 19):
                System.out.println("Buenas tardes");
                break;
            case (hora >= 20 && hora <= 23):
                System.out.println("Buenas noches");
                break;
            default:
                System.out.println("Hora no válida");
    }
}
