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
public class Persona {
    
    
    private String rut;
    private String nombre;
    private String region;
    private int edad;
    private String telefono;
    private ListaTrabajo trabajosDeInteres;
    
    public Persona(String rut,String nombre,String region,String telefono,int edad,ListaTrabajo trabajos){
       
        this.rut=rut;
        this.nombre=nombre;
        this.region=region;
        this.telefono=telefono;
        this.edad=edad;
        this.trabajosDeInteres=trabajos;
        
        
    }
    
    public String getRut(){
        return rut;
    }
    public void setRut(String rut){
        this.rut=rut;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
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
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public ListaTrabajo getTrabajos(){
        return trabajosDeInteres;
    }
    public void setTrabajos(ListaTrabajo trabajos){
        this.trabajosDeInteres=trabajos;
    }   
    
    
    public ArrayList buscarTrabajos(String area,String region){
        
        ArrayList<Trabajo> trabajos=new ArrayList<>();
        ListaEmpresa emp=new ListaEmpresa();
        trabajos=emp.buscarTrabajos(area, region);
        return trabajos;       
    }
    
    public Trabajo buscarTrabajos(String id){
        
        Trabajo trabajo=new Trabajo(null,null,null,null,null);
        ListaEmpresa emp=new ListaEmpresa();
        trabajo=emp.buscarTrabajos(id);
        return trabajo;   
        
    }
    
    public void agregarTrabajo(Trabajo trab){
        
        trabajosDeInteres.agregarTrabajo(trab);
        
    }
    
}
