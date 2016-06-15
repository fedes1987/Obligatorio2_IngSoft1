/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eiralesalomon;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author fsalomon
 */
public class Usuario implements Serializable{
    private int Id;
    private String Nombre;
    private String Alias;
    private Date FechaNac;
    private ArrayList<Producto> listaProd;
    private ArrayList<Compra> listaCompras;
            
    Sistema s;
    
    //Constructor
    public Usuario(String pNombre, String pAlias, Date pFechaNac, 
            ArrayList<Producto> unaListaProd, ArrayList<Compra> unaListaCompra ){
        //this.Id = pId;
        this.Nombre = pNombre;
        this.Alias = pAlias;
        this.FechaNac = pFechaNac;
        this.listaProd = unaListaProd;
        this.listaCompras = unaListaCompra;
    }
    
    //Constructor vacío
    public Usuario(){
        this.setNombre("");
        this.setAlias("");
        this.setFechaNac(null);
        this.setListaProd(new ArrayList<Producto>());
        this.setListaCompra(new ArrayList<Compra>());
    }
    
    //GETs & SETs
     public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public String getAlias() {
        return Alias;
    }
    
    public Date getFechaNac() {
        return FechaNac;
    }
    
    public ArrayList<Producto> getListaProd(){
        return listaProd;
    }
    
    public ArrayList<Compra> getListaCompra(){
        return listaCompras;
    }
    
    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

     public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }
    
    public void setListaProd(ArrayList<Producto> unaListaProd){
        this.listaProd = unaListaProd;
    }
    
    public void setListaCompra(ArrayList<Compra> unaListaCompra){
        this.listaCompras = unaListaCompra;
    }
    
    //Add Listas
    public void agregarProd(Producto unProducto){
        this.listaProd.add(unProducto);
    }
    
    public void agregarPartida(Compra unCompra){
        this.listaCompras.add(unCompra);
    }
    
    public void CargarProdsDeLista() {
	String csvFile = "ListaProductos.csv";
	BufferedReader br = null;
	String line = "";
	String csvSplitBy = ",";
        ArrayList<Producto> productosDeArchivo = new ArrayList();
         
	try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) { 
                Producto prod = new Producto();

                //Utilizar coma como separador
                String[] attsProd = line.split(csvSplitBy);
                prod.setNombreProd(attsProd[0]);

                int stockMin;
                stockMin = Integer.parseInt(attsProd[1]);
                prod.setStockMin(stockMin);

                productosDeArchivo.add(prod);
            }
	} catch (FileNotFoundException e) {
            e.printStackTrace();
	} catch (IOException e) {
            e.printStackTrace();
	} finally {
            //cuando termina de iterar se setea el Arraylist del usuario con los valores leídos del archivo
            this.setListaProd(productosDeArchivo);
            if (br != null) {
                try {
                        br.close();
                } catch (IOException e) {
                        e.printStackTrace();
                }
            }
	}
  }
   
}
