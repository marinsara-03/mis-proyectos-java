/*Si el salario es mayor a $3000, calcule un impuesto del 10%, de lo contrario, no aplica
impuesto. El programa debe imprimir: salario, descuento y total a pagar*/
package cond10;
import java.util.Scanner;
/**
 *
 * @author flaka
 */
public class Cond10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.print("Digite el salario: ");
        double salario=read.nextDouble();
        if (salario>3000){
            double impuesto=salario*0.10;
            double sfinal=salario-impuesto;
            System.out.println("El salario es: "+salario+" pesos, su descuento es: "+impuesto+" pesos, y su total a pagar es: "
                    +sfinal+ " pesos");
        }else{
            System.out.println("Su salario no aplica para el impuesto");
        }
    }
    
}
