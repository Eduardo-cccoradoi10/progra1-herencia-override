package herencia.ejercicio5;

public class MainHerencia5 {
    public static void main(String[] args) {

        Empleado e = new Empleado("Carlos López", 3500);
        Gerente g = new Gerente("Ana Pérez", 5000, 1200);

        System.out.println("=== Empleado ===");
        e.mostrar();
        System.out.println("Salario calculado: Q" + e.calcularSalario());

        System.out.println("\n=== Gerente ===");
        g.mostrar();
    }
}
