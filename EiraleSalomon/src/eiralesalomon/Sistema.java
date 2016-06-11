/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eiralesalomon;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author fsalomon
 */
public class Sistema implements Serializable{

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<String> listaAlias; 

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void setListaAlias(ArrayList<String> listaAlias) {
        this.listaAlias = listaAlias;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<String> getListaAlias() {
        return listaAlias;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
     //métodos
    public void agregarUsuario(Usuario unUsuario){
        this.listaUsuarios.add(unUsuario);
    }
    
    public void agregarAlias(String unAlias){
        this.listaAlias.add(unAlias);
    }
    
    
    //Constructor vacío
    public Sistema(){
        this.setListaUsuarios(new ArrayList<Usuario>());
        this.setListaAlias(new ArrayList<String>());
       
    }
    
    //Constructor con parms
    public Sistema(ArrayList<Usuario> listaUsuarios,ArrayList<String> listaAlias){
        this.setListaUsuarios(listaUsuarios);
        this.setListaAlias(listaAlias);
    }
    
     public boolean guardar(){
         boolean guardar;
        try
        {
           FileOutputStream fileOut = new FileOutputStream("GastosDelHogar.ser");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(this);
           out.close();
           fileOut.close();
           guardar = true;
        }catch(Exception i)
        {   
            guardar = false;
        }
        return guardar;
    }
    
}
