/*Pedir una contraseña hasta que el usuario la escriba correctamente.*/
package repasoparcialf6;
import java.util.Scanner;
public class RepasoParcialF6 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        String contraseña="";
        
        System.out.println("Digite la contraseña: ");
        contraseña=read.nextLine();
        
        if (contraseña.equals("ajiaco")){
            System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }
    
}
