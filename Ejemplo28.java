import java.util.Scanner;

public class Ejemplo28 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        int numero, divisor = 2;
        boolean esPrimo = true;
        Scanner reader = new Scanner (System.in);

        //Empieza el programa
        System.out.println("Número:");
        numero = reader.nextInt();
        reader.close();

        while ((divisor < numero) && esPrimo){

            if ((numero%divisor)==0)
                esPrimo = false;
            
            divisor++;
        }
        if (esPrimo == true){ 
        
        System.out.println(numero + " es primo");

        }else if (esPrimo == false){

        System.out.println(numero + " no es primo");

        }        
    }   
}