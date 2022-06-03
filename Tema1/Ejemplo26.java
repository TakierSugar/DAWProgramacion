package Tema1;
import java.util.Scanner;

public class Ejemplo26 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        double tabla = 0, numero = 0;
        Scanner reader = new Scanner (System.in);

        //Empieza el programa
        System.out.println("Pideme un numero");
        numero = reader.nextDouble();

        do{

            tabla++;
            System.out.println(tabla + " " + "*" + " " + numero + " " + "=" + " " + tabla * numero);
        }while (tabla != 10); 
        
        reader.close();

    }
}