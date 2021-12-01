package com.mycompany.gestionpracticasdeempresas;

import java.io.IOException;
import java.io.Serializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LoginController implements Serializable {

    @FXML
    private Label lUsuario;
    @FXML
    private Label lContraseña;
    @FXML
    private TextField Usuariotxt;
    @FXML
    private PasswordField Contraseñatxt;
    @FXML
    private Button IniciarSesion;
    @FXML
    private Button Cancelar;

    public void initialize() {
    }

    private void IniciarSesion(ActionEvent event) {
        //Session s = HibernateUtil.getSessionFactory().openSession();
        //Transaction t = s.beginTransaction();
        

    }

    private void Cancelar() {
        System.exit(0);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot(" ");
    }
}
