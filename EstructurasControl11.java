/*Leer números hasta que el usuario ingrese 0, luego, imprimir los números pares.*/
package estructurascontrol11;
import java.util.Scanner;
public class EstructurasControl11 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        String impares="";
        int numeroIngresado=0;
        System.out.println("Digite un numero: ");
        numeroIngresado=read.nextInt();
        while(numeroIngresado!=0){
            if(numeroIngresado%2!=0){
                impares+=numeroIngresado+", ";
            }
            System.out.println("Digite un numero: ");
            numeroIngresado=read.nextInt();
        }System.out.println("Los numeros imapres ingresados fueron: "+impares);
    }
    
}
