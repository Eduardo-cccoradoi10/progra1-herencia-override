package herencia.ejercicio9;

public class LibroDigital extends Libro {
    private double tamanoMB;

    public LibroDigital(String titulo, String autor, double tamanoMB) {
        super(titulo, autor); // inicializa atributos heredados
        this.tamanoMB = tamanoMB;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // reutiliza la información base
        System.out.println("Tamaño: " + tamanoMB + " MB");
    }
}
