package ec.edu.espoc.libreria.cliente;

public class Cliente {

    private int idCliente;
    private String nombre;
    
    public Cliente(int idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
