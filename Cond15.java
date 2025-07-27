/*Pida una letra y verifique si es vocal o consonante*/
package cond15;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.print("Digita una letra de tu preferencia: ");
        String letra=read.nextLine();
        if (letra.equals("a") || letra.equals("e") ||letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("La letra es una vocal");
        }else{
            System.out.println("La letra es una consonante");
        }
    }
    
}
