import controller.EjerciciosNumericos;

public class Main {

    public static void main(String[] args) {


        EjerciciosNumericos ejercicios = new EjerciciosNumericos();

        /*
        for (int i = 0; i < 40; i++) {
            System.out.println("El numero de Fb en posición i es "+ejercicios.numerosFibonacci(i));
        }
         */

        ejercicios.movimientoHanoi(3, 'A', 'B', 'C');
    }

}
