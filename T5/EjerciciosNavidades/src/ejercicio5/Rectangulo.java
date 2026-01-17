package ejercicio5;

public class Rectangulo {

    private double base, altura;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea(){
        double area = base * altura;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro = 2 * (base + altura);
        return perimetro;
    }

    public boolean esCuadrado(){
        if (base == altura){
            return true;
        }
        return false;
    }

    public void escalar(double factor){
        base *= factor;
        altura *= factor;
        System.out.println("Rectángulo escalado por un factor de " + factor + ". Nueva base: " + base + ", nueva altura: " + altura);
    }

    public void mostrarInfo(){
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+calcularArea());
        System.out.println("Perímetro: "+calcularPerimetro());
        System.out.println("¿Es cuadrado?: "+esCuadrado());
        escalar(2);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
