/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_4;

import javax.swing.JFrame;

/**
 *
 * @author Alex
 */
public class Practica_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ModeloDados modelo = new ModeloDados();
        ControladorDados controlador = new ControladorDados(modelo);
        VistaDados vista = new VistaDados(controlador);
        
        
  
                
        
    }
}
