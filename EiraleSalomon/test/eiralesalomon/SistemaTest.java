/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eiralesalomon;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fsalomon
 */
public class SistemaTest {
    
    public SistemaTest() {
    }

    @Test
    public void testSetListaUsuarios() {
        ArrayList<Usuario> listaUsuarios = new ArrayList();
        Sistema sistema = new Sistema();
        sistema.setListaUsuarios(listaUsuarios);
        
        ArrayList<Usuario> listaUsuarioRet = sistema.getListaUsuarios();
        
        assertEquals(listaUsuarios, listaUsuarioRet);
    }
    
    
    @Test
    public void testAgregarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("testNombreUsuario");
        usuario.setAlias("testAliasUsuario");
        Date fechaNac = Date.valueOf(LocalDate.MAX);
        usuario.setFechaNac(fechaNac);
        
        ArrayList<Producto> listaProd = new ArrayList();
        ArrayList<Compra> listaCompra = new ArrayList();
        usuario.setListaCompra(listaCompra);
        usuario.setListaProd(listaProd);
       
        Sistema sistema = new Sistema();
        sistema.agregarUsuario(usuario);
        
        ArrayList<Usuario> listaUsuario = sistema.getListaUsuarios();
        Boolean existeUsuario = false;
        if(listaUsuario.contains(usuario)){
            existeUsuario = true;
        }
        
        assertEquals(true, existeUsuario);
    }
    
    @Test
    public void testAgregarAlias() {
        String aliasUsuario = "testAliasUsuario";
        Sistema sistema = new Sistema();
        sistema.agregarAlias(aliasUsuario);
        
        ArrayList<String> listaAlias = sistema.getListaAlias();
        Boolean existeAlias = false;
        if(listaAlias.contains(aliasUsuario)){
            existeAlias = true;
        }
        
        assertEquals(true, existeAlias);
    }
    
    //FedeS - cómo hacer cuando querés probar el caso que se espera y el que debería dar error?
    //@Test (expected = IllegalArgumentException.class)
    @Test
    public void testConstructorConParms() {
        ArrayList<Usuario> listaUsuarios = new ArrayList();
        ArrayList<String> listaAlias = new ArrayList();
        
        Usuario usuario = new Usuario();
        listaUsuarios.add(usuario);
        
        listaAlias.add("testAliasUsuario");
        
        Sistema sistema = new Sistema();
        sistema.setListaAlias(listaAlias);
        sistema.setListaUsuarios(listaUsuarios);
        
        Sistema sistemaClase = new Sistema(listaUsuarios, listaAlias);
        
        assertEquals(sistema, sistemaClase);
    }
    
    
    @Test(expected = AssertionError.class)
    public void testConstructorConParmsQueFalla() {
        ArrayList<Usuario> listaUsuarios = new ArrayList();
        ArrayList<String> listaAlias = new ArrayList();
        
        Sistema sistema = new Sistema();
        sistema.setListaAlias(listaAlias);
        sistema.setListaUsuarios(listaUsuarios);
        
        //Agrego otro ArrayList de distinto largo para que falle el método comparador
        ArrayList<String> listaAliasDiff = new ArrayList();
        listaAliasDiff.add("testListaAlias");
        
        ArrayList<Usuario> listaUsuariosDiff = new ArrayList();
        Usuario usuario = new Usuario();
        listaUsuariosDiff.add(usuario);
        
        Sistema sistemaClase = new Sistema(listaUsuariosDiff, listaAliasDiff);
        
        assertEquals(sistema, sistemaClase);
    }
    
    
    @Test(expected = AssertionError.class)
    public void testEqualsQueFalla() {
        ArrayList<Usuario> listaUsuario = new ArrayList();
        ArrayList<Usuario> listaUsuario2 = new ArrayList();
        ArrayList<String> listaAlias = new ArrayList();
        ArrayList<String> listaAlias2 = new ArrayList();
        
        String alias1 = "testAlias1";
        String alias2 = "testAlias2";
        Date fechaNac = Date.valueOf(LocalDate.MAX);
        
        listaAlias.add(alias1);
        listaAlias2.add(alias2);
        
        Usuario usuario1 = new Usuario();
        
        usuario1.setNombre("testNombreUsu1");
        usuario1.setAlias("testAliasUsu1");
        usuario1.setFechaNac(fechaNac);
        listaUsuario.add(usuario1);
        
        Usuario usuario2 = new Usuario();
        usuario2.setNombre("testNombreUsu2");
        usuario2.setAlias("testAliasUsu2");
        usuario2.setFechaNac(fechaNac);
        listaUsuario2.add(usuario2);
        
        //Se crean dos instancias de la clase sistema con diferentes objetos en sus arrays para que el equals falle
        Sistema sistema = new Sistema();
        sistema.setListaAlias(listaAlias);
        sistema.setListaUsuarios(listaUsuario);
        
        Sistema sistema2 = new Sistema();
        sistema2.setListaAlias(listaAlias2);
        sistema2.setListaUsuarios(listaUsuario2);
        
         assertEquals(sistema, sistema2);
    }
    
    @Test
    public void testGuardarArchivo() {
        Sistema sistema = new Sistema();
        Boolean result = sistema.guardar();
        
        assertEquals(true, result);
    }
}
