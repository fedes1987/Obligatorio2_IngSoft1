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

/**
 *
 * @author fsalomon
 */
public class CompraTest {
    
    public CompraTest() {
    }

    @Test
    public void testConstructorConParms() {
        Producto prod = new Producto();
        int precioProd = 100;
        Date fechaCompra = Date.valueOf(LocalDate.MAX);
        
        //Crear una compra local para luego compararla con la creada en el constructor de la clase
        Compra compra = new Compra();
        compra.setProducto(prod);
        compra.setPrecioProd(precioProd);
        compra.setFechaCompra(fechaCompra);
        
        //Compra creada con constructor de clase con parámetros
        Compra compraClase = new Compra(prod, precioProd, fechaCompra);
        assertEquals(compra, compraClase);
    }
    
    
}
