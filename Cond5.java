/*Solicita al usuario una contraseña y verifica si es correcta (la contraseña correcta es:
"admin123").*/
package cond5;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        System.out.println("Ingrese la contraseña");
        String password=read.nextLine();
        if (password.equals("admin123")){
            System.out.println("La contraseña es correcta");
        }else if (!password.equals("admin123")){
            System.out.println("La contraseña es incorrecta");
        }
    }
    
}
