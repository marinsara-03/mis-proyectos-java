/*Leer números hasta que el usuario ingrese 0, luego, imprimir el promedio.*/
package estructurascontrol9;
import java.util.Scanner;
public class EstructurasControl9 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        double promedio=0;
        double suma=0;
        int numeroIngresado=0;
        int count=0;
        System.out.println("Digite un numero: ");
        numeroIngresado=read.nextInt();
        while(numeroIngresado!=0){
            count+=1;
            suma=suma+numeroIngresado;
            promedio=suma/count;
            System.out.println("Digite un numero: ");
            numeroIngresado=read.nextInt();
        }System.out.println("El promedio de los numeros ingrsados es : "+promedio);
    }
    
}
