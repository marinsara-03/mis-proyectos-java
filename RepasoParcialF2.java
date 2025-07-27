/*Calcular la suma de los numeros del 1 al 100*/
package repasoparcialf2;
import java.util.Scanner;
public class RepasoParcialF2 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int suma=0;
        for(int i=1; i<=100; i++){
            suma+=i;
        }System.out.println(suma);
    }
    
}
