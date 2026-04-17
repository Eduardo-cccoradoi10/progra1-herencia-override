package herencia.ejercicio4;

public class Transporte {
    protected int capacidad;

    public Transporte(int capacidad) {
        this.capacidad = capacidad;
    }

    public void descripcion() {
        System.out.println("Transporte con capacidad para " + capacidad + " personas.");
    }
}
