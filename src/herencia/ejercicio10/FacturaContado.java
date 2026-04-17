package herencia.ejercicio10;

public class FacturaContado extends Factura {
    private double descuento;

    public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
        super(numero, cliente, total);
        this.descuento = descuento;
    }

    @Override
    public double calcularTotal() {
        double totalFinal = total - descuento;
        return Math.max(totalFinal, 0); // evita totales negativos
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Descuento: Q" + descuento);
        System.out.println("Total a pagar: Q" + calcularTotal());
    }
}
