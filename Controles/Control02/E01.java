package Controles.Control02;

import java.util.Scanner;

public class E01 {

    public static void main(String[] args) {
        
        //variables
        String nombre;
        Scanner reader = new Scanner(System.in);

        //comienza el programa
        System.out.println("Ingrese su nombre: ");
        nombre = reader.nextLine();
        reader.close();
        System.out.println("Hola, " + nombre);
    }
    
}
