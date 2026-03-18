package modelo;

public class Persona {
    String DNI;
    String Nombre;
    String Apellidos;
    int Talla;
    int Edad;
    String Télefono;

    public Persona(String DNI, String nombre, String apellidos) {
        this.DNI = DNI;
        Nombre = nombre;
        Apellidos = apellidos;
    }

    public Persona(String DNI, String nombre, String apellidos, int talla, int edad, String télefono) {
        this.DNI = DNI;
        Nombre = nombre;
        Apellidos = apellidos;
        Talla = talla;
        Edad = edad;
        Télefono = télefono;
    }
}
