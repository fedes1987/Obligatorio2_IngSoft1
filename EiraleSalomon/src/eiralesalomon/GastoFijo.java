/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eiralesalomon;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Administrador
 */
public class GastoFijo implements Serializable {
    
    //atributos
    private String nombre;
    private int precio;
    private int diaVenc;
    
    //Constructor
    public GastoFijo(String unNombre, int unPrecio, int unDiaVenc){
        this.nombre = unNombre;
        this.precio = unPrecio;
        this.diaVenc = unDiaVenc;
    }
    
    //Constructor vacío
    public GastoFijo(){
        this.setNombre("");
        this.setPrecio(0);
        this.setDiaVenc(0);
    }
    
    //GETs & SETs
    public String getNombre() {
        return nombre;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public int getDiaVenc() {
        return diaVenc;
    }
    
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    
    public void setPrecio(int unPrecio) {
        this.precio = unPrecio;
    }
    
    public void setDiaVenc(int unDiaVenc) {
        this.diaVenc = unDiaVenc;
    }
    
    @Override
    public boolean equals(Object o){
        String nombreGF1 = this.getNombre();
        String nombreGF2 = ((GastoFijo)o).getNombre();
        int importeGF1 = this.getPrecio();
        int importeGF2 = ((GastoFijo)o).getPrecio();
        int diaVencGF1 = this.getDiaVenc();
        int diaVencGF2 = ((GastoFijo)o).getDiaVenc();
        
        return (nombreGF1.equals(nombreGF2) && importeGF1 == importeGF2) && diaVencGF1 == diaVencGF2;
    }   
    
    
    @Override
    public String toString(){
        return this.getNombre() + " - $" + Integer.toString(this.getPrecio());
    }
    
}
