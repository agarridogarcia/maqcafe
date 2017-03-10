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
    
    public static void credito(float dinero){
        System.out.println(dinero);
    }
    
    public void elegirElaborarProducto(){
        String productos;
        productos=JOptionPane.showInputDialog("Introduce el producto que quieres beber: ");
        System.out.println("Has elegido: " + productos );
        imprimir();
    }
    public void anhadirAzucar(){
        int azucar=1;
     
        System.out.println("Añadir azúcar: " +" +"+ azucar );
        //for(int i=1;azucar<5;i++)
        azucar=azucar+1;      
    }
    public void quitarAzucar(){
        int azucar=1;
     
        System.out.println("Quitar azúcar: " + " -"+ azucar );
        
        azucar=azucar-1; 
    }
    public void imprimir(){
        System.out.println("Elaborando producto... ");
    }
    public void imprimirAcabado(){
        System.out.println("Recoja producto.");
    }
    
}
