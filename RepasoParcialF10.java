/*Leer 3 numeros y decir cual es el mayor*/
package repasoparcialf10;
import java.util.Scanner;
public class RepasoParcialF10 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int numeroIngresado=0;
        int numeroMayor=0;
        
        for(int i=1; i<=3; i++){
            System.out.println("Digite un numero: ");
            numeroIngresado=read.nextInt();
            
            if (numeroIngresado>numeroMayor){
                numeroMayor=numeroIngresado;
            }
        }System.out.println("El numero mayor es: "+numeroMayor);
    }
    
}
