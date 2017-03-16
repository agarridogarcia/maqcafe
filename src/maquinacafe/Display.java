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
public class Display {
    /**
     * @param credito metodo muestra cantidad
     * @param dinero 
     */
    public static void credito(float dinero){
        System.out.println(dinero);
    }
    /**
     * pide por pantalla producto
     */
    public void elegirElaborarProducto(){
        String productos;
        productos=JOptionPane.showInputDialog("Introduce el producto que quieres beber: ");
        System.out.println("Has elegido: " + productos );
        imprimir();
    }
    /**
     *  aumenta producto
     */
    public void anhadirAzucar(){
        int azucar=1;
     
        System.out.println("Añadir azúcar: " +" +"+ azucar );
        azucar=azucar+1;      
    }
    /**
     *  resta producto
     */
    public void quitarAzucar(){
        int azucar=1;
     
        System.out.println("Quitar azúcar: " + " -"+ azucar );
        
        azucar=azucar-1; 
    }
    /**
     * saca por pantalla aviso
     */
    public void imprimir(){
        System.out.println("Elaborando producto... ");
    }
        /**
     * saca por pantalla aviso
     */
    public void imprimirAcabado(){
        System.out.println("Recoja producto.");
    }
    /**
     * 
     * @param dinero tipo float, dinero que se introduce
     *  elabora si el dinero es suficiente o mas
     */
        public  void elaborarProducto(float dinero){
        //float dinero=Float.parseFloat(JOptionPane.showInputDialog("introduce dinero: "));
       if (dinero>=0.50f){
           System.out.println("Elaborando producto... ");
           
        }
        else
            System.out.println("Dinero insuficiente.");
    }
    
   
    
}
