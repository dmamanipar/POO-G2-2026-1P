package pe.edu.upeu.model;

import pe.edu.upeu.enums.TipoContrato;

public class ProfesionalSalud {

    private String nombreCompleto;
    private String cedulaProfesional; // única
    private String especialidad;
    private String institucion;
    private TipoContrato tipoContrato;

    public ProfesionalSalud(String nombreCompleto, String cedulaProfesional,
                            String especialidad, String institucion,
                            TipoContrato tipoContrato) {
        this.nombreCompleto   = nombreCompleto;
        this.cedulaProfesional = cedulaProfesional;
        this.especialidad     = especialidad;
        this.institucion      = institucion;
        this.tipoContrato     = tipoContrato;
    }

    // Getters
    public String getNombreCompleto()    { return nombreCompleto; }
    public String getCedulaProfesional() { return cedulaProfesional; }
    public String getEspecialidad()      { return especialidad; }
    public String getInstitucion()       { return institucion; }
    public TipoContrato getTipoContrato(){ return tipoContrato; }

    // Setters
    public void setNombreCompleto(String nombreCompleto)       { this.nombreCompleto = nombreCompleto; }
    public void setCedulaProfesional(String cedulaProfesional) { this.cedulaProfesional = cedulaProfesional; }
    public void setEspecialidad(String especialidad)           { this.especialidad = especialidad; }
    public void setInstitucion(String institucion)             { this.institucion = institucion; }
    public void setTipoContrato(TipoContrato tipoContrato)     { this.tipoContrato = tipoContrato; }

    // Para mostrar en CSV
    public String toCsv() {
        return nombreCompleto + "," + cedulaProfesional + "," +
                especialidad + "," + institucion + "," + tipoContrato.name();
    }

    // Para crear un objeto desde una línea CSV
    public static ProfesionalSalud fromCsv(String linea) {
        String[] partes = linea.split(",");
        return new ProfesionalSalud(
                partes[0],
                partes[1],
                partes[2],
                partes[3],
                TipoContrato.valueOf(partes[4])
        );
    }

    @Override
    public String toString() {
        return nombreCompleto + " | " + cedulaProfesional + " | " +
                especialidad + " | " + institucion + " | " + tipoContrato;
    }
}