 
package maquinacafe;

import javax.swing.JOptionPane;
/**
 * Contiene una máquina de cafe
 * @author agarridogarcia
 * @version 10/03/2017
 */

public class MaquinaCafe {
    /**
     * @param Monedero es static
     * @param Display es static
     * 
     */
    static Monedero monedero1;
    static Display display1;
    /**
     * 
     * @param args clase principal, se ejecutan todos los métodos
     */
    public static void main(String[] args) {
    /**
     * @param opinion tipo int iniciado a 0
     * @param cafe tipo String
     * @param te tipo String
     * @param chocolate tipo String
     */
    int opcion = 0;
    String cafe;
    String te;
    String chocolate;
    
    /**
     * @param monedero1 objeto de clase Monedero
     * @param display1 objeto de clase Display
     */
    monedero1=new Monedero();
    display1=new Display();
   
    /** Se llaman a todos los metodos a traves de un swich
     * @exception ex envia un mensaje si ocurre excepcion
     */
         
         do{
             try{
                 opcion=Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1 Introducir Dinero \n2 Elegir te, cafe o chocolate \n3 Añadir azúcar  \n4 Quitar azúcar \n5 Devolver dinero  \n7 Salir"));
                 
             }catch(Exception ex){
                 System.out.println(ex.getMessage());
                 opcion=0;
             }
            switch(opcion){
            case 1:monedero1.introducirDinero();
                break;
            case 2:display1.elegirElaborarProducto();
                break;
            case 3:display1.anhadirAzucar();
                break;
            case 4:display1.quitarAzucar();
                break;
            case 5:monedero1.devolverDinero();display1.imprimirAcabado();
                break;
            
            
            case 6:System.out.println("Hasta la próxima!!");System.exit(0);
                
            
    }
    
}while(opcion<7);
    }

    
    
 
    
}
