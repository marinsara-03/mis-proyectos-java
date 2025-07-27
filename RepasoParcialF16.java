/*Validar una clave con máximo 3 intentos.*/
package repasoparcialf16;
import java.util.Scanner;
public class RepasoParcialF16 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        String contraseña=" ";
        
        for(int i=1; i<=3; i++){
            System.out.println("Digite la contraseña: ");
            contraseña=read.nextLine();
            
            if (contraseña.equals("ajiaco")){
                System.out.println("Contraseña correcta");
                break;
            }else{
                if(i==1){
                    System.out.println("Te quedan 2 intentos");
                }else if(i==2){
                    System.out.println("Te queda 1 intento");
                }else{
                    System.out.println("Acceso denegado");
                }
            }
        }
    }
    
}
