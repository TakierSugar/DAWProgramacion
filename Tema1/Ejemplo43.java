package Tema1;
import java.util.Scanner;

public class Ejemplo43 {
    
    public static void main(String[] args) {
    
        //variables
        int dividendo = 0, divisor = 0, cociente = 0;
        Scanner reader = new Scanner (System.in);

        //empieza el programa
        System.out.println("Dime el dividendo");
        dividendo = reader.nextInt(); 
        System.out.println("Dime el divisor");
        divisor = reader.nextInt();
        reader.close();

        while (dividendo>=divisor){
            dividendo=dividendo-divisor;
            cociente++; }
        System.out.println("El resultado es " + cociente);
    }     
}