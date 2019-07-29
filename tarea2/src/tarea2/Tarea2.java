/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author lourd
 */
public class Tarea2 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        lista lista = new lista();
        bolsa b = new bolsa();
        bolsa c = new bolsa();
        bolsa d = new bolsa();
        bolsa e = new bolsa();
        lista.insertar(b, "x");
        lista.insertar(c, "y");
       lista.insertar(d, "z");
       
        lista.recorrer_mostrar();
        
        
    }
    
}
