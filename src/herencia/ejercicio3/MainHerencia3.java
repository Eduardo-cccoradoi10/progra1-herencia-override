package herencia.ejercicio3;

import java.time.LocalDate;

public class MainHerencia3 {
    public static void main(String[] args) {

        ProductoPerecedero leche = new ProductoPerecedero(
                "Leche Entera",
                15.50,
                LocalDate.of(2024, 2, 10)
        );

        ProductoPerecedero pan = new ProductoPerecedero(
                "Pan Blanco",
                5.00,
                LocalDate.now().plusDays(3)
        );

        System.out.println("=== Producto 1 ===");
        leche.mostrar();

        System.out.println("\n=== Producto 2 ===");
        pan.mostrar();
    }
}
