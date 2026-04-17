package herencia.ejercicio7;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int velocidad, int cilindrada) {
        super(marca, velocidad); // inicializa atributos heredados
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // reutiliza la info base
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
