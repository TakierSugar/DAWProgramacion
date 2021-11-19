package Tema2;

import java.util.Scanner;

public class EsDivisible {
    public static boolean esDivisible(){

        //variables
        int dividendo, divisor;
        Scanner reader = new Scanner(System.in);
        boolean resultado = false;

        System.out.println("Dame el dividendo");
        dividendo = reader.nextInt();
        System.out.println("Dame el divisor");
        divisor = reader.nextInt();
        reader.close();
        if (dividendo%divisor == 0){
            resultado = true;
        }else if (dividendo%divisor != 0){ resultado = false;
        }
        return resultado;
    }
}
