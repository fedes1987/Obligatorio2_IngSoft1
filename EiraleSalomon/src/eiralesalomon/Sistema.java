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
import java.util.Iterator;
/**
 *
 * @author fsalomon
 */
public class Sistema implements Serializable{

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<String> listaAlias;
    private String usuarioActivo;

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void setListaAlias(ArrayList<String> listaAlias) {
        this.listaAlias = listaAlias;
    }
    
    public void setUsuarioActivo(String unUsuarioActivo){
        this.usuarioActivo = unUsuarioActivo;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<String> getListaAlias() {
        return listaAlias;
    }
    
    public String getUsuarioActivo(){
        return usuarioActivo;
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
        this.setUsuarioActivo("");
       
    }
    
    //Constructor con parms
    public Sistema(ArrayList<Usuario> listaUsuarios,ArrayList<String> listaAlias, String unUsuarioActivo){
        this.setListaUsuarios(listaUsuarios);
        this.setListaAlias(listaAlias);
        this.setUsuarioActivo(unUsuarioActivo);
    }
    
    public int ObtenerUsuario(String unAlias){
        Iterator <Usuario> it = this.getListaUsuarios().iterator();
        int pos = 0;
            while (it.hasNext()){
                Usuario unUsuario = it.next();
                if( unUsuario.getAlias().equals(unAlias)){
                    pos = this.getListaUsuarios().indexOf(unUsuario);
                    break;
                }
            }
        return pos;
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
