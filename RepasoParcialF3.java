/*Leer números hasta que el usuario ingrese cero y contar cuántos fueron positivos.*/
package repasoparcialf3;
import java.util.Scanner;
public class RepasoParcialF3 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numeroIngresado=0;
        int numerosPositivos=0;
        int count=0;
        
        System.out.println("Digite un numero y cuando quiera terminar digite 0: ");
        numeroIngresado=read.nextInt();
        
        while(numeroIngresado!=0){
            if (numeroIngresado>0){
                count++;
            }
            System.out.println("Digite un numero y cuendo quiera terminar digite 0: ");
            numeroIngresado=read.nextInt();
        }System.out.println("Se ingresaron "+count+ "numeros pares");
    }
    
}
