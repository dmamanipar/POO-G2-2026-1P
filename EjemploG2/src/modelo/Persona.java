package modelo;

public class Persona {
    String dni;
    String nombres;
    String apellido;
    int talla;
    int edad;
    String telefono;

    public Persona(String dni, String nombres, String apellido, int talla, int edad, String telefono) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellido = apellido;
        this.talla = talla;
        this.edad = edad;
        this.telefono = telefono;

    }

    public Persona(String dni, String nombres, String apellido) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellido = apellido;
    }
}
