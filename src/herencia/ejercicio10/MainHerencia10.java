package herencia.ejercicio10;

public class MainHerencia10 {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Carlos López", "1234567-8");

        FacturaContado fc = new FacturaContado(101, c1, 500, 50);
        FacturaCredito fcr = new FacturaCredito(102, c1, 800, 120, 4);

        System.out.println("=== FACTURA AL CONTADO ===");
        fc.mostrar();

        System.out.println("\n=== FACTURA AL CRÉDITO ===");
        fcr.mostrar();
    }
}
