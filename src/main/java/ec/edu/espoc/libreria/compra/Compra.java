package ec.edu.espoc.libreria.compra;

import ec.edu.espoc.libreria.cliente.Cliente;
import ec.edu.espoc.libreria.libro.Libro;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    private Cliente cliente;
    private List<Libro> libros;

    public Compra(Cliente cliente) {
        this.cliente = cliente;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void resumenCompra() {
        System.out.println("Cliente: " + cliente.getNombre());
        double total = 0;
        for (Libro libro : libros) {
            System.out.println(libro.detalles());
            total += libro.getPrecio() * 1.12;
        }
        System.out.println("Total: $" + String.format("%.2f", total));
    }

}
