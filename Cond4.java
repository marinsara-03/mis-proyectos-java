/*Si un cliente gasta más de $100, aplica un 10% de descuento; de lo contrario, si gasta
más de $0 pero menos de $100 se cobra el precio normal. El programa debe imprimir el
total gastado, el descuento y el total a pagar.*/
package cond4;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        System.out.print("Digita el precio de la venta: ");
        double precio=read.nextDouble();
        if (precio>100){
            double descuento=precio*0.10;
            double pfinal=precio-descuento;
            System.out.println("El precio de venta fue de: "+precio+" pesos, el descuento son "+descuento+" pesos "
                    + "y su total a pagar son "+pfinal);
        }else if(precio>0 && precio<100){
        System.out.println("La venta no tiene descuento");
    }
    }
    
}
