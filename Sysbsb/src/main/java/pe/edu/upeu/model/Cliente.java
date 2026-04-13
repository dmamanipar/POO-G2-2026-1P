package pe.edu.upeu.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Cliente {
    private String idDNI;
    private String Nombre;
    private String Telefono;
    private String Gmail;
}
