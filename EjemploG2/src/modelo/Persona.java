package modelo;

public class Persona {
    String dni;
    String nombres;
    String apellidos;
    int talla;
    int edad;

    String felefono;

    public Persona(String dni, String nombres, String apellidos, int talla, int edad, String felefono) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.talla = talla;
        this.edad = edad;
        this.felefono = felefono;
    }

}
