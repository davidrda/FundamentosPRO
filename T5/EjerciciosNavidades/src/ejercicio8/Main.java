package ejercicio8;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Ford","Focus",2001);
        Coche coche2 = new Coche("Seat","Leon",2024);

        coche1.repostar(50);
        coche2.repostar(61);
        coche1.conducir(45);
        coche2.conducir(110);

        coche1.mostrarInfo();

        System.out.println();
        coche2.mostrarInfo();

    }
}
