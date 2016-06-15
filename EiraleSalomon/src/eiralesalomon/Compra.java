/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eiralesalomon;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Administrador
 */

public class Compra implements Serializable {
    
    //atributos
    private Producto producto;
    private int precioProd;
    //private int cantProd;
    private Date fechaCompra;
    
    //Constructor
    public Compra(Producto unProducto, int unPrecioProd, Date unaFechaCompra){
        this.setProducto(unProducto);
        this.setPrecioProd(unPrecioProd);
        this.setFechaCompra(unaFechaCompra);
    }
    
    //Constructor vacío
    public Compra(){
        this.setProducto(new Producto());
        this.setPrecioProd(0);
        this.setFechaCompra(null);
    }
    
    //GETs & SETs
    
    public Producto getProducto(){
        return producto;
    }
    
    public int getPrecioProd(){
        return precioProd;
    }
    
    public Date getFechaCompra(){
        return fechaCompra;
    }
    
    public void setProducto(Producto unProducto){
        this.producto = unProducto;
    }
    
    public void setPrecioProd(int unPrecioProd){
        this.precioProd = unPrecioProd;
    }
    
    public void setFechaCompra(Date unaFechaCompra){
        this.fechaCompra = unaFechaCompra;
    }
    
}
