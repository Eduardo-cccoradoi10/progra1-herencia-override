package herencia.ejercicio2;

public class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(double saldo, double limiteSobregiro) {
        super(saldo); // inicializa el saldo en la clase padre
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {
        if (saldo - monto >= -limiteSobregiro) {
            super.retirar(monto); // reutiliza la lógica de Cuenta
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Operación denegada. Excede el límite de sobregiro.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Saldo: Q" + saldo);
        System.out.println("Límite de sobregiro: Q" + limiteSobregiro);
    }
}
