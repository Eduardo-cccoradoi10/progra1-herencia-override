package herencia.ejercicio6;

public class MainHerencia6 {
    public static void main(String[] args) {

        Animal a = new Animal();
        Perro p = new Perro();

        System.out.println("=== Animal ===");
        a.hacerSonido();

        System.out.println("\n=== Perro ===");
        p.hacerSonido();

        System.out.println("\n=== Polimorfismo ===");
        Animal x = new Perro(); // referencia padre, objeto hijo
        x.hacerSonido(); // ejecuta el método del Perro
    }
}
