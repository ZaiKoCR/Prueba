package bancolist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BancoList {

    public static void main(String[] args) {
       
        ArrayList<Double> deposito = new ArrayList();
        ArrayList<Double> retiro = new ArrayList();
        ArrayList<Double> pagoServicio = new ArrayList();
        
        int opc=1;
        int contadora1=0;
        int contadora2=0;
        int contadora3=0;
        
        while (opc>=1 && opc<5){
            opc=Integer.parseInt(JOptionPane.showInputDialog("MENU BANCO:\n1. Depositar\n2. Retirar\n3. Pagar Servicio\n4. Mostrar ventanillas\n5. Salir"));
            switch (opc){
                case 1: 
                    double cantDeposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                    deposito.add(cantDeposito);
                    contadora1 += (int) cantDeposito;
                break;
                
                case 2:
                    double cantRetiro= Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad que quieres retirar:"));
                    retiro.add(cantRetiro);
                    contadora2 += (int) cantRetiro;
                break;
                
                case 3: 
                    double cantPago = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a pagar:"));
                    pagoServicio.add(cantPago);
                    contadora3 += (int) cantPago;
                break;
                
                case 4:
                    System.out.println("====================================");
                    
                    System.out.println ("VENTANILLAS DEPOSITO:");
                    for(int i=0; i<deposito.size(); i++){
                    System.out.println (deposito.get(i));
                    }
                    System.out.println("La suma de los depositos son: "+ contadora1);

                    System.out.println("====================================");
                    
                    System.out.println ("VENTANILLAS RETIRO:");
                    for(int i=0; i<retiro.size(); i++){
                    System.out.println (retiro.get(i));
                    }
                    System.out.println("La suma de los retiros son: "+ contadora2);

                    System.out.println("====================================");
                    
                    System.out.println ("VENTANILLAS PAGOS:");
                    for(int i=0; i<pagoServicio.size(); i++){
                    System.out.println (pagoServicio.get(i));
                    }
                    System.out.println("La suma de los pagos son: "+ contadora3);

                    System.out.println("====================================");
                break;
                
                default:
                    System.out.println("Saliendo del programa....");
            }//Cierre del switch
        }//Cierre del while

    }//Cierre del metodo MAIN
}//Cierre de la clase
