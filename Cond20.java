/*Si compra mas de 20 litros de gasolina, aplica un 5% de descuento (litro de gasolina=10.000).El programa debe 
imprimir el valor del litro, cuantos litro compraron, el descuento a aplicar y el total a pagar*/
package cond20;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.println("Ingrese el valor de 1 litro: ");
        double pgasolina=read.nextDouble();
        System.out.println("Ingrese cuantos litros desea comprar: ");
        double cantgas=read.nextDouble();
        if (cantgas>20){
            double ptotal=pgasolina*cantgas;
            double descuento=ptotal*0.05;
            double pfinal=ptotal-descuento;
            System.out.println("El valor de un lito es "+pgasolina+" pesos, se compraron "+cantgas+" litros. Su descuento es de "+descuento+
            " pesos y su total a pagar es: "+pfinal);
        }else{
            System.out.println("No aplica descuento ya que la cantidad de litros debe de ser mayor a 20");
        }
    }
    
}
