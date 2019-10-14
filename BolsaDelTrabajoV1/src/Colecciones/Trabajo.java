/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

/**
 *
 * @author felip
 */
public class Trabajo {
    
    private String id;
    private String area;
    private String region;
    private String descripcion;
    private ListaPostulante postulantes;
    
    public Trabajo(String id,String area,String region,String descripcion,ListaPostulante postulantes){
        
        this.id=id;
        this.area=area;
        this.region=region;
        this.descripcion=descripcion;
        this.postulantes=postulantes;
        
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getArea(){
        return area;
    }
    public void setArea(String area){
        this.area=area;
    }
    public String getRegion(){
        return region;
    }
    public void setRegion(String region){
        this.region=region;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public ListaPostulante getPostulantes(){
        return postulantes;
    }
    public void setPostulantes(ListaPostulante postulantes){
        this.postulantes=postulantes;
    }
    
    
    
    
    
}
