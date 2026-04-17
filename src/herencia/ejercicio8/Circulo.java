package herencia.ejercicio8;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void mostrarArea() {
        System.out.println("Círculo:");
        super.mostrarArea();
    }
}
