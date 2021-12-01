/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.gestionpracticasdeempresas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author AlejandroVicenteJarn
 */
public class ProfesorAlumnoController implements Initializable {


    @FXML
    private TextField nombretxt;
    @FXML
    private TextField apellidostxt;
    @FXML
    private PasswordField contraseñatxt;
    @FXML
    private DatePicker fechaCal;
    @FXML
    private TextField emailtxt;
    @FXML
    private TextField telefonotxt;
    @FXML
    private TextField dualtxt;
    @FXML
    private TextField fctTxt;
    @FXML
    private TextArea observacionestxt;
    @FXML
    private ComboBox<?> comboProfesor;
    @FXML
    private ComboBox<?> comboEmpresa;
    @FXML
    private TableView<?> tablaAlumnos;
    @FXML
    private TableColumn<?, ?> colId;
    @FXML
    private TableColumn<?, ?> colNombre;
    @FXML
    private TableColumn<?, ?> colApellidos;
    @FXML
    private TableColumn<?, ?> colContraseña;
    @FXML
    private TableColumn<?, ?> colDNI;
    @FXML
    private TableColumn<?, ?> colFecha;
    @FXML
    private TableColumn<?, ?> colEmail;
    @FXML
    private TableColumn<?, ?> colTelefono;
    @FXML
    private TableColumn<?, ?> colDual;
    @FXML
    private TableColumn<?, ?> colFct;
    @FXML
    private TableColumn<?, ?> colObservaciones;
    @FXML
    private TableColumn<?, ?> colProfesor;
    @FXML
    private TableColumn<?, ?> colEmpresa;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
