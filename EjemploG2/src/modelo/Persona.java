package modelo;

public class Persona {
    public String dni;
    String nombre;
    String apellido;
    int talla;
    int edad;
    String telefono;

    public Persona(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona() {
    }
}
