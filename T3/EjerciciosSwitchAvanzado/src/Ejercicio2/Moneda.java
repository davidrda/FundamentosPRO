package Ejercicio2;

public enum Moneda {

    DOLAR(1.08), LIBRA(0.86), YEN(162), PESO(19);

    double conversion = 0;


    Moneda(double conversion) {
        this.conversion = conversion;
    }
}
