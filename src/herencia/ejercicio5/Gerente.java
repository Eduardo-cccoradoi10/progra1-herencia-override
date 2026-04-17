package herencia.ejercicio5;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario); // inicializa atributos heredados
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Bono: Q" + bono);
        System.out.println("Salario total: Q" + calcularSalario());
    }
}
