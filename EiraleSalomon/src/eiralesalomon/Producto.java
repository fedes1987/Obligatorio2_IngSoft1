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
public class Producto implements Serializable {
    
    //atributos
    private String nombreProd;
    private int stockMin;
    private int stockAct;

    //Constructor
    public Producto(String unNombreProd, int unStockMin,
            int unStockAct){
        this.nombreProd = unNombreProd;
        this.stockMin = unStockMin;
        this.stockAct = unStockAct;
    }
    
    //Constructor vacío
    public Producto(){
        this.setNombreProd("");
        this.setStockMin(0);
        this.setStockAct(0);
    }
    
    //GETs & SETS
    public String getNombreProd(){
        return nombreProd;
    }
    
    public int getStockMin(){
        return stockMin;
    }
    
    public int getStockAct(){
        return stockAct;
    }
    
    public void setStockMin(int unStockMin){
        this.stockMin = unStockMin;
    }
    
    public void setStockAct(int unStockAct){
        this.stockAct = unStockAct;
    }
    
    public void setNombreProd(String unNombreProd){
        this.nombreProd = unNombreProd;
    }

    //VARIOS
    public void incrementaStock(){
        this.stockAct++;
    }
    
    public void quitaStock(){
        this.stockAct--;
    }
    
    public boolean alarmaStock(){
        return (stockAct < stockMin) || (stockAct == stockMin);
    }
    
}
