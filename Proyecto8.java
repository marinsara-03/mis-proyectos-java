/*FUNCIONES*/
package proyecto8;
import java.util.Scanner;
public class Proyecto8 {
    /*public static void funcion1(){
        System.out.println("Hola mundo");
    }
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        for(int i=1; i<=100; i++){
            funcion1();
        }
    }*/
    
    /*public static void funcion2(int number1, int number2){
        int resultado=number1+number2;
        System.out.println(resultado);
    }
    public static void main(String[] args){
        funcion2(10, 5);
    }*/
    
    /*public static void funcion2(int number1){
        for(int i=1; i<=10; i++){
            int resultado=number1*i;
        System.out.println(resultado);
        }
    }
    public static void main(String[] args){
        funcion2(10);
    }*/
    
    /*public static int funcion3(int number1, int number2){//si hay un void no se debe colocar int, string o double y se debe colocar un return
        int resultado=number1+number2;
        return resultado;
    }
    public static void main(String[] args){
        System.out.println(funcion3(10,5));
    }*/
    
    public static int funcion4(int number1, int number2){
        if(number1>number2){
            return number1;
        }else{
            return number2;
        }
    }
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        
        int number1=0;
        int number2=0;
        System.out.println("Digite un numero: ");
        number1=read.nextInt();
        System.out.println("Digite un numero: ");
        number2=read.nextInt();
        System.out.println(funcion4(number1, number2));
    }
}
