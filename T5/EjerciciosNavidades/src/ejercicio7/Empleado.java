package ejercicio7;

public class Empleado {

    private String nombre, dni;
    private double salarioBase;
    private int horasExtras;


    public Empleado(String nombre, String dni, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void agregarHorasExtras(int horas){
        horasExtras += horas;
    }

    public double calcularSalarioTotal(){
        return salarioBase + (horasExtras * 20);
    }

    public void aplicarAumento(double porcentaje){
        salarioBase += salarioBase * porcentaje / 100;
    }

    public void resetearHorasExtras(){
        horasExtras = 0;
    }

    public void mostrarInforme(){
        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+dni);
        System.out.println("Salario base: "+salarioBase);
        System.out.println("Horas extras: "+horasExtras);
        System.out.println("Salario total: "+calcularSalarioTotal());
    }
}
