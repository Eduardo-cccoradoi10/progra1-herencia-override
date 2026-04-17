package herencia.ejercicio5;

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public void mostrar() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario base: Q" + salario);
    }
}
