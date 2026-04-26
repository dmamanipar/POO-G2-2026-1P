package pe.edu.upeu.service;

import pe.edu.upeu.model.ProfesionalSalud;
import pe.edu.upeu.repository.ProfesionalRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProfesionalService {

    private final ProfesionalRepository repository;
    private List<ProfesionalSalud> lista;

    public ProfesionalService() {
        this.repository = new ProfesionalRepository();
        this.lista = repository.cargarTodos();
    }

    // Registrar — valida cédula única
    public boolean registrar(ProfesionalSalud profesional) {
        boolean cedulaExiste = lista.stream()
                .anyMatch(p -> p.getCedulaProfesional()
                        .equalsIgnoreCase(profesional.getCedulaProfesional()));
        if (cedulaExiste) return false;

        lista.add(profesional);
        repository.guardarTodos(lista);
        return true;
    }

    // Obtener todos
    public List<ProfesionalSalud> obtenerTodos() {
        return lista;
    }

    // Buscar por especialidad
    public List<ProfesionalSalud> buscarPorEspecialidad(String especialidad) {
        return lista.stream()
                .filter(p -> p.getEspecialidad()
                        .equalsIgnoreCase(especialidad.trim()))
                .collect(Collectors.toList());
    }

    // Eliminar por cédula
    public boolean eliminar(String cedula) {
        boolean eliminado = lista.removeIf(
                p -> p.getCedulaProfesional().equalsIgnoreCase(cedula)
        );
        if (eliminado) repository.guardarTodos(lista);
        return eliminado;
    }
}
