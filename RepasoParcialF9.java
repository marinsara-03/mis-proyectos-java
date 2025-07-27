/*Leer un numero e invertir sus cifras*/
package repasoparcialf9;
import java.util.Scanner;
public class RepasoParcialF9 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numeroIngresado=0;
        int numeroInvertido=0;
        int digito=0;
        
        System.out.println("Digite un numero: ");
        numeroIngresado=read.nextInt();
        
        while(numeroIngresado!=0){
            digito=numeroIngresado%10;
            numeroInvertido=numeroInvertido*10+digito;
            numeroIngresado=numeroIngresado/10;
        }System.out.println(numeroInvertido);
    }
    
}
