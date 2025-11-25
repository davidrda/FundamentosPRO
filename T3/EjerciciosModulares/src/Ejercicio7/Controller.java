package Ejercicio7;

public class Controller {
    public void generarFibonacci(int limite){

        int numero1 = 0;
        int numero2 = 1;
        int resultado = 0;

        while (true){
            resultado = numero1 + numero2;
            numero1 = numero2;
            numero2 = resultado;
            if (resultado > limite){
                break;
            }
            System.out.println(resultado);
        }

    }
}
