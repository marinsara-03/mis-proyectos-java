/*Escriba un programa que permita calcular independientemente la suma de los números pares e impares comprendidos entre 
1 y 200.*/
package ciclofor7;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class CicloFor7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int par=0;
        int impar=0;
        int suma=0;
        int suma2=0;
        for(int i=0; i<=200; i=i+1){
            if (i%2==0){
                suma=par+=i;
               
            }else{
                suma2=impar+=i;
            }
            System.out.println("La suma de los numero pares es: "+par);
            System.out.println("La suma de los numeros impares es: "+impar);
        }
    }
    
}

