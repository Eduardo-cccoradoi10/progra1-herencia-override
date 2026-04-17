package herencia.ejercicio7;

public class MainHerencia7 {
    public static void main(String[] args) {

        Vehiculo v = new Vehiculo("Toyota", 120);
        Moto m = new Moto("Honda", 140, 250);

        System.out.println("=== Vehículo ===");
        v.mostrarInfo();

        System.out.println("\n=== Moto ===");
        m.mostrarInfo();
    }
}
