
package ec.edu.espoc.libreria;

import ec.edu.espoc.libreria.cliente.Cliente;
import ec.edu.espoc.libreria.compra.Compra;
import ec.edu.espoc.libreria.genero.Genero;
import ec.edu.espoc.libreria.libro.Libro;


public class Libreria {

    public static void main(String[] args) {
    
        // Crear libros
        Libro libro1 = new Libro("1984", "George Orwell", 15.0, Genero.FICCION);
        Libro libro2 = new Libro("Sapiens", "Yuval Noah Harari", 20.0, Genero.NO_FICCION);

        // Crear cliente
        Cliente cliente1 = new Cliente(1, "Juan Perez");

        // Crear compra
        Compra compra1 = new Compra(cliente1);
        compra1.agregarLibro(libro1);
        compra1.agregarLibro(libro2);

        // Mostrar detalles de los libros y resumen de la compra
        System.out.println("Detalles de los libros:");
        compra1.resumenCompra();
    }

    }

