/*Leer números hasta que el usuario ingrese 0, luego, imprimir cuantos pares e impares ingresaron*/
package estructurascontrol12;
import java.util.Scanner;
public class EstructurasControl12 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numeroIngresado=0;
        int pares=0;
        int impares=0;
        System.out.println("Digite un numero: ");
        numeroIngresado=read.nextInt();
        while(numeroIngresado!=0){
            if(numeroIngresado%2==0){
                pares++;
            }else{
                impares++;
            }
            System.out.println("Digite un numero: ");
            numeroIngresado=read.nextInt();
        }System.out.println("se ingrsaron: "+pares+" numeros pares y "+impares+" numeros impares");
    }
    
}
