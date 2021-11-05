package Controles.Control02;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        
        //variables
        int catetoA, catetoB;
        Scanner reader = new Scanner(System.in);

        //empieza el programa
        System.out.println("Ingrese cateto a: ");
        catetoA = reader.nextInt();
        System.out.println("Ingrese cateto b: ");
        catetoB = reader.nextInt();
        reader.close();

        System.out.println("La hipotenusa es " + Math.sqrt((catetoA*catetoA)+(catetoB*catetoB)));
    }
}
