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
public class ListaEmpresa {
    
    private ArrayList empresas;
    //asdfasdfasdfasdfasdf
    public ArrayList buscarTrabajos(String area,String region){
        
        ArrayList trabajosEncontrados=new ArrayList();
        
        int i;
        
        for(i=0 ; i<empresas.size();i++){
            
            Empresa emp=(Empresa)empresas.get(i);
            trabajosEncontrados.add(emp.buscarTrabajos(area, region));
       
        
        }
                
        return trabajosEncontrados;
    }
    
     public Trabajo buscarTrabajos(String id){
        
        Trabajo trabajoEncontrado=new Trabajo(null,null,null,null,null);
        
        int i;
        
        for(i=0 ; i<empresas.size();i++){
            
            Empresa emp=(Empresa)empresas.get(i);
            trabajoEncontrado=(emp.buscarTrabajos(id));
       
        
        }
                
        return trabajoEncontrado;
    }
    
    
}
