package herencia.ejercicio10;

public class FacturaCredito extends Factura {
    private double recargo;
    private int cuotas;

    public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
        super(numero, cliente, total);
        this.recargo = recargo;
        this.cuotas = cuotas;
    }

    @Override
    public double calcularTotal() {
        return total + recargo;
    }

    public double calcularCuotaMensual() {
        return calcularTotal() / cuotas;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Recargo: Q" + recargo);
        System.out.println("Cuotas: " + cuotas);
        System.out.println("Total a pagar: Q" + calcularTotal());
        System.out.println("Pago mensual: Q" + calcularCuotaMensual());
    }
}
