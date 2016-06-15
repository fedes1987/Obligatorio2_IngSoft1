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
    
    //Pasar nombre de archivo como parámetro para poder probar el catch cuando se pasa un archivo inválido
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
    
    
    @Override
    public boolean equals(Object o){
        ArrayList<Usuario> listaUsuariosSisA = this.getListaUsuarios();
        ArrayList<String> listaAliasSisA = this.getListaAlias();
        
        ArrayList<Usuario> listaUsuariosSisB =((Sistema)o).getListaUsuarios();
        ArrayList<String> listaAliasSisB = ((Sistema)o).getListaAlias();
        
        Boolean listaUsuEsIgual = this.miComparadorDeUsuarios(listaUsuariosSisA, listaUsuariosSisB);
        Boolean listaAliasEsIgual = this.miComparadorDeAlias(listaAliasSisA, listaAliasSisB);
        
        if(listaUsuEsIgual == true && listaAliasEsIgual == true){
            return true;
        }else{
            return false;
        }  
    }
    
    
    public boolean miComparadorDeUsuarios(ArrayList<Usuario> obtenido, ArrayList<Usuario> esperado){
        if(obtenido.size() != esperado.size()){
            return false;
        }
        else{
            Iterator iteObt = obtenido.iterator();
            Iterator iteEsp = esperado.iterator();
            
            while(iteObt.hasNext() && iteEsp.hasNext()){
                Usuario usuA = ((Usuario)iteObt.next());
                Usuario usuB = ((Usuario)iteEsp.next());
                if(usuA.equals(usuB)){
                }else{
                    return false;
                }
            }
            return true;
        }
       
    }
    
    
    public boolean miComparadorDeAlias(ArrayList<String> obtenido, ArrayList<String> esperado){
        if(obtenido.size() != esperado.size()){
            return false;
        }
        else{
            Iterator iteObt = obtenido.iterator();
            Iterator iteEsp = esperado.iterator();
            
            while(iteObt.hasNext() && iteEsp.hasNext()){
                String aliasA = ((String)iteObt.next());
                String aliasB = ((String)iteEsp.next());
                if(aliasA.equals(aliasB)){
                }else{
                    return false;
                }
            }
            return true;
        }
       
    }
    
}
