package modelo;

public class Persona {
    String DNI;
    String Nombre;
    String Apellidos;
    int Talla;
    int Edad;
    String Telefono;
    public persona(String DNI, String nombre, String apellidos){
        this.DNI = DNI;
        Nombre = nombre;
        Apellidos = apellidos;
    }

    public Persona(String DNI, String nombre, String apellidos, int edad,String telefono){
        this.DNI = DNI;
        Nombre = nombre;
        Apellidos = apellidos;
        Talla = talla;
        Edad = edad;
        telefono = telefono;

    }
}
