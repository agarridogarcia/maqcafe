/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class Monedero {
    
   
    boolean credito;
    /**
     * 
     * @param dinero 
     */
    public void introducirDinero(){
        float dinero=Float.parseFloat(JOptionPane.showInputDialog("introduce dinero: "));
        if (dinero>=0.50f){
            System.out.println("Dinero suficiente, elija su producto. ");
            
        }
        else
            System.out.println("Dinero insuficiente.");
    } 
    public void guardarDinero(float dinero){//no lo estamos usando
        System.out.println("Guardar dinero");
        introducirDinero();
        System.out.println("Dinero suficiente");
        Display.credito(dinero);
        System.out.println("dinero ");
        
    }
    
    public void devolverDinero(){
        float dinero=Float.parseFloat(JOptionPane.showInputDialog("Coste del producto: 0.50€. Dinero que has introducido: " ));
        if(dinero>0.50){
            System.out.println("Dinero a devolver: " + (dinero-0.50));}
        else
            System.out.println("No hay dinero que devolver.");
            
        
    }


            
            
        
    
    
}
