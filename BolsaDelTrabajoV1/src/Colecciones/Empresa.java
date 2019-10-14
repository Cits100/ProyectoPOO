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
public class Empresa {
    
    private String id;
    private String region;
    private String telefono;
    private ListaTrabajo trabajosOfrecidos;
   
    
    public Empresa(String id,String region,String telefono,ListaTrabajo trab){
        
        this.id=id;
        this.region=region;
        this.telefono=telefono;
        this.trabajosOfrecidos=trab;
        
        
    }
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getRegion(){
        return region;
    }
    public void setRegion(String region){
        this.region=region;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public ListaTrabajo getTrab(){
        return trabajosOfrecidos;
    }
    public void setTrab(ListaTrabajo trab){
        this.trabajosOfrecidos=trab;
    }   
    
    
    public ArrayList buscarTrabajos(String area,String region){
        
        ArrayList <ListaTrabajo> trabajosEncontrados=new ArrayList();

        trabajosEncontrados=trabajosOfrecidos.buscarTrabajos(area, region);
        
        return trabajosEncontrados;
    }
    
    public Trabajo buscarTrabajos(String id){
        
        Trabajo trabajosEncontrados=new Trabajo(null,null,null,null,null);

        trabajosEncontrados=trabajosOfrecidos.buscarTrabajos(id);
        
        return trabajosEncontrados;
    }
    
    
}
