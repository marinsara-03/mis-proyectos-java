/*Calcular la factorial de un número.*/
package repasoparcialf5;
import java.util.Scanner;
public class RepasoParcialF5 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numeroIngresado=0;
        int factorial=1;
        
        System.out.println("Digite un numero: ");
        numeroIngresado=read.nextInt();
        
        for(int i=1; i<=numeroIngresado; i++){
            factorial*=i;
        }System.out.println(factorial);
    }
    
}
