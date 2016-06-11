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
 * @author fsalomon
 */
public class Usuario implements Serializable{
    private int Id;
    private String Nombre;
    private String Alias;
    private Date FechaNac;
    
    Sistema s;
        
    public Usuario(String pNombre, String pAlias, Date pFechaNac){
        //this.Id = pId;
        this.Nombre = pNombre;
        this.Alias = pAlias;
        this.FechaNac = pFechaNac;
    }
    
    public Usuario(){
        this.setNombre("");
        this.setAlias("");
        this.setFechaNac(null);
    }
    
     public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
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

    public String getAlias() {
        return Alias;
    }
    
    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    public Date getFechaNac() {
        return FechaNac;
    }
    
   
}
