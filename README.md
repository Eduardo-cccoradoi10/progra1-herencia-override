# progra1-herencia-override
---

# 📘 **README — Proyecto de Herencia en Java**

## 🎯 Objetivo General
Este proyecto implementa **10 ejercicios de herencia en Java**, aplicando:

- Herencia simple  
- Sobreescritura de métodos (`@Override`)  
- Uso de `super` en constructores y métodos  
- Encapsulamiento  
- Polimorfismo  
- Validaciones  
- Métodos especializados en clases hijas  

Cada ejercicio representa un caso práctico de herencia orientado a objetos.

---

# 📂 **Estructura del Proyecto**

```
progra1-herencia-override
│
├── src
│   ├── herencia
│   │     ├── Main.java
│   │
│   ├── herencia.ejercicio1
│   │     ├── Persona.java
│   │     ├── Docente.java
│   │     ├── Estudiante.java
│   │     └── MainHerencia1.java
│   │
│   ├── herencia.ejercicio2
│   │     ├── Cuenta.java
│   │     ├── CuentaCorriente.java
│   │     └── MainHerencia2.java
│   │
│   ├── herencia.ejercicio3
│   │     ├── Producto.java
│   │     ├── ProductoPerecedero.java
│   │     └── MainHerencia3.java
│   │
│   ├── herencia.ejercicio4
│   │     ├── Transporte.java
│   │     ├── Bus.java
│   │     └── MainHerencia4.java
│   │
│   ├── herencia.ejercicio5
│   │     ├── Empleado.java
│   │     ├── Gerente.java
│   │     └── MainHerencia5.java
│   │
│   ├── herencia.ejercicio6
│   │     ├── Animal.java
│   │     ├── Perro.java
│   │     └── MainHerencia6.java
│   │
│   ├── herencia.ejercicio7
│   │     ├── Vehiculo.java
│   │     ├── Moto.java
│   │     └── MainHerencia7.java
│   │
│   ├── herencia.ejercicio8
│   │     ├── Figura.java
│   │     ├── Rectangulo.java
│   │     ├── Circulo.java
│   │     └── MainHerencia8.java
│   │
│   ├── herencia.ejercicio9
│   │     ├── Libro.java
│   │     ├── LibroDigital.java
│   │     └── MainHerencia9.java
│   │
│   └── herencia.ejercicio10
│         ├── Cliente.java
│         ├── Factura.java
│         ├── FacturaContado.java
│         ├── FacturaCredito.java
│         └── MainHerencia10.java
│
└── JRE System Library [JavaSE-1.8]

```

---

# 🧪 **Ejercicios Implementados**

## **1️⃣ Persona, Docente, Estudiante**
- Clase base: `Persona`
- Clases hijas: `Docente`, `Estudiante`
- Uso de `@Override` en `mostrar()`
- Uso de `super.mostrar()`

---

## **2️⃣ Cuenta y CuentaCorriente**
- Clase base: `Cuenta`
- Clase hija: `CuentaCorriente`
- Sobregiro permitido con límite
- Sobrescritura de `retirar()`

---

## **3️⃣ Producto y ProductoPerecedero**
- Clase base: `Producto`
- Clase hija: `ProductoPerecedero`
- Atributo adicional: `fechaVencimiento`
- Método `estaVencido()`

---

## **4️⃣ Transporte y Bus**
- Clase base: `Transporte`
- Clase hija: `Bus`
- Método sobrescrito: `descripcion()`

---

## **5️⃣ Empleado y Gerente**
- Clase base: `Empleado`
- Clase hija: `Gerente`
- Sobrescritura de `calcularSalario()`

---

## **6️⃣ Animal y Perro**
- Clase base: `Animal`
- Clase hija: `Perro`
- Sobrescritura de `hacerSonido()`
- Demostración de polimorfismo

---

## **7️⃣ Vehiculo y Moto**
- Clase base: `Vehiculo`
- Clase hija: `Moto`
- Método sobrescrito: `mostrarInfo()`

---

## **8️⃣ Figura, Rectangulo y Circulo**
- Clase base: `Figura`
- Clases hijas: `Rectangulo`, `Circulo`
- Sobrescritura de `calcularArea()`

---

## **9️⃣ Libro y LibroDigital**
- Clase base: `Libro`
- Clase hija: `LibroDigital`
- Sobrescritura de `mostrarInfo()`

---

## **🔟 Sistema de Facturación**
Incluye:

### **Clases:**
- `Cliente`
- `Factura` (base)
- `FacturaContado` (descuento)
- `FacturaCredito` (recargo + cuotas)

### **Características:**
- Sobrescritura de `calcularTotal()`
- Validación de totales negativos
- Uso de `super` en constructores y métodos
- Cálculo de cuotas mensuales

---

# ▶️ **Ejecución del Proyecto**

Ejecuta la clase:

```
Main.java
```

Esta clase contiene **todas las pruebas de los ejercicios 1–10**, organizadas por secciones.

---

# 📝 **Explicación General**

```java
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
```

---

# 👨‍💻 **Autor**
Proyecto desarrollado por **Carlos Eduardo Corado Ibañez 0905-25-5315**, como práctica de herencia en Java.

---
