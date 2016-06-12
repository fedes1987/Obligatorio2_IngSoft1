/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eiralesalomon;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 *
 * @author fsalomon
 */
public class UsuarioTest {
    
    public UsuarioTest() {
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
       
        ArrayList<Producto> obtenido = user.getListaProd();
        
        assertEquals(listaProd, obtenido);
        
    }
    
}
