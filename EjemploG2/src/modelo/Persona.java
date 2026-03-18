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
    public Persona(){

    }

    public Persona(String dni, String telefono, int talla, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.telefono = telefono;
        this.talla = talla;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
