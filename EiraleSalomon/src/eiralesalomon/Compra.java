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
    
    @Override
    public boolean equals(Object o){
        Producto prodA = this.getProducto();
        Producto prodB = ((Compra)o).getProducto();
        int precioProdA = this.getPrecioProd();
        int precioProdB = ((Compra)o).getPrecioProd();
        Date fechaCompraA = this.getFechaCompra();
        Date fechaCompraB = ((Compra)o).getFechaCompra();
        
        Boolean prodEsIgual = this.miComparadorDeProducto(prodA, prodB);
        
        if(prodEsIgual == true && precioProdA == precioProdB && fechaCompraA == fechaCompraB){
            return true;
        }else{
            return false;
        }
    }    
    
        
    public boolean miComparadorDeProducto(Object obj1, Object obj2){
        Producto prodA = ((Producto)obj1);
        Producto prodB = ((Producto)obj2);
        
        if(prodA.getNombreProd().equals(prodB.getNombreProd()) && prodA.getStockAct() == prodB.getStockAct() && prodA.getStockMin() == prodB.getStockMin()){
            return true;
        }else{
            return false;
        }   
    }
    
}
