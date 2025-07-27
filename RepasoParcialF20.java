/*Imprimir un triángulo de asteriscos, se debe recibir el número que tendrá la base, por ejemplo, si por pantalla se recibe un 4, se debe imprimir:
*
**
***
*****/
package repasoparcialf20;
import java.util.Scanner;
public class RepasoParcialF20 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int numeroBase=0;
        String asteriscos="*";
        
        System.out.println("Digita un numero para la base de asteriscos");
        numeroBase=read.nextInt();
        
        for (int i=1; i<=numeroBase; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    
}
