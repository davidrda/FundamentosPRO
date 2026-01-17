package ejercicio7;

public class Main {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("David", "783873", 2300);

        e1.agregarHorasExtras(5);
        e1.calcularSalarioTotal();
        e1.aplicarAumento(20);
        e1.mostrarInforme();
        e1.resetearHorasExtras();

        System.out.println();

        e1.mostrarInforme();
    }
}
