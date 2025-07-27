/*Leer 10 números y mostrar la suma total.*/
package repasoparcialf1;
import java.util.Scanner;
public class RepasoParcialF1 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numeros= 0;
        int suma=0;
        
        for(int i=1; i<=10; i++){
            System.out.println("Digite un numero: ");
            numeros=read.nextInt();
            suma+=numeros;
        }System.out.println(suma);
    }
    
}
