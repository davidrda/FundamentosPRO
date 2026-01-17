package ejercicio3;

public class CuentaBancaria {

    private String titular, numeroCuenta;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void ingresar(double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("Ingreso hecho correctamente.");
            System.out.println("Tu saldo es: "+saldo);
        } else {
            System.out.println("No se puede ingresar esta cantidad.");
            System.out.println("Tu saldo es: "+saldo);
        }
    }

    public boolean retirar(double cantidad){
        if (saldo > 0 && saldo > cantidad){
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public void mostrarInfo(){
        System.out.println("Titular: "+titular);
        System.out.println("Número de cuenta: "+numeroCuenta);
        System.out.println("Saldo actual: "+saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
