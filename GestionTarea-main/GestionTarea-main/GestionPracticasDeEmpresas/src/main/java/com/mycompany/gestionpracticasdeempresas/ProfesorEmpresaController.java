/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.gestionpracticasdeempresas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author AlejandroVicenteJarn
 */
public class ProfesorEmpresaController implements Initializable {


    @FXML
    private TextField nombreTxt;
    @FXML
    private TextField telefonoTxt;
    @FXML
    private TextField responsableTxt;
    @FXML
    private TextField incidenciasTxt;
    @FXML
    private TextField emailTxt;
    @FXML
    private Button añadirBtn;
    @FXML
    private TableView<?> tablaEmpresa;
    @FXML
    private TableColumn<?, ?> colId;
    @FXML
    private TableColumn<?, ?> colNombre;
    @FXML
    private TableColumn<?, ?> colTelefono;
    @FXML
    private TableColumn<?, ?> colResponsable;
    @FXML
    private TableColumn<?, ?> colIncidencias;
    @FXML
    private TableColumn<?, ?> colEmail;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
