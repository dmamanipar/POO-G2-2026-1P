package pe.edu.upeu.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import pe.edu.upeu.enums.TipoContrato;
import pe.edu.upeu.model.ProfesionalSalud;
import pe.edu.upeu.service.ProfesionalService;

public class PadronController {

    // --- Campos del formulario ---
    @FXML private TextField txtNombre;
    @FXML private TextField txtCedula;
    @FXML private TextField txtEspecialidad;
    @FXML private TextField txtInstitucion;
    @FXML private ComboBox<TipoContrato> cboContrato;

    // --- Búsqueda ---
    @FXML private TextField txtBusqueda;

    // --- Tabla ---
    @FXML private TableView<ProfesionalSalud> tablaPadron;
    @FXML private TableColumn<ProfesionalSalud, String> colNombre;
    @FXML private TableColumn<ProfesionalSalud, String> colCedula;
    @FXML private TableColumn<ProfesionalSalud, String> colEspecialidad;
    @FXML private TableColumn<ProfesionalSalud, String> colInstitucion;
    @FXML private TableColumn<ProfesionalSalud, String> colContrato;

    // --- Label de mensajes ---
    @FXML private Label lblMensaje;

    private final ProfesionalService service = new ProfesionalService();
    private final ObservableList<ProfesionalSalud> datosTabla = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Configurar columnas con PropertyValueFactory usando lambdas (compatible con modelo sin PropertyValueFactory)
        colNombre.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getNombreCompleto()));
        colCedula.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getCedulaProfesional()));
        colEspecialidad.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getEspecialidad()));
        colInstitucion.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getInstitucion()));
        colContrato.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getTipoContrato().name()));

        // Cargar opciones del ComboBox
        cboContrato.setItems(FXCollections.observableArrayList(TipoContrato.values()));

        // Cargar tabla
        tablaPadron.setItems(datosTabla);
        actualizarTabla(service.obtenerTodos());
    }

    @FXML
    public void registrar() {
        String nombre      = txtNombre.getText().trim();
        String cedula      = txtCedula.getText().trim();
        String especialidad = txtEspecialidad.getText().trim();
        String institucion = txtInstitucion.getText().trim();
        TipoContrato contrato = cboContrato.getValue();

        // Validar campos vacíos
        if (nombre.isEmpty() || cedula.isEmpty() || especialidad.isEmpty()
                || institucion.isEmpty() || contrato == null) {
            mostrarMensaje("⚠ Todos los campos son obligatorios.");
            return;
        }

        ProfesionalSalud nuevo = new ProfesionalSalud(nombre, cedula, especialidad, institucion, contrato);
        boolean ok = service.registrar(nuevo);

        if (ok) {
            mostrarMensaje("✔ Profesional registrado correctamente.");
            limpiarFormulario();
            actualizarTabla(service.obtenerTodos());
        } else {
            mostrarMensaje("✘ La cédula ya está registrada. Debe ser única.");
        }
    }

    @FXML
    public void buscar() {
        String termino = txtBusqueda.getText().trim();
        if (termino.isEmpty()) {
            actualizarTabla(service.obtenerTodos());
            mostrarMensaje("Mostrando todos los profesionales.");
        } else {
            actualizarTabla(service.buscarPorEspecialidad(termino));
            mostrarMensaje("Resultados para especialidad: " + termino);
        }
    }

    @FXML
    public void eliminar() {
        ProfesionalSalud seleccionado = tablaPadron.getSelectionModel().getSelectedItem();
        if (seleccionado == null) {
            mostrarMensaje("⚠ Selecciona un profesional de la tabla para eliminar.");
            return;
        }
        boolean ok = service.eliminar(seleccionado.getCedulaProfesional());
        if (ok) {
            mostrarMensaje("✔ Profesional eliminado.");
            actualizarTabla(service.obtenerTodos());
        }
    }

    @FXML
    public void limpiar() {
        limpiarFormulario();
        mostrarMensaje("");
    }

    // --- Métodos auxiliares ---
    private void actualizarTabla(java.util.List<ProfesionalSalud> lista) {
        datosTabla.setAll(lista);
    }

    private void limpiarFormulario() {
        txtNombre.clear();
        txtCedula.clear();
        txtEspecialidad.clear();
        txtInstitucion.clear();
        cboContrato.setValue(null);
    }

    private void mostrarMensaje(String mensaje) {
        lblMensaje.setText(mensaje);
    }
}