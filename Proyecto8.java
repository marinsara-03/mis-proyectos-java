/*FUNCIONES*/
package proyecto8;

import java.util.Scanner; // Importa la clase Scanner para poder leer la entrada del usuario.

public class Proyecto8 { // Define la clase principal del programa.

    /*public static void funcion1(){ //Define un método llamado 'funcion1' que no toma parámetros y no devuelve ningún valor ('void').
        System.out.println("Hola mundo"); // Imprime la cadena "Hola mundo" en la consola.
    }

    public static void main(String[] args) { // El método principal donde comienza la ejecución del programa.
        Scanner read=new Scanner(System.in); // Crea un objeto Scanner para leer datos desde el teclado.
        
        for(int i=1; i<=100; i++){ // Inicia un bucle 'for' que se ejecuta 100 veces (desde i=1 hasta i=100).
            funcion1(); // Llama a la función 'funcion1' en cada iteración, imprimiendo "Hola mundo" 100 veces.
        }
    }*/
    
    /*// --- Ejemplo 2: Función con dos parámetros y sin valor de retorno (void) ---
    public static void funcion2(int number1, int number2){ // Define 'funcion2' que recibe dos enteros y no devuelve nada.
        int resultado=number1+number2; // Declara una variable 'resultado' y almacena la suma de los dos parámetros.
        System.out.println(resultado); // Imprime el valor de la variable 'resultado'.
    }

    public static void main(String[] args){ // El método principal.
        funcion2(10, 5); // Llama a 'funcion2' pasando los valores 10 y 5 como argumentos, imprimiendo 15.
    }*/
    
    /*// --- Ejemplo 3: Función con un parámetro y sin valor de retorno (void) ---
    public static void funcion2(int number1){ // Define otra 'funcion2' que solo recibe un entero.
        for(int i=1; i<=10; i++){ // Bucle para calcular la tabla de multiplicar hasta el 10.
            int resultado=number1*i; // Multiplica el parámetro 'number1' por el contador del bucle 'i'.
            System.out.println(resultado); // Imprime el resultado de la multiplicación en cada iteración.
        }
    }

    public static void main(String[] args){ // El método principal.
        funcion2(10); // Llama a 'funcion2' con el valor 10, imprimiendo la tabla del 10.
    }
    */
    
    /*
    // --- Ejemplo 4: Función con valor de retorno (int) ---
    // Si hay un 'void' no se debe colocar 'int', 'string' o 'double', y se debe colocar un 'return'.
    public static int funcion3(int number1, int number2){ // Define 'funcion3' que recibe dos enteros y devuelve un entero ('int').
        int resultado=number1+number2; // Suma los dos parámetros.
        return resultado; // Devuelve el valor de 'resultado' al lugar donde fue llamada la función.
    }

    public static void main(String[] args){ // El método principal.
        System.out.println(funcion3(10,5)); // Llama a 'funcion3', y el valor que retorna (15) es impreso directamente.
    }
    */
    
    // --- Ejemplo 5: Función activa para encontrar el mayor de dos números ---
    public static int funcion4(int number1, int number2){ // Define 'funcion4' que recibe dos enteros y devuelve el mayor de los dos.
        if(number1 > number2){ // Compara si 'number1' es mayor que 'number2'.
            return number1; // Si la condición es verdadera, retorna 'number1'.
        } else { // Si la condición es falsa (number2 es mayor o igual).
            return number2; // Retorna 'number2'.
        }
    }

    public static void main(String[] args){ // El método principal donde el programa inicia su ejecución.
        Scanner read=new Scanner(System.in); // Crea un objeto 'Scanner' para la entrada del usuario.
        
        int number1=0; // Declara e inicializa la primera variable.
        int number2=0; // Declara e inicializa la segunda variable.
        
        System.out.println("Digite un numero: "); // Solicita al usuario el primer número.
        number1=read.nextInt(); // Lee el entero ingresado por el usuario y lo asigna a 'number1'.
        
        System.out.println("Digite un numero: "); // Solicita el segundo número.
        number2=read.nextInt(); // Lee el segundo entero y lo asigna a 'number2'.
        
        System.out.println(funcion4(number1, number2)); // Llama a 'funcion4' y el valor que retorna (el número más grande) se imprime en la consola.
    }
}