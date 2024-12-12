package ec.edu.espoc.libreria.genero;

public enum Genero {
FICCION("Ficción"),
    NO_FICCION("No Ficción"),
    EDUCATIVO("Educativo");

    private final String descripcion;

    Genero(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
