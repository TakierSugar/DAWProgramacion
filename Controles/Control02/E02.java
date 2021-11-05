package Controles.Control02;

import java.util.Scanner;

public class E02 {
    
    public static void main(String[] args) {
        
        //variables
        int radio;
        Scanner reader = new Scanner(System.in);

        //comienza el programa
        System.out.println("Ingrese el radio: ");
        radio = reader.nextInt();
        reader.close();
        System.out.println("Perimetro: " + (2*radio*Math.PI));
        System.out.println("Área: " + (Math.PI*radio*radio));
    }
}
