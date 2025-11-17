
public class Main {

    // break -> rompe una iteración
    // return -> retorna un valor en el metodo y lo termina. Es la ultima linea del metodo
    // continue -> la iteración que tenga el continue no la ejecuta, pero no rompe la ejecución
    // if -> condicional que permite ejecutando un cuerpo u otro
    // if termario -> decida el valor de una variable sobre una condición lógica

    public static void main(String[] args) {

        int acumulador = 0, intentos =  0;
        int[] numeros = {1,3,-67,23,-12,24,68,-96};

        /*for (int i = 0; i < 10; i++) {
            acumulador +=  (int)Math.random()*101;
            intentos++;
            if (acumulador>=301){
                break;
            }
            System.out.println("continuamos incrementando la variable");
        } */
        /*
            System.out.println("Repitiendo");
            acumulador += (int) (Math.random()*20);
            intentos++;
            if (acumulador>100 && acumulador<110){
                break; // rompe el do while
            }
        }while(acumulador <301);

        System.out.println("Terminando la ejecución con un saldo de "+acumulador);
        System.out.println("Has necesitado de "+intentos);

         */
        /*
        if (acumulador != 10){
            System.out.println("Acumulador valor 10");
        } else if (acumulador == 20) {
            System.out.println("Acumulador valor 20");
        }

         */
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("Ejecutando en la vuelta "+i);
            return; // es la ultima linea del metodo, en este caso metodo Main
        }
         */
        /*
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0){
                continue;
            }
            System.out.println(numeros[i]);
        }
        // solo va a ser ejecutable si el numero es >=0
        */

        int nota = 5;
        // variable = condicion ? el valor de la variable si la condición es true : el valor de la variable si la condicion es false
        String resultado = nota>5 ? "Examen aprobado" : "Examen suspenso"; // false, porque nota no es > 5, entonces el valor el false (suspenso)
        System.out.println(resultado);
        System.out.println("Terminando la evaluación");

    }
}