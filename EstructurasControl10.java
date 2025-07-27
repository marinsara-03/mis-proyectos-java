/*Leer números hasta que el usuario ingrese 0, luego, imprimir los números pares.*/
package estructurascontrol10;
import java.util.Scanner;
public class EstructurasControl10 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numeroIngresado=0;
        String pares="";
        
        System.out.println("Digite un numero: ");
        numeroIngresado=read.nextInt();
        while(numeroIngresado!=0){
            if(numeroIngresado%2==0){
                pares+=numeroIngresado+", ";  
            }
            System.out.println("Digite un numero: ");
            numeroIngresado=read.nextInt();
        }System.out.println("Los numero pares son: "+pares);
        
    }
    
}
