package herencia.ejercicio4;

public class Bus extends Transporte {
    private String ruta;

    public Bus(int capacidad, String ruta) {
        super(capacidad); // inicializa capacidad en la clase padre
        this.ruta = ruta;
    }

    @Override
    public void descripcion() {
        super.descripcion(); // reutiliza la descripción base
        System.out.println("Ruta asignada: " + ruta);
    }
}
