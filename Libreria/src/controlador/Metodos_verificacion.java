/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.KeyEvent;

/**
 *
 * @author antho
 */
public class Metodos_verificacion {
    
     public void letras(KeyEvent evt){
        Character s=null;
        s= evt.getKeyChar();
        if(!Character.isLetter(s) && s!= KeyEvent.VK_SPACE){
            evt.consume();
        }
        
    }
     
     public void numeros(KeyEvent evt){
         char caracter =evt.getKeyChar();
        if(((caracter<'0')||(caracter>'9'))&&(caracter !='\b')){
            evt.consume();
        }
     }
     
     public void Fecha(KeyEvent evt){
         char caracter =evt.getKeyChar();
        if(((caracter<'0')||(caracter>'9'))&&(caracter !='\b')&&(caracter !='-')){
            evt.consume();
        }
     }
    
}
