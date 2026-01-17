package ejercicio3;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuentaBancaria = new CuentaBancaria("David","7823874279A",3489.28);
        cuentaBancaria.ingresar(345);
        System.out.println("Retiro: " + cuentaBancaria.retirar(1389.32));
        cuentaBancaria.mostrarInfo();
    }
}
