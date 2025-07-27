/*Pida dos numeros y verifique si son consecutivos*/
package cond17;
import java.util.Scanner;


/**
 *
 * @author flaka
 */
public class Cond17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero1=read.nextInt();
        System.out.println("Ingrese otro numero: ");
        int numero2=read.nextInt();
        if (numero1>numero1+1){
            System.out.println("Los numeros son consecutivos");
        }else{
            System.out.println("Los numeros no son consecutivos");
        }
    }
    
}
