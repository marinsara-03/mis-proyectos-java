/*Cajero automatico*/
package estructurascontrol25;
import java.util.Scanner;
public class EstructurasControl25 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int numeroIngresado=0;
        double cantidad=0;
        double saldo=0;
        while(numeroIngresado!=4){
        System.out.println("Digite 1 para consultar saldo");
        System.out.println("Digite 2 para consignar dinero");
        System.out.println("Digite 3 retirar dinero");
        System.out.println("Digite 4 salir");
        numeroIngresado=read.nextInt();
            if (numeroIngresado==1){
                System.out.println("Su saldo actual es 0");
            }else if(numeroIngresado==2){
                System.out.println("Ingrese la cantidad que desea consignar: ");
                cantidad=read.nextDouble();
                if (cantidad>0){
                    saldo=saldo+cantidad;
                    System.out.println("Su nuevo saldo es: "+saldo);
                }else{
                    System.out.println("Error");
                }
            }else if(numeroIngresado==3){
                System.out.println("Ingrese la cantidad que desea retirar");
                if (cantidad>0){
                    System.out.println("Fondos insuficientes");
                }
            }else if (numeroIngresado==4){
                System.out.println("Fin");
            }else{
                System.out.println("Error");
            }
        }
            
        
    }
    
}
