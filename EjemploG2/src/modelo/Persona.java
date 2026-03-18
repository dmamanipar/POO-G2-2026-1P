package modelo;

public class Persona {
    String dni;
    String nombre;
    String apellidos;
    int talla;
    int edad;
    String telefono;

    public Persona(String dni, String nombre, String apellidos, int talla, int edad, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.talla = talla;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
}
