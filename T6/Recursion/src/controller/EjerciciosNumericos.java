package controller;

public class EjerciciosNumericos {

    public int numerosFibonacci(int posicion) {

        // Caso Base
        if (posicion == 0) return 0;
        if (posicion == 1) return 1;

        return numerosFibonacci(posicion-1) + numerosFibonacci(posicion-2);

    }
}
