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
public class ListaPersona {
    
    private ArrayList personas;
   
   
   public ArrayList buscarTrabajos(String rut,String area,String region){
       
       Persona persona=new Persona(null,null,null,null,0,null);
       
       ArrayList trab=persona.buscarTrabajos(area, region);
       
       return trab;
       
               
   }
   
   
   
   public void postularTrabajo(String id,String rut){
        
        Persona postulante=new Persona(null,null,null,null,0,null);
        
        Trabajo trab=postulante.buscarTrabajos(id);
        int i;
        
        for(i=0 ; i<personas.size();i++){
            
            Persona p=(Persona)personas.get(i);
            if(p.getRut().equals(rut)){
                trab.getPostulantes().agregarPostulante(p);
                p.agregarTrabajo(trab);
            }
        }
        
    }
    
    
    
}
