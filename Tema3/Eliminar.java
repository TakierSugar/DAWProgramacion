package Tema3;

import java.util.Scanner;

public class Eliminar {

    public static void main(String[] args) {
        //variables
        int[] elementos = {1,2,3,4,5,6,7};
        int cambio;
        Scanner reader = new Scanner (System.in);

        //Programa
        for (int i = 0; i<elementos.length; i++){
            System.out.print(elementos[i] + ", ");
            
        }
        System.out.println("Dime el número que quieres mover al final");
        cambio = reader.nextInt();
        //elementos.remove(cambio);

    }
}
