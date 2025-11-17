package Ejercicio4;

public enum CategoriaPlato {

    ENTRADA("Sopa", "Ensalada", "Patatas"),
    PRINCIPAL("Carne", "Pescado", "Hamburguesa"),
    POSTRE ("Tarta", "Brownie", "Helado"),
    BEBIDA("Agua", "Cocacola", "Vino");

    String variacion1;
    String variacion2;
    String variacion3;


    CategoriaPlato (String variacion1P, String variacion2P, String variacion3P) {
        variacion1 = variacion1P;
        variacion2 = variacion2P;
        variacion3 = variacion3P;
    }
}
