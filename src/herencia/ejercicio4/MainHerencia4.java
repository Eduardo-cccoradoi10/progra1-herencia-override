package herencia.ejercicio4;

public class MainHerencia4 {
    public static void main(String[] args) {

        Transporte t = new Transporte(50);
        Bus b = new Bus(40, "Jalpatagua - Jutiapa");

        System.out.println("=== Transporte ===");
        t.descripcion();

        System.out.println("\n=== Bus ===");
        b.descripcion();
    }
}
