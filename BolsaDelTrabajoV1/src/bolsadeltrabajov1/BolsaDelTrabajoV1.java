/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsadeltrabajov1;

/**
 *
 * @author felip
 */

import java.awt.Button;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class BolsaDelTrabajoV1 extends Application{

    /**
     * @param stage
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    
    
    
    @Override
    
    public void start(Stage stage) throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource("Vista.Ventana1.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Application.launch(args);
        
        
    }
    
    
}
