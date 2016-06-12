/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eiralesalomon;

import java.sql.Date;
import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author fsalomon
 */
public class UsuarioTest {
    
    public UsuarioTest() {
    }

    @Test
    public void testConstructorConParms(){
        //valores de atributo locales
        String nombreUsu = "usuTestNombre";
        String aliasUsu = "usuTestAlias";
        Date fechaNacUsu = Date.valueOf(LocalDate.MAX);
        ArrayList<Producto> listaProd = new ArrayList();
        ArrayList<Compra> listaCompra = new ArrayList();
        
        Producto prod = new Producto();
        prod.setNombreProd("testProd");
        prod.setStockAct(1);
        prod.setStockMin(1);
        listaProd.add(prod);
        
        Compra compra = new Compra();
        compra.setProducto(prod);
        compra.setFechaCompra(fechaNacUsu);
        compra.setPrecioProd(100);
        listaCompra.add(compra);

        //Crear un usuario local para luego compararlo con el creado en el constructor de la clase
        Usuario usu = new Usuario();
        usu.setNombre(nombreUsu);
        usu.setAlias(aliasUsu);
        usu.setFechaNac(fechaNacUsu);
        usu.setListaProd(listaProd);
        usu.setListaCompra(listaCompra);
        
        //Usuario creado con constructor de clase con parámetros
        Usuario usuClase = new Usuario(nombreUsu, aliasUsu, fechaNacUsu, listaProd, listaCompra);
        //assertEquals(usu, usuClase);
        assertEquals(true, miComparadorDeObjetos(usu, usuClase));
    }
    
    @Test
    public void testCargaProductosDeArchivo(){
        //crear lista local exactamente igual a la del archivo a cargar
        ArrayList<Producto> listaProd = new ArrayList();
        
        Producto prod = new Producto();
        prod.setNombreProd("Yerba Canarias 1 Kg.");
        prod.setStockMin(1);
        listaProd.add(prod);
        
        Producto prod2 = new Producto();
        prod2.setNombreProd("Papel higienico");
        prod2.setStockMin(2);
        listaProd.add(prod2);
        
        Producto prod3 = new Producto();
        prod3.setNombreProd("Limpiador Fabuloso 1 l.");
        prod3.setStockMin(1);
        listaProd.add(prod3);
        
        Usuario user = new Usuario();
        user.CargarProdsDeLista();
       
        ArrayList<Producto> arrayEsperado = user.getListaProd();
        
        assertEquals(true, miComparadorDeArrays(listaProd, arrayEsperado));
        
    }
    
    public boolean miComparadorDeArrays(ArrayList<Producto> obtenido, ArrayList<Producto> esperado){
        if(obtenido.size() != esperado.size()){
            return false;
        }
        else{
            Iterator iteObt = obtenido.iterator();
            Iterator iteEsp = esperado.iterator();
            
            while(iteObt.hasNext() && iteEsp.hasNext()){
                Producto prodA = ((Producto)iteObt.next());
                Producto prodB = ((Producto)iteEsp.next());
                if(prodA.equals(prodB)){
                }else{
                    return false;
                }
            }
            return true;
        }
       
    }
    
    public boolean miComparadorDeObjetos(Object obtenido, Object esperado){
        Usuario usuA = ((Usuario)obtenido);
        Usuario usuB = ((Usuario)esperado);
        
        return usuA.equals(usuB);
    }
    
}
