 
package maquinacafe;

import javax.swing.JOptionPane;


public class MaquinaCafe {

    static Monedero monedero1;
    static Display display1;
    public static void main(String[] args) {
    int opcion = 0;
    String cafe;
    String te;
    String chocolate;
    
    
    monedero1=new Monedero();
    display1=new Display();
   
  
         
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

    public static void introducirDinero(){
        
    monedero1.guardarDinero(0.50f);
    }
    
//    public  void elaborarProducto(float dinero){
//        //float dinero=Float.parseFloat(JOptionPane.showInputDialog("introduce dinero: "));
//       if (dinero>=0.50f){
//           System.out.println("Elaborando producto... ");
//           
//        }
//        else
//            System.out.println("Dinero insuficiente.");
//    }
//    
    
    
}
