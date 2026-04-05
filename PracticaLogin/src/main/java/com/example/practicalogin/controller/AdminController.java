package com.example.practicalogin.controller;

import com.example.practicalogin.model.Trabajador;
import com.example.practicalogin.service.GestorFichajes;
import com.example.practicalogin.service.GestorUsuarios;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {

    @FXML
    private Button btnCambiarPass;

    @FXML
    private Button btnDarDeAlta;

    @FXML
    private Button btnDarDeBaja;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private TextField editDniTrabajador;

    @FXML
    private TextField editNuevaPass;

    @FXML
    private Button btnVerDatos;

    @FXML
    private Button btnVerRegistros;

    @FXML
    private TextField editApellido;

    @FXML
    private TextField editCorreo;

    @FXML
    private TextField editDni;

    @FXML
    private TextField editNombre;

    @FXML
    private TextField editPass;

    @FXML
    private ListView<String> listaTrabajadores;

    @FXML
    private TextArea textAreaMostrarResultados;

    @FXML
    private Button btnVerTrabajadores;

    @FXML
    void onVerTrabajadoresClick(ActionEvent event) {
        listaTrabajadores.getItems().clear();

        for (Trabajador t : gestorUsuarios.verTrabajadores()) {
            String linea = t.getNombre() + " " + t.getApellido() + " - DNI: " + t.getDni();
            listaTrabajadores.getItems().add(linea);
        }
    }

    @FXML
    void onCerrarSesionClick(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                    "/com/example/practicalogin/login-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            LoginController loginController = fxmlLoader.getController();
            loginController.setGestorUsuarios(this.gestorUsuarios);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    @FXML
    void onCambiarPassClick(ActionEvent event) {
        String dni = editDniTrabajador.getText();
        String newPass = editNuevaPass.getText();
        if (gestorUsuarios.cambiarPass(dni, newPass)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Contraseña cambiada");
            alert.setContentText("Contraseña cambiada con éxito");
            alert.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error");
            alert.setContentText("No se ha podido cambiar la contraseña");
            alert.show();
        }
    }

    @FXML
    void onDarAltaClick(ActionEvent event) {
        String nombre = editNombre.getText();
        String apellido = editApellido.getText();
        String dni = editDni.getText();
        String correo = editCorreo.getText();
        String pass = editPass.getText();
        if (editNombre.getText().isEmpty() || editApellido.getText().isEmpty() ||
                editDni.getText().isEmpty() || editCorreo.getText().isEmpty() ||
                editPass.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Campos vacíos");
            alert.setContentText("Rellena todos los campos para dar de alta un trabajador");
            alert.show();
            return;
        }
        Trabajador trabajador = new Trabajador(nombre, apellido, dni, correo, pass);
        if (gestorUsuarios.darDeAlta(trabajador) ) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Trabajador agregado");
            alert.setContentText("Trabajador agregado con éxito");
            alert.show();
        }
    }

    @FXML
    void onDarDeBajaClick(ActionEvent event) {
        String dni = editDniTrabajador.getText();
        if (gestorUsuarios.darDeBaja(dni)){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Trabajador eliminado");
            alert.setContentText("Trabajador eliminado con éxito");
            alert.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Error");
            alert.setContentText("No se ha podido eliminar");
            alert.show();
        }
    }

    @FXML
    void onVerDatosClick(ActionEvent event) {
        String dni = editDniTrabajador.getText();
        Trabajador t = gestorUsuarios.verDatos(dni);
        if (t != null) {
            String texto = "Nombre: " + t.getNombre() + "\n" +
                    "Apellido: " + t.getApellido() + "\n" +
                    "DNI: " + t.getDni() + "\n" +
                    "Correo: " + t.getCorreo();
            textAreaMostrarResultados.setText(texto);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error");
            alert.setContentText("No se ha encontrado ningún trabajador con ese DNI");
            alert.show();
        }

    }

    @FXML
    void onVerRegistrosClick(ActionEvent event) {
        String texto = gestorFichajes.verRegistros();
        textAreaMostrarResultados.setText(texto);
    }

    // No se declara otro gestorUsuarios, simplemente lo recibe del LoginController
    GestorUsuarios gestorUsuarios;

    public void setGestorUsuarios(GestorUsuarios gestorUsuarios) {
        this.gestorUsuarios = gestorUsuarios; // lo recibe del LoginController
    }

    GestorFichajes gestorFichajes;

    public void setGestorFichajes(GestorFichajes gestorFichajes) {
        this.gestorFichajes = gestorFichajes;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initGUI();
    }

    private void initGUI() {
    }

}
