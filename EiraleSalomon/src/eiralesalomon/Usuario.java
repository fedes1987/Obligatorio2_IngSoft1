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
import java.util.Iterator;

/**
 *
 * @author fsalomon
 */
public class Usuario implements Serializable{
    private String Nombre;
    private String Alias;
    private Date FechaNac;
    private ArrayList<Producto> listaProd;
    private ArrayList<Compra> listaCompras;
            
    Sistema s;
    
    //Constructor
    public Usuario(String pNombre, String pAlias, Date pFechaNac, 
            ArrayList<Producto> unaListaProd, ArrayList<Compra> unaListaCompra ){
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
    
    public void agregarCompra(Compra unCompra){
        this.listaCompras.add(unCompra);
    }
    
    //pasar por parm en base a lo cargado en el filechooser
    public void cargarProdsDeLista() {
	String csvFile = "ListaProductos.csv";
	BufferedReader br = null;
	String line;
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
            //cuando termina de iterar se setea el Arraylist del usuario con los valores leídos del archivo
            this.setListaProd(productosDeArchivo);
	}catch (IOException e) {
            e.printStackTrace();
	} 
    }
    
    @Override
    public boolean equals(Object o){
        String nombreUsuA = this.getNombre();
        String nombreUsuB = ((Usuario)o).getNombre();
        String aliasUsuA = this.getAlias();
        String aliasUsuB = ((Usuario)o).getAlias();
        Date fechaNacUsuA = this.getFechaNac();
        Date fechaNacUsuB = ((Usuario)o).getFechaNac();
        ArrayList<Producto> listaProdUsuA = this.getListaProd();
        ArrayList<Compra> listaCompraUsuA = this.getListaCompra();
        ArrayList<Producto> listaProdUsuB = ((Usuario)o).getListaProd();
        ArrayList<Compra> listaCompraUsuB = ((Usuario)o).getListaCompra();
        
        Boolean listaProdEsIgual = this.miComparadorDeProducto(listaProdUsuA, listaProdUsuB);
        Boolean listaCompraEsIgual = this.miComparadorDeCompra(listaCompraUsuA, listaCompraUsuB);
        
        if(nombreUsuA.equals(nombreUsuB) && aliasUsuA.equals(aliasUsuB) && fechaNacUsuA == fechaNacUsuB && listaCompraEsIgual == true && listaProdEsIgual == true){
            return true;
        }else{
            return false;
        }  
    }  
    
    
    public boolean miComparadorDeProducto(ArrayList<Producto> lista1, ArrayList<Producto> lista2){
        if(lista1.size() != lista2.size()){
            return false;
        }
        else{
            Iterator iteLista1 = lista1.iterator();
            Iterator iteLista2 = lista2.iterator();
            
            while(iteLista1.hasNext() && iteLista2.hasNext()){
                Producto prodA = ((Producto)iteLista1.next());
                Producto prodB = ((Producto)iteLista2.next());
                if(prodA.equals(prodB)){
                }else{
                    return false;
                }
            }
            return true;
        }
       
    }
    
    
    public boolean miComparadorDeCompra(ArrayList<Compra> lista1, ArrayList<Compra> lista2){
        if(lista1.size() != lista2.size()){
            return false;
        }
        else{
            Iterator iteLista1 = lista1.iterator();
            Iterator iteLista2 = lista2.iterator();
            
            while(iteLista1.hasNext() && iteLista2.hasNext()){
                Compra compraA = ((Compra)iteLista1.next());
                Compra compraB = ((Compra)iteLista2.next());
                if(compraA.equals(compraB)){
                }else{
                    return false;
                }
            }
            return true;
        }
       
    }
   
}
