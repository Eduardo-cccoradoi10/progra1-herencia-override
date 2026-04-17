package herencia.ejercicio9;

public class MainHerencia9 {
    public static void main(String[] args) {

        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        LibroDigital ebook = new LibroDigital("Java Fundamentals", "Oracle Press", 5.8);

        System.out.println("=== Libro Físico ===");
        libro.mostrarInfo();

        System.out.println("\n=== Libro Digital ===");
        ebook.mostrarInfo();
    }
}
