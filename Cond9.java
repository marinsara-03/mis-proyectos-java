/*Si una persona tiene menos de 12 años o más de 60, aplique un descuento del 15% en
su boleta. La boleta vale $20.000, la edad se debe recibir por pantalla. El programa
debe imprimir el costo de la boleta, la edad, el descuento y el total a pagar.*/
package cond9;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.print("Digite el precio de la boleta: ");
        double boleta=read.nextDouble();
        System.out.print("Digite la edad de la persona: ");
        int edad=read.nextInt();
        if (edad<=12 || edad>=60){
            double descuento=0.15*boleta;
            double pfinal= 20000-descuento;
            System.out.println("La boleta tiene un costo de "+boleta+" pesos, la persona tiene "+edad+" años, su descuento es de "
            +descuento+" pesos, y su total a pagar es: "+pfinal);
        }else if (edad>12 && edad<60){
            System.out.println("La persona no tiene descuento");
        }
    }
    
}
