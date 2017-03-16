/*
 * 
 * 
 * 
 */
package maquinacafe;

import javax.swing.JOptionPane;
import static maquinacafe.MaquinaCafe.monedero1;

/**
 *
 * @author agarridogarcia
 * @version 10/03/2017
 */
public class Monedero {
    
    /**
     * @param credito es publico puede ser true o false
     */
    public boolean credito;
    /**
     * 
     * no recibe ni devuelve nada, es público. 
     */
    public void introducirDinero(){
        float dinero=Float.parseFloat(JOptionPane.showInputDialog("introduce dinero: "));
        if (dinero>=0.50f){
            System.out.println("Dinero suficiente, elija su producto. ");
            
        }
        else
            System.out.println("Dinero insuficiente.");
    } 
    /**
     * 
     *  metodo recibe float y no devuelve nada
     * @param dinero variable 
     */
    public void guardarDinero(float dinero){
        System.out.println("Guardar dinero");
        introducirDinero();
        System.out.println("Dinero suficiente");
        Display.credito(dinero);
        System.out.println("dinero ");
        
    }
    /**
     * no recibe ni devuelve, es publico
     */
    
    public void devolverDinero(){
        float dinero=Float.parseFloat(JOptionPane.showInputDialog("Coste del producto: 0.50€. Dinero que has introducido: " ));
        if(dinero>0.50){
            System.out.println("Dinero a devolver: " + (dinero-0.50));}
        else
            System.out.println("No hay dinero que devolver.");
            
        
    }
    


            
            
        
    
    
}
