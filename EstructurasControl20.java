/*Calcular el factorial de un numero*/
package estructurascontrol20;
import java.util.Scanner;
public class EstructurasControl20 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int numero=0;
        int factorial=1;
        System.out.println("Ingresa un numero: ");
        numero=read.nextInt();
        if (numero>0){
            for(int i=1; i<=numero; i++){
                factorial=factorial*i;
            }System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
    
}
