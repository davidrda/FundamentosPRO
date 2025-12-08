package Ejercicio9;

import Ejercicio9.Controller;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        String textoVocales = "Murcielago";
        //System.out.println(controller.contarVocales(textoVocales));


        String texto = "Este texto contiene esta palabra: feo";
        String[] palabrasProhibidas = {"feo","malo"};
        boolean tieneProhibida = controller.contienePalabraProhibida(texto, palabrasProhibidas);
        //System.out.println("Tiene palabra prohibida?: "+tieneProhibida);


        String otroTexto = "Esto es una palabra muy larga: Esternoclidomastoideo. Y esta también: EstadosUnidosdeAmerica";
        int longitudMinima = 20;
        System.out.println(controller.primeraPalabraLarga(otroTexto,longitudMinima));
    }
}
