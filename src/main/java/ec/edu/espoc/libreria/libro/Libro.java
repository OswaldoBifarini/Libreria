package ec.edu.espoc.libreria.libro;

import ec.edu.espoc.libreria.genero.Genero;

public class Libro {

    private String titulo;
    private String autor;
    private double precio;
    private Genero genero;

    public Libro(String titulo, String autor, double precio, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

    public String detalles() {
        double precioConIva = precio * 1.12;
        return "Titulo: " + titulo + ", Genero: " + genero.getDescripcion()
                + ", Precio sin IVA: $" + precio + ", Precio con IVA: $" + String.format("%.2f", precioConIva);
    }
}

