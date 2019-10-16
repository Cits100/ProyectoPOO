/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import java.awt.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
/**
 * FXML Controller class
 *
 * @author felip
 */
public class Ventana2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button btnIngresar;
    
    @FXML
    private Button btnRegistrarse;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }    
    
    
    @FXML
    private void ingresarEmpresa(ActionEvent event) {
        
      try{  
        
        
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/Vista/Ventana3.fxml"));
        
        Parent root= loader.load();
        
        Ventana3Controller controlador=loader.getController();
        
        Scene scene=new Scene(root);
        
        Stage stage2=new Stage();
        
        stage2.setScene(scene);
        
        stage2.show();
        
        stage2.setOnCloseRequest(e -> controlador.closeWindows());
        
        //Stage myStage=(Stage) this.btnEmpresa.getScene().getWindow();
        
        //myStage.close();
        //stage2.alwaysOnTopProperty();
        
        //stage2.initModality(Modality.NONE);
        
        
      }catch (Exception e){
          
          System.out.println("No se pudo abrir la ventana");
          
      }
    }
    
    public void closeWindows(){
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Ventana1Controller.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Creo la scene y el stage
            Scene scene = new Scene(root);
            Stage stage = new Stage();

            // Asocio el stage con el scene
            stage.setScene(scene);
            stage.show();

            stage.close();

        } catch (IOException ex) {
            Logger.getLogger(Ventana1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
}
