package Tema2;

import java.util.Scanner;

public class Positivos2 {
    public static void positivos(int Valor, int contador){
        //variable
        Scanner reader = new Scanner(System.in);

        //programa
        for (int i = 0; i < 10; i++){
            System.out.println("Dame un número llevas " + i);
            Valor = reader.nextInt();
        if ( Valor>=0){ contador++;
            }
        }
        reader.close();
        System.out.println("El número de positivos es: " + contador);    
    }
        public static void main(String[] args) {
            positivos( 0, 0);
    }
}
