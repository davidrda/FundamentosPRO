package Ejercicio1;


public class Controller {

    boolean tieneMayuscula = false;
    boolean tieneNumero = false;

    public boolean validarContrasena(String password){

        if(password.length()<8){
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i))){
                tieneMayuscula = true;
            }
            if (Character.isDigit(password.charAt(i))){
                tieneNumero = true;
            }
            if (tieneMayuscula && tieneNumero){
                System.out.println("Contrasena valida");
                break;
            }
        }
        if(!tieneMayuscula && !tieneNumero){
            return false;
        }
        System.out.println("Contrasena valida");
        return true;

            /*
            - No se hace return en mitad del bucle
            - Se hace único return true y return false después del análisis completo
            - Se usa break para salir del bucle solo cuando ya se cumplieron ambas condiciones
             */

    }
}
