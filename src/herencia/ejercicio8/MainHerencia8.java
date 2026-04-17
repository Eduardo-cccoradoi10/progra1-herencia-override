package herencia.ejercicio8;

public class MainHerencia8 {
    public static void main(String[] args) {

        Rectangulo r = new Rectangulo(5, 3);
        Circulo c = new Circulo(4);

        System.out.println("=== Rectángulo ===");
        r.mostrarArea();

        System.out.println("\n=== Círculo ===");
        c.mostrarArea();

        System.out.println("\n=== Polimorfismo ===");
        Figura f1 = new Rectangulo(2, 10);
        Figura f2 = new Circulo(2.5);

        f1.mostrarArea();
        f2.mostrarArea();
    }
}
