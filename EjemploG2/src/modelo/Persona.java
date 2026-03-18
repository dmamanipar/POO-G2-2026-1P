package modelo;

public class Persona {
    String DNI;
    String NOMBRE;
    String APELLIDOS;
    int TALLA;
    int EDAD;
    String TELEEFONO;


    public Persona(String DNI) {
        this.DNI = DNI;
    }

    public Persona(String DNI, String NOMBRE, String APELLIDOS, int TALLA, int EDAD, String TELEEFONO) {
        this.DNI = DNI;
        this.NOMBRE = NOMBRE;
        this.APELLIDOS = APELLIDOS;
        this.TALLA = TALLA;
        this.EDAD = EDAD;
        this.TELEEFONO = TELEEFONO;
    }
}
