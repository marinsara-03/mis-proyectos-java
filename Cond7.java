/*Determine si un año es bisiesto (divisible por 4 y no por 100)*/
package cond7;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        System.out.print("Digita un año:");
        int año=read.nextInt();
        if ((año%4==0 && año%100!=0)|| año%400==0){
            System.out.println(año+" El año es bisiesto");
        }else {
            System.out.println(año+" El año no es bisiesto");
        }
    }
    
}
