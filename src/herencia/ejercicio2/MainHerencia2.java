package herencia.ejercicio2;

public class MainHerencia2 {
    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente(500, 200);

        System.out.println("=== Cuenta Corriente ===");
        cc.mostrarInfo();

        System.out.println("\nIntento de retiro de 400:");
        cc.retirar(400); // permitido

        cc.mostrarInfo();

        System.out.println("\nIntento de retiro de 400 más:");
        cc.retirar(400); // excede sobregiro

        cc.mostrarInfo();
    }
}
