package herencia;

import java.time.LocalDate;

import herencia.ejercicio1.Docente;
import herencia.ejercicio1.Estudiante;
import herencia.ejercicio1.Persona;
import herencia.ejercicio10.Cliente;
import herencia.ejercicio10.FacturaContado;
import herencia.ejercicio10.FacturaCredito;
import herencia.ejercicio2.CuentaCorriente;
import herencia.ejercicio3.ProductoPerecedero;
import herencia.ejercicio4.Bus;
import herencia.ejercicio4.Transporte;
import herencia.ejercicio5.Empleado;
import herencia.ejercicio5.Gerente;
import herencia.ejercicio6.Animal;
import herencia.ejercicio6.Perro;
import herencia.ejercicio7.Moto;
import herencia.ejercicio7.Vehiculo;
import herencia.ejercicio8.Circulo;
import herencia.ejercicio8.Figura;
import herencia.ejercicio8.Rectangulo;
import herencia.ejercicio9.Libro;
import herencia.ejercicio9.LibroDigital;

public class Main {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("===== EJERCICIO 1: PERSONA =====");
        System.out.println("====================================");

        Persona p = new Persona("Carlos", 25);
        Docente d = new Docente("Ana", 40, "Matemática");
        Estudiante e = new Estudiante("Luis", 19, "2024-001");

        p.mostrar();
        System.out.println();
        d.mostrar();
        System.out.println();
        e.mostrar();


        System.out.println("\n====================================");
        System.out.println("===== EJERCICIO 2: CUENTA =====");
        System.out.println("====================================");

        CuentaCorriente cc = new CuentaCorriente(500, 200);
        cc.mostrarInfo();
        System.out.println("\nRetiro de 400:");
        cc.retirar(400);
        cc.mostrarInfo();
        System.out.println("\nRetiro de 400 adicional:");
        cc.retirar(400);
        cc.mostrarInfo();


        System.out.println("\n====================================");
        System.out.println("===== EJERCICIO 3: PRODUCTO =====");
        System.out.println("====================================");

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

        leche.mostrar();
        System.out.println();
        pan.mostrar();


        System.out.println("\n====================================");
        System.out.println("===== EJERCICIO 4: TRANSPORTE =====");
        System.out.println("====================================");

        Transporte t = new Transporte(50);
        Bus b = new Bus(40, "Jalpatagua - Jutiapa");

        t.descripcion();
   
        System.out.println();
        b.descripcion();


        System.out.println("\n====================================");
        System.out.println("===== EJERCICIO 5: EMPLEADO =====");
        System.out.println("====================================");

        Empleado emp = new Empleado("Carlos López", 3500);
        Gerente ger = new Gerente("Ana Pérez", 5000, 1200);

        emp.mostrar();
        System.out.println("Salario calculado: Q" + emp.calcularSalario());
        System.out.println();
        ger.mostrar();


        System.out.println("\n====================================");
        System.out.println("===== EJERCICIO 6: ANIMAL =====");
        System.out.println("====================================");

        Animal a = new Animal();
        Perro p1 = new Perro();

        a.hacerSonido();
        p1.hacerSonido();

        System.out.println("\nPolimorfismo:");
        Perro x = new Perro();
        x.hacerSonido();


        System.out.println("\n====================================");
        System.out.println("===== EJERCICIO 7: VEHÍCULO =====");
        System.out.println("====================================");

        Vehiculo v = new Vehiculo("Toyota", 120);
        Moto m = new Moto("Honda", 140, 250);

        v.mostrarInfo();
        System.out.println();
        m.mostrarInfo();


        System.out.println("\n====================================");
        System.out.println("===== EJERCICIO 8: FIGURAS =====");
        System.out.println("====================================");

        Rectangulo r = new Rectangulo(5, 3);
        Circulo c = new Circulo(4);

        r.mostrarArea();
        System.out.println();
        c.mostrarArea();

        System.out.println("\nPolimorfismo:");
        Rectangulo f1 = new Rectangulo(2, 10);
        Figura f2 = new Figura();

        f1.mostrarArea();
        f2.mostrarArea();


        System.out.println("\n====================================");
        System.out.println("===== EJERCICIO 9: LIBRO =====");
        System.out.println("====================================");

        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        LibroDigital ebook = new LibroDigital("Java Fundamentals", "Oracle Press", 5.8);

        libro.mostrarInfo();
        System.out.println();
        ebook.mostrarInfo();


        System.out.println("\n====================================");
        System.out.println("===== EJERCICIO 10: FACTURAS =====");
        System.out.println("====================================");

        Cliente c1 = new Cliente("Carlos López", "1234567-8");

        FacturaContado fc = new FacturaContado(101, c1, 500, 50);
        FacturaCredito fcr = new FacturaCredito(102, c1, 800, 120, 4);

        System.out.println("Factura al contado:");
        fc.mostrar();

        System.out.println("\nFactura al crédito:");
        fcr.mostrar();


        System.out.println("\n====================================");
        System.out.println("===== FIN DE TODAS LAS PRUEBAS =====");
        System.out.println("====================================");
        
    }
}
/*
HERENCIA:
- Cada ejercicio implementa una relación padre-hijo usando extends.
- Se reutiliza código mediante super() y super.metodo().

SOBREESCRITURA:
- Las clases hijas redefinen métodos como mostrar(), calcularTotal(), hacerSonido(), etc.

ENCAPSULAMIENTO:
- Atributos privados o protected según necesidad.
- Validaciones en setters y constructores.

POLIMORFISMO:
- Se demuestra en Animal/Perro y Figura/Rectangulo/Circulo.

VALIDACIONES:
- Totales no negativos en Factura.
- Sobregiro controlado en CuentaCorriente.
- Fechas de vencimiento en ProductoPerecedero.

MAIN GENERAL:
- Ejecuta todos los ejercicios en orden.
- Permite verificar el funcionamiento completo del proyecto.
*/
