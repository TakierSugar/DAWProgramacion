package Tema1;
import java.util.Scanner;

public class Ejemplo27 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        int numero = 0;
        Scanner reader = new Scanner (System.in);

        //Empieza el programa
        System.out.println("Pideme un numero");
        numero = reader.nextInt();
        reader.close();

        for (int i = 0; i <= numero; i++) {
            for(int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }
            System.out.println(); 
        }
       
    }
}