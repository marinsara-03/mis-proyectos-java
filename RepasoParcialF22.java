/*Mostrar serie Fibonacci hasta n términos.*/
package repasoparcialf22;
import java.util.Scanner;
public class RepasoParcialF22 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int numeroIngresado=0;
        int numero1=0;
        int numero2=1;
        int numeroSiguiente=0;
        
        System.out.println("Digite un numero: ");
        numeroIngresado=read.nextInt();
        
        for(int i=0; i<numeroIngresado; i++){
            System.out.println(numero1);
            numeroSiguiente=numero1+numero2;
            numero1=numero2;
            numero2=numeroSiguiente;
        }
    }
    
}
