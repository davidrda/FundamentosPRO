package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CategoriaPlato categoria = CategoriaPlato.POSTRE;

            switch (categoria){
                case ENTRADA->{
                    System.out.println("Elige entrante:");
                    System.out.println(CategoriaPlato.ENTRADA.variacion1);
                    System.out.println(CategoriaPlato.ENTRADA.variacion2);
                    System.out.println(CategoriaPlato.ENTRADA.variacion3);
                }
                case PRINCIPAL->{
                    System.out.println("Elige principal: ");
                    System.out.println(CategoriaPlato.PRINCIPAL.variacion1);
                    System.out.println(CategoriaPlato.PRINCIPAL.variacion2);
                    System.out.println(CategoriaPlato.PRINCIPAL.variacion3);
                }
                case POSTRE->{
                    System.out.println("Elige postre: ");
                    System.out.println(CategoriaPlato.POSTRE.variacion1);
                    System.out.println(CategoriaPlato.POSTRE.variacion2);
                    System.out.println(CategoriaPlato.POSTRE.variacion3);
                }
                case BEBIDA->{
                    System.out.println("Elige bebida: ");
                    System.out.println(CategoriaPlato.BEBIDA.variacion1);
                    System.out.println(CategoriaPlato.BEBIDA.variacion2);
                    System.out.println(CategoriaPlato.BEBIDA.variacion3);
                }
            }
    }
}
