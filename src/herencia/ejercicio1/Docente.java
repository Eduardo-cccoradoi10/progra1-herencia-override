package herencia.ejercicio1;

public class Docente extends Persona {
    private String especialidad;

    public Docente(String nombre, int edad, String especialidad) {
        super(nombre, edad); // uso de super para inicializar Persona
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar() {
        // Reutilizo la lógica de Persona y agrego lo propio
        super.mostrar();
        System.out.println("Especialidad: " + especialidad);
    }
}
