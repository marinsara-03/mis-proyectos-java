/*Leer contraseñas hasta que se ingrese una correcta la contraseña correcta es: 123yose*/
package estructurascontrol17;
import java.util.Scanner;
public class EstructurasControl17 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        String contraseñaI="";
        String contraseñaC="123yose";
        System.out.println("Digite una contraseña: ");
        contraseñaI=read.nextLine();
        if (contraseñaI.equals(contraseñaC)){
            System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta");
        }
        
    }
    
}
