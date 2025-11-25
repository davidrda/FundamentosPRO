package Ejercicio6;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();
        String[] tareas = {"Limpiar","Barrer","Tirar la basura","Cocinar es URGENTE","Bajar al perro"};
        System.out.println(controller.procesarTareas(tareas));
    }
}
