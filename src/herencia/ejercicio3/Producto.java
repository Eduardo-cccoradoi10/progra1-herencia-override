package herencia.ejercicio3;

public class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: Q" + precio);
    }
}
