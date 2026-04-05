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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TrabajadorController implements Initializable {

    private Trabajador trabajador;
    private GestorFichajes gestorFichajes;
    private GestorUsuarios gestorUsuarios;

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
        lblNombre.setText("¡Bienvenid@, " + trabajador.getNombre() + "!");
    }

    public void setGestorFichajes(GestorFichajes gestorFichajes) {
        this.gestorFichajes = gestorFichajes;
    }

    public void setGestorUsuarios(GestorUsuarios gestorUsuarios) {
        this.gestorUsuarios = gestorUsuarios;
    }

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button btnFichar;

    @FXML
    private Label lblNombre;

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
    void onFicharClick(ActionEvent event) {
        gestorFichajes.registrarFichaje(trabajador);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("¡Fichaje hecho!");
        alert.setHeaderText("Acabas de fichar correctamente");
        alert.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
