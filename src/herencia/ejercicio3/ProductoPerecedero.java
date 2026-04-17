package herencia.ejercicio3;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {
    private LocalDate fechaVencimiento;

    public ProductoPerecedero(String nombre, double precio, LocalDate fechaVencimiento) {
        super(nombre, precio); // inicializa atributos heredados
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(fechaVencimiento);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);

        if (estaVencido()) {
            System.out.println("⚠️ Producto vencido");
        } else {
            System.out.println("✔ Producto en buen estado");
        }
    }
}
