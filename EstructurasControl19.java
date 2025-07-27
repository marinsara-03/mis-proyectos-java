/*Leer numero hasta que el ingresado sea mayor al anterior*/
package estructurascontrol19;
import java.util.Scanner;
public class EstructurasControl19 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int numeroAnterior=Integer.MIN_VALUE;
        int numeroNuevo=Integer.MIN_VALUE;
        System.out.println("Ingrese un numero: ");
        numeroAnterior=read.nextInt();
        while(numeroNuevo<numeroAnterior){
            System.out.println("Ingrese un numero: ");
            numeroNuevo=read.nextInt();
            if(numeroNuevo<=numeroAnterior){
                System.out.println("El numero no es mayor que el anterior");
            }
            numeroAnterior=numeroNuevo;
        }System.out.println("El numero igresado: "+numeroNuevo+" es mayor que "+numeroAnterior);
    }
    
}
