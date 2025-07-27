/*Mostrar los primeros n múltiplos de 5.*/
package repasoparcialf7;
import java.util.Scanner;
public class RepasoParcialF7 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
       int tabla=0;
        System.out.println("Ingrese un numero: ");
        int numero=read.nextInt();
        for(int i=1; i<=numero; i=i+1){
            tabla=5*i;
            System.out.println(tabla);
        }
    }
}
