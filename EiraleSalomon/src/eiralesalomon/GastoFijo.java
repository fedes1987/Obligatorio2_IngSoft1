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
    
}
