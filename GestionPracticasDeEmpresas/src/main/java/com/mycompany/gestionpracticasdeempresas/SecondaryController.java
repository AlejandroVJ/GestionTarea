/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionpracticasdeempresas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author USUARIO
 */
public class SecondaryController implements Initializable {

    @FXML
    private TableView<?> TablaAct;
    @FXML
    private TableColumn<?, ?> cId;
    @FXML
    private TableColumn<?, ?> cIdAlumno;
    @FXML
    private TableColumn<?, ?> cNombre;
    @FXML
    private TableColumn<?, ?> cHoras;
    @FXML
    private TableColumn<?, ?> cFecha;
    @FXML
    private TableColumn<?, ?> cIncidencias;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
