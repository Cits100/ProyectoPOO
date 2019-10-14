/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class ListaPostulante {
    
    private ArrayList postulantes;
    
     public boolean agregarPostulante(Persona per){
         
         postulantes.add(per);
         return true;
         
     }
    
}
