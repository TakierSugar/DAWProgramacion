package Controles.Control02;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        
        //variables
        double numero, decimal;
        Scanner reader = new Scanner(System.in);

        //programa
        System.out.println("Ingrese un numero: ");
        numero = reader.nextDouble();
        reader.close(); 
        decimal = numero % 1;
        System.out.println(decimal);
    }
}
