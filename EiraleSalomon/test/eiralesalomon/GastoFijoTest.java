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
public class GastoFijoTest {
    
    public GastoFijoTest() {
    }

    @Test
    public void testConstructorConParms() {
        String nombreGasto = "testNombreGF";
        int importeGasto = 1300;
        Date fechaGasto = Date.valueOf(LocalDate.MAX);
        
        //Crear un Gasto Fijo local para luego compararlo con el creado en el constructor de la clase
        GastoFijo gf = new GastoFijo();
        gf.setNombre(nombreGasto);
        gf.setPrecio(importeGasto);
        gf.setFechaVenc(fechaGasto);
        
        //Gasto Fijo creado con constructor de clase con parámetros
        GastoFijo gfClase = new GastoFijo(nombreGasto, importeGasto, fechaGasto);
        assertEquals(gf, gfClase);
    }
    
}
