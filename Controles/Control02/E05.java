package Controles.Control02;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        
        //variables
        String numero, invertido = "";
        Scanner reader = new Scanner(System.in);

        //empieza el programa
        System.out.println("Ingrese numero: ");
        numero = reader.nextLine();
        
        for (int x = numero.length() - 1; x >= 0; x--){
            invertido = invertido + numero.charAt(x);}
        System.out.println(invertido);    
    }
}
