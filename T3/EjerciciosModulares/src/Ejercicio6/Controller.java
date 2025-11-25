package Ejercicio6;

public class Controller {

    public String procesarTareas(String[] tareas) {

        int posicion = 0;
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i].contains("URGENTE")) { // .contains -> contiene esta palabra
                posicion = i;
                System.out.println("Posicion: " + (posicion+1));
                return "URGENTE";
            }
        }
        return "No hay tareas urgentes";
    }

}
