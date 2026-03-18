package modelo;

public class Persona {
    String dni;
    String nombre;
    String apellidos;
    int talla;
    int edad;
    String telefono;

    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellidos, int talla, int edad, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.talla = talla;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getTalla() {
        return talla;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }
}
