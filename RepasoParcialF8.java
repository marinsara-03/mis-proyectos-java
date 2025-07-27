/*Leer n numeros y calcular el promedio*/
package repasoparcialf8;
import java.util.Scanner;
public class RepasoParcialF8 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        double numeroIngresado=0;
        double suma=0;
        double count=0;
        double promedio=0;
        
        System.out.println("Digita los numeros, coloca 0 para finalizar: ");
        numeroIngresado=read.nextDouble();
        
        while(numeroIngresado!=0){
            suma+=numeroIngresado;
            count++;
            promedio=suma/count;
            System.out.println("Digita los numeros, coloca 0 para finalizar: ");
            numeroIngresado=read.nextDouble();
        }System.out.println(promedio);
    }
    
}
