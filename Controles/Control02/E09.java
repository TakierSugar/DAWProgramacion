package Controles.Control02;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        //variables
        double Nc, C1, C2, C3, NF = 60, NL;
        Scanner reader = new Scanner(System.in);

        //programa
        System.out.print("Ingrese nota certamen 1: ");
        C1 = reader.nextInt();
        System.out.print("Ingrese nota certamen 2: ");
        C2 = reader.nextInt();
        System.out.print("Ingrese nota laboratorio: ");
        NL = reader.nextInt();
        reader.close();
        
        Nc = ((NF-(NL*0.3))/0.7);
        C3 = (Nc*3)- C1 - C2;

        System.out.println(C3);
    }
}
