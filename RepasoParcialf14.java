/*Determinar si un numero es primo*/
package repasoparcialf14;
import java.util.Scanner;
public class RepasoParcialf14 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int numero=0;
        int divisores=0;
        
        System.out.println("Ingrese un numero entero positivo: ");
        numero=read.nextInt();
        
        if (numero>1){
            for (int i=2; i<=numero/2; i++){
                if (numero%i==0){
                    divisores++;
                    break;
                }
            }
            if(divisores==0){
                System.out.println("Es primo");
            }else{
                System.out.println("No es primo");
            }
        }else{
            System.out.println("Los numeros menores a 1 no son primos");
        }
    }
    
}
