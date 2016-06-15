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
    private Date fechaVenc;
    
    //Constructor
    public GastoFijo(String unNombre, int unPrecio, Date unaFechaVenc){
        this.nombre = unNombre;
        this.precio = unPrecio;
        this.fechaVenc = unaFechaVenc;
    }
    
    //Constructor vacío
    public GastoFijo(){
        this.setNombre("");
        this.setPrecio(0);
        this.setFechaVenc(null);
    }
    
    //GETs & SETs
    public String getNombre() {
        return nombre;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public Date getFechaVenc() {
        return fechaVenc;
    }
    
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    
    public void setPrecio(int unPrecio) {
        this.precio = unPrecio;
    }
    
    public void setFechaVenc(Date unaFechaVenc) {
        this.fechaVenc = unaFechaVenc;
    }
    
    @Override
    public boolean equals(Object o){
        String nombreGF1 = this.getNombre();
        String nombreGF2 = ((GastoFijo)o).getNombre();
        int importeGF1 = this.getPrecio();
        int importeGF2 = ((GastoFijo)o).getPrecio();
        Date fechaGF1 = this.getFechaVenc();
        Date fechaGF2 = ((GastoFijo)o).getFechaVenc();
        
        return (nombreGF1.equals(nombreGF2) && importeGF1 == importeGF2) && fechaGF1 == fechaGF2;
    }    
    
}
