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
    private Button boton;
    
    @FXML
    private Label etiqueta;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event)throws IOException {
        
      try{  
        Stage stage2=new Stage();
        
        FXMLLoader loader=new FXMLLoader(getClass().getResource("Vista.Ventana2.fxml"));
        
        Parent root=(Parent) loader.load();
        
        
        stage2.setScene(new Scene(root));
        
        //stage2.alwaysOnTopProperty();
        
        //stage2.initModality(Modality.NONE);
        
        stage2.show();
      }catch (Exception e){
          
          System.out.println("No se pudo abrir la ventana");
          
      }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
