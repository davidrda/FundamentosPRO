package Ejercicio5;

import java.util.Scanner;

public class Controller {

    int intentos = 3;
    Scanner sc = new Scanner(System.in);
    String usuario;
    String password;

    boolean intentarLogin(String usuarioCorrecto, String passwordCorrecta) {
        boolean loginExitoso = false;

        for (int i = 0; i < intentos; i++) {
            System.out.println("Introduce el usuario:");
            usuario = sc.nextLine();
            System.out.println("Introduce la contraseña:");
            password = sc.nextLine();

            if (usuario.equals(usuarioCorrecto) && password.equals(passwordCorrecta)) {
                loginExitoso = true;
                break; // Requisito del ejercicio
            } else {
                System.out.println("Login incorrecto");
            }
        }

        if (loginExitoso) {
            System.out.println("Login correcto");
            return true;
        } else {
            return false; // Se agotan los intentos
        }
    }
}
