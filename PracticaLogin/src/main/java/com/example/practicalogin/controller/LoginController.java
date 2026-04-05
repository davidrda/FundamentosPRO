package com.example.practicalogin.controller;

import com.example.practicalogin.model.Administrador;
import com.example.practicalogin.model.Trabajador;
import com.example.practicalogin.model.Usuario;
import com.example.practicalogin.service.GestorFichajes;
import com.example.practicalogin.service.GestorUsuarios;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button btnIniciar;

    @FXML
    private TextField editCorreo;

    @FXML
    private TextField editPass;

    GestorUsuarios gestorUsuarios;
    GestorFichajes gestorFichajes;

    public void setGestorUsuarios(GestorUsuarios gestorUsuarios) {
        this.gestorUsuarios = gestorUsuarios; // lo recibe del LoginController
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        actions();
        instances();
    }

    private void instances() {
        gestorUsuarios = new GestorUsuarios();
        gestorFichajes = new GestorFichajes();
    }

    private void actions() {
        btnIniciar.setOnAction(event -> {
            String correo = editCorreo.getText();
            String pass = editPass.getText();
            Usuario usuario = gestorUsuarios.autenticar(correo, pass);
            if (usuario == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("NO HAY DATOS");
                alert.setContentText("Rellena los datos para poder iniciar sesión correctamente");
                alert.show();
            }

            try {
                if (usuario instanceof Administrador) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource(
                            "/com/example/practicalogin/admin-view.fxml"));
                    Scene scene = new Scene(loader.load());

                    AdminController adminController = loader.getController();
                    adminController.setGestorUsuarios(gestorUsuarios);
                    adminController.setGestorFichajes(gestorFichajes);

                    Stage stage = (Stage) btnIniciar.getScene().getWindow();
                    stage.setTitle("Panel de administración");
                    stage.setScene(scene);
                    stage.show();

                } else if (usuario instanceof Trabajador) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource(
                            "/com/example/practicalogin/trabajador-view.fxml"));
                    Scene scene = new Scene(loader.load());

                    TrabajadorController trabajadorController = loader.getController();
                    trabajadorController.setTrabajador((Trabajador) usuario); // el trabajador autenticado
                    trabajadorController.setGestorFichajes(gestorFichajes);   // para poder fichar
                    trabajadorController.setGestorUsuarios(gestorUsuarios);   // para volver al login con el mismo gestor

                    Stage stage = (Stage) btnIniciar.getScene().getWindow();
                    stage.setTitle("Panel del trabajador");
                    stage.setScene(scene);
                    stage.show();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        });
    }
}
