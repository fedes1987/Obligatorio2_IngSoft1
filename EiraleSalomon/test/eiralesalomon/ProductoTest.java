/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eiralesalomon;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fsalomon
 */
public class ProductoTest {
    
    public ProductoTest() {
    }

    @Test
    public void testIncrementaStock() {
        int stockEsperado = 5;
        Producto prod = new Producto();
        //Iterar de 1 a 5 para lograr el resultado esperado (cada vez que se invoca al método incrementa en 1 el stock)
        for(int i=1; i<=5;i++){
            prod.incrementaStock();
        }
        int stockObtenido = prod.getStockAct();
        
        assertEquals(stockObtenido, stockEsperado);
    }
    
    @Test
    public void testQuitarStock() {
        int stockEsperado = 0;
        Producto prod = new Producto();
        prod.setStockAct(5);
        //Iterar de 1 a 5 para lograr el resultado esperado (cada vez que se invoca al método decrementa en 1 el stock)
        for(int i=1; i<=5;i++){
            prod.quitaStock();
        }
        int stockObtenido = prod.getStockAct();
        
        assertEquals(stockObtenido, stockEsperado);
    }
    
    @Test
    public void testAlarmaStock(){
        Producto prod = new Producto();
        
        //devuelve True si el stock actual es <= a stock mínimo
        prod.setStockAct(0);
        prod.setStockMin(1);
        
        Boolean alarma = prod.alarmaStock();
        assertEquals(true, alarma);
    }
}
