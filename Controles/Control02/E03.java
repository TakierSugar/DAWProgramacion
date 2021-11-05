package Controles.Control02;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        //variables
        int nota1, nota2, nota3, nota4;
        Scanner reader = new Scanner(System.in);

        //Empieza el programa
        System.out.println("Primera nota: ");
        nota1 = reader.nextInt();
        System.out.println("Segunda nota: ");
        nota2 = reader.nextInt(); 
        System.out.println("Tercera nota: ");
        nota3 = reader.nextInt(); 
        System.out.println("Cuarta nota: ");
        nota4 = reader.nextInt();
        reader.close();
        System.out.println("El promedio es: " + ((nota1 + nota2 + nota3 + nota4)/4));

    }
}
