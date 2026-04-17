package herencia.ejercicio8;

public class Figura {

    public double calcularArea() {
        return 0; // área genérica, será sobrescrita
    }

    public void mostrarArea() {
        System.out.println("Área: " + calcularArea());
    }
}
