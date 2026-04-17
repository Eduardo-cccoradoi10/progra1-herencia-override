package herencia.ejercicio10;

public class Factura {
    protected int numero;
    protected Cliente cliente;
    protected double total;

    public Factura(int numero, Cliente cliente, double total) {
        this.numero = numero;
        this.cliente = cliente;
        setTotal(total);
    }

    public void setTotal(double total) {
        if (total < 0) {
            System.out.println("El total no puede ser negativo. Se asignará 0.");
            this.total = 0;
        } else {
            this.total = total;
        }
    }

    public double calcularTotal() {
        return total; // será sobrescrito en las clases hijas
    }

    public void mostrar() {
        System.out.println("Factura No. " + numero);
        cliente.mostrar();
        System.out.println("Total base: Q" + total);
    }
}
