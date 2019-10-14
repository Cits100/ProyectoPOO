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
public class ListaTrabajo {
 
    
    private ArrayList trabajosOfrecidos;

    
    
    public Boolean agregarTrabajo(Trabajo trab) {
        
        
        int i;      
        
        for(i=0 ; i<trabajosOfrecidos.size();i++){
          Trabajo trabajo=(Trabajo)trabajosOfrecidos.get(i);
          
            if(trabajo.getId().equals(trab.getId()))
                return false;
        }
        trabajosOfrecidos.add(trab);
        return true;
        
        
    }
    
     public Boolean editarTrabajo(Trabajo trab) {
        
        int i;
        
        
        for(i=0 ; i<trabajosOfrecidos.size();i++){
            
            Trabajo trabajo=(Trabajo)trabajosOfrecidos.get(i);
            if(trabajo.getId().equals(trab.getId())){
                trabajosOfrecidos.set(i, trab);
                return true;
            }
         
        }
        return false;
        
    }
     
     public Boolean elimimarTrabajo(Trabajo trab){
         
         int i;
         for(i=0 ; i<trabajosOfrecidos.size();i++){
             Trabajo trabajo=(Trabajo)trabajosOfrecidos.get(i);
             if(trabajo.getId().equals(trab.getId())){
                 trabajosOfrecidos.remove(i);
                 return true;
             }
             
         }
         return false;
         
     }
     
     public ArrayList buscarTrabajos(String area,String region){
         
         int i;
         ArrayList trabajosEncontrados=new ArrayList();
         
         for(i=0 ; i<trabajosOfrecidos.size();i++){
             
             Trabajo trab=(Trabajo)trabajosOfrecidos.get(i);
             if(trab.getArea().equals(area) && trab.getRegion().equals(region)){
                 trabajosEncontrados.add(trab);
                 
             }
         }
         return trabajosEncontrados;
     }
     
     public Trabajo buscarTrabajos(String id){
         
         int i;
         
         
         for(i=0 ; i<trabajosOfrecidos.size();i++){
             
             Trabajo trab=(Trabajo)trabajosOfrecidos.get(i);
             if(trab.getId().equals(id)){
                 return trab;
                 
             }
         }
         return null;
     }
     
    
    
    
}
