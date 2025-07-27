/*Leer un número y mostrar cuántos divisores tiene.*/
package repasoparcialf21;
import java.util.Scanner;
public class RepasoParcialF21 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numero=0;
        
        System.out.println("Digite un numero: ");
        numero=read.nextInt();
        
        for(int i=1; i<=numero; i++){
            if (numero%i==0){
                System.out.println(i);
            }
        }
    }
    
}
