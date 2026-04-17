package herencia.ejercicio1;

public class MainHerencia1 {
    public static void main(String[] args) {

        Persona p = new Persona("Carlos", 25);
        Docente d = new Docente("Ana", 40, "Matemática");
        Estudiante e = new Estudiante("Luis", 19, "2024-001");

        System.out.println("=== Persona ===");
        p.mostrar();

        System.out.println("\n=== Docente ===");
        d.mostrar();

        System.out.println("\n=== Estudiante ===");
        e.mostrar();
    }
}
