package pe.edu.upeu.repository;

import pe.edu.upeu.model.ProfesionalSalud;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProfesionalRepository {

    private static final String ARCHIVO = "padron_salud.csv";

    // Cargar todos los profesionales desde el CSV
    public List<ProfesionalSalud> cargarTodos() {
        List<ProfesionalSalud> lista = new ArrayList<>();
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return lista;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    lista.add(ProfesionalSalud.fromCsv(linea));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return lista;
    }

    // Guardar toda la lista en el CSV (sobreescribe)
    public void guardarTodos(List<ProfesionalSalud> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO, false))) {
            for (ProfesionalSalud p : lista) {
                bw.write(p.toCsv());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
