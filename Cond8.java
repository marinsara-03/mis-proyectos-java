/*Pregunte un nombre de usuario y contraseña, y permita el acceso solo si ambos son
correctos (los datos correctos son: usuario: “pedro”, pass: “picapiedra”).*/
package cond8;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.print("Digite el usuario: ");
        String user=read.nextLine();
        System.out.print("Digite la contraseña: ");
        String password=read.nextLine();
        if (user.equals ("pedro") && password.equals("picapiedra")){
            System.out.println("El usuario y/o la contraseña son correctos");
        }else {
            System.out.println("El Usuario y/o la a contraseña son incorrectos");
        }
    }
    
}
