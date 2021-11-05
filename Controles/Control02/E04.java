package Controles.Control02;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        
        //variables
        int longitud;
        Scanner reader = new Scanner(System.in);

        //Empieza el programa
        System.out.println("Ingrese longitud: ");
        longitud = reader.nextInt();
        reader.close();
        System.out.println(longitud + "cm = " + (longitud/2.54) + " in");
    }   
}
