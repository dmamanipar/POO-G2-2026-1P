package modelo;

public class Persona {

    public String dni;

    String nombre;

    String apellidos;
    int talla;
    int edad;

    String telefono;

    public Persona(String dni, String apellidos, String nombre) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombre = nombre;
    }


    public Persona(String dni, String telefono, int edad, int talla, String apellidos, String nombre) {
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
        this.talla = talla;
        this.apellidos = apellidos;
        this.nombre = nombre;
    }
}
