/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import java.awt.Button;
import java.awt.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author felip
 */
public class Ventana1Controller implements Initializable  {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button btnEmpresa;
    @FXML
    private Button btnPersona;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void ingresoEmpresa(ActionEvent event) {
        
      try{  
          
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/Vista/Ventana2.fxml"));
        
        Parent root= loader.load();
        
        Ventana2Controller controlador=loader.getController();
        
        Scene scene=new Scene(root);
        
        Stage stage2=new Stage();
        
        stage2.setScene(scene);
        
        stage2.show();
        
        stage2.setOnCloseRequest(e -> controlador.closeWindows());
        
        //Node node=(Node) event.getSource();
        
        //Stage myStage=(Stage) node.getScene().getWindow();
        
        //myStage.close();
        //stage2.alwaysOnTopProperty();
        
        //stage2.initModality(Modality.NONE);
        
        
      }catch (Exception e){
          
          System.out.println("No se pudo abrir la ventana");
          
      }
    }
    @FXML
    private void ingresoPersona(ActionEvent event) {
        
      try{  
        
        
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/Vista/Ventana4.fxml"));
        
        Parent root= loader.load();
        
        Ventana3Controller controlador=loader.getController();
        
        Scene scene=new Scene(root);
        
        Stage stage2=new Stage();
        
        stage2.setScene(scene);
        
        stage2.show();
        
        stage2.setOnCloseRequest(e -> controlador.closeWindows());
        
        //Stage myStage=(Stage) this.btnPersona.getScene().getWindow();
        
        //myStage.close();
        //stage2.alwaysOnTopProperty();
        
        //stage2.initModality(Modality.NONE);
        
        
      }catch (Exception e){
          
          System.out.println("No se pudo abrir la ventana");
          
      }
    }
    
}
