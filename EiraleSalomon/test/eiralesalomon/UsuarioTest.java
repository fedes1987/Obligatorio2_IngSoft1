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
        ArrayList<GastoFijo> listaGastoFijo = new ArrayList();
        
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
        
        GastoFijo gf = new GastoFijo();
        gf.setNombre("UTE");
        gf.setPrecio(1200);
        gf.setDiaVenc(12);
        listaGastoFijo.add(gf);

        //Crear un usuario local para luego compararlo con el creado en el constructor de la clase
        Usuario usu = new Usuario();
        usu.setNombre(nombreUsu);
        usu.setAlias(aliasUsu);
        usu.setFechaNac(fechaNacUsu);
        usu.setListaProd(listaProd);
        usu.setListaCompra(listaCompra);
        usu.setListaGastos(listaGastoFijo);
        
        //Usuario creado con constructor de clase con parámetros
        Usuario usuClase = new Usuario(nombreUsu, aliasUsu, fechaNacUsu, listaProd, listaCompra, listaGastoFijo);
        
        assertEquals(true, miComparadorDeObjetos(usu, usuClase));
    }
    
    
    @Test(expected = AssertionError.class)
    public void testConstructorConParmsQueFalla() {
        //valores de atributo locales
        String nombreUsu = "usuTestNombre";
        String aliasUsu = "usuTestAlias";
        Date fechaNacUsu = Date.valueOf(LocalDate.MAX);
        ArrayList<Producto> listaProd = new ArrayList();
        ArrayList<Compra> listaCompra = new ArrayList();
        ArrayList<GastoFijo> listaGastoFijo = new ArrayList();
        
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

        //agrego otra compra al usuario local para que el size del array sea diferente y falle
        ArrayList<Compra> listaCompraDiff = new ArrayList();
        
        Compra compra1 = new Compra();
        compra1.setProducto(prod);
        compra1.setFechaCompra(fechaNacUsu);
        compra1.setPrecioProd(100);
        listaCompraDiff.add(compra1);
        
        Compra compra2 = new Compra();
        compra2.setProducto(prod);
        compra2.setFechaCompra(fechaNacUsu);
        compra2.setPrecioProd(100);
        listaCompraDiff.add(compra2);
        
        //agrego otro producto al usuario local para que el size del array sea diferente y falle
        ArrayList<Producto> listaProdDiff = new ArrayList();
        
        Producto prod1 = new Producto();
        prod1.setNombreProd("testProd1");
        prod1.setStockAct(1);
        prod1.setStockMin(1);
        listaProdDiff.add(prod1);
        
        Producto prod2 = new Producto();
        prod2.setNombreProd("testProd2");
        prod2.setStockAct(3);
        prod2.setStockMin(2);
        listaProdDiff.add(prod2);
        
        //Crear un usuario local para luego compararlo con el creado en el constructor de la clase
        Usuario usu = new Usuario();
        usu.setNombre(nombreUsu);
        usu.setAlias(aliasUsu);
        usu.setFechaNac(fechaNacUsu);
        usu.setListaProd(listaProdDiff);
        usu.setListaCompra(listaCompraDiff);
        usu.setListaGastos(listaGastoFijo);
        
        //Usuario creado con constructor de clase con parámetros
        Usuario usuClase = new Usuario(nombreUsu, aliasUsu, fechaNacUsu, listaProd, listaCompra, listaGastoFijo);
        
        assertEquals(true, miComparadorDeObjetos(usu, usuClase));
    }
    
    
    
    @Test(expected = AssertionError.class)
    public void testEqualsQueFalla() {
        //valores de atributo locales
        String nombreUsu = "usuTestNombre";
        String aliasUsu = "usuTestAlias";
        Date fechaNacUsu = Date.valueOf(LocalDate.MAX);
        
        //Creo dos arrays de cada uno para que sus elementos sean diferentes y así dar error en el equals de Usuario
        ArrayList<Producto> listaProd = new ArrayList();
        ArrayList<Compra> listaCompra = new ArrayList();
        ArrayList<GastoFijo> listaGF = new ArrayList();
        ArrayList<Producto> listaProd2 = new ArrayList();
        ArrayList<Compra> listaCompra2 = new ArrayList();
         ArrayList<GastoFijo> listaGF2 = new ArrayList();
        
        //Crear un usuario local para luego compararlo con el creado en el constructor de la clase
        Usuario usu = new Usuario();
        usu.setNombre(nombreUsu);
        usu.setAlias(aliasUsu);
        usu.setFechaNac(fechaNacUsu);
        
        usu.setListaCompra(listaCompra);
        
        //Creo dos productos diferentes para agregar a los arrays, el comparador de productos va a fallar
        Producto prod1 = new Producto();
        prod1.setNombreProd("prod1TestNombre");
        prod1.setStockAct(3);
        prod1.setStockMin(1);
        listaProd.add(prod1);
        
        usu.setListaProd(listaProd);
        
        Producto prod2 = new Producto();
        prod2.setNombreProd("prod2TestNombre");
        prod2.setStockAct(1);
        prod2.setStockMin(1);
        listaProd2.add(prod2);
        
        //Creo dos compras diferentes para agregar a los arrays, el comparador de compras va a fallar
        Compra compra1 = new Compra();
        compra1.setFechaCompra(fechaNacUsu);
        compra1.setPrecioProd(200);
        compra1.setProducto(prod2);
        listaCompra.add(compra1);
        
        usu.setListaCompra(listaCompra);
        usu.setListaGastos(listaGF);
        
        Compra compra2 = new Compra();
        compra2.setFechaCompra(fechaNacUsu);
        compra2.setPrecioProd(180);
        compra2.setProducto(prod2);
        listaCompra2.add(compra2);
        
        //Usuario creado con constructor de clase con parámetros
        Usuario usuClase = new Usuario(nombreUsu, aliasUsu, fechaNacUsu, listaProd2, listaCompra2, listaGF2);
        
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
       // user.CargarProdsDeLista();
       
        ArrayList<Producto> arrayEsperado = user.getListaProd();
        
        assertEquals(true, miComparadorDeArrays(listaProd, arrayEsperado));
        
    }
    
    
    @Test
    public void testAgregarProducto(){
        Producto prod = new Producto();
        prod.setNombreProd("testProductoUsuario");
        prod.setStockAct(1);
        prod.setStockMin(1);
        
        Usuario usu = new Usuario();
        usu.agregarProd(prod);
        
        ArrayList<Producto> listaProd = usu.getListaProd();
        Boolean existe = false;
        if(listaProd.contains(prod)){
            existe = true;
        }
        assertEquals(true, existe);
    }
    
    
    @Test
    public void testAgregarCompra(){
        Producto prod = new Producto();
        prod.setNombreProd("testProductoDeCompraUsuario");
        prod.setStockAct(1);
        prod.setStockMin(1);
        
        Date fechaCompra = Date.valueOf(LocalDate.MAX);
        Compra compra = new Compra();
        compra.setProducto(prod);
        compra.setPrecioProd(140);
        compra.setFechaCompra(fechaCompra);
        
        Usuario usu = new Usuario();
        usu.agregarCompra(compra);
        
        ArrayList<Compra> listaCompra = usu.getListaCompra();
        Boolean existe = false;
        if(listaCompra.contains(compra)){
            existe = true;
        }
        assertEquals(true, existe);
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
