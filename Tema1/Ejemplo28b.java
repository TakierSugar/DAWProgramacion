package Tema1;
import java.util.Scanner;

public class Ejemplo28b {

    public static void main(String[] args) {
        
        //Declaración de variables
        int numero, contador = 0;
        Scanner reader = new Scanner (System.in);

        //Empieza el progama
        System.out.println("Dame un número");
        numero = reader.nextInt();
        reader.close();
        for (int i = 1; i < numero; i++){
            if (numero%i==0){
                contador = contador + 1;
            }
        }
        if (contador >= 2){
            System.out.println(numero + " no es un número primo");
        }else{
            System.out.println(numero + " es un número primo");
        }
    }
}
