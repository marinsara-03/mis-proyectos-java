/*Leer notas hasta que se ingrese -1. Calcular el promedio.*/
package repasoparcialf17;
import java.util.Scanner;
public class RepasoParcialF17 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        double nota=0;
        double suma=0;
        double count=0;
        double promedio=0;
        
        System.out.println("Digita las notas, coloca -1 para finalizar: ");
        nota=read.nextDouble();
        
        while(nota!=-1){
            suma+=nota;
            count++;
            promedio=suma/count;
            System.out.println("Digita las notas, coloca -1 para finalizar: ");
            nota=read.nextDouble();
        }System.out.println(promedio);
 
    }
    
}
