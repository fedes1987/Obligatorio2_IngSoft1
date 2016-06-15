/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eiralesalomon;

import eiralesalomon.Interfaz.PantallaInicial;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author fsalomon
 */
public class GastosDelHogar {
    
    
    public static void main(String[] args) {

            Sistema s;
            try
            {
               FileInputStream fileIn = new FileInputStream("GastosDelHogar.ser");
               ObjectInputStream in = new ObjectInputStream(fileIn);
               s = (Sistema) in.readObject();
               in.close();
               fileIn.close();
            }catch(Exception i)
            {
               s = new Sistema();
            }
            
            PantallaInicial iPI = new PantallaInicial(s);
            iPI.setLocationRelativeTo(null);  
            iPI.setVisible(true); 
            
    }

}
