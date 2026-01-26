package ejercicio8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Coche {

    @Getter
    @Setter

    private String marca, modelo;
    private int anio;
    private double kilometraje, combustible;

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = 0;
        this.combustible = 50;
    }

    public void conducir(double km) {
        double litrosNecesarios = km / 15;

        if (combustible >= litrosNecesarios) {
            kilometraje += km;
            combustible -= litrosNecesarios;
        } else {
            System.out.println("No hay suficiente combustible para reccorer " + km + " km");
        }
    }

    public void repostar(double litros) {
        if (combustible + litros > 60) {
            combustible = 60;
            System.out.println("El tanque solo acepta hasta 60 litros. Se ha llenado el tanque.");
        } else {
            combustible += litros;
        }
    }

    public int calcularAntiguedad() {
        int anioActual = 2025;
        return anioActual - anio;
    }

    public boolean necesitaMantenimiento() {
        if (kilometraje > 10000) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarInfo() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Año = " + anio);
        System.out.println("Kilometraje = " + kilometraje);
        System.out.printf("Combustible = %.2f\n",combustible);
        System.out.println("Su antigüedad es de " + calcularAntiguedad() + " años");
        System.out.println("Necesita mantenimiento? = " + necesitaMantenimiento());
    }
}
