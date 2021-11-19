package Tema2;

import java.util.Scanner;

public class EsTriangulo {
    public static boolean esTriangulo(){

        //variables
        int a,b,c;
        Scanner reader = new Scanner(System.in);
        boolean resultado = false;

        System.out.println("Dame a");
        a = reader.nextInt();
        System.out.println("Dame b");
        b = reader.nextInt();
        System.out.println("Dame c");
        c = reader.nextInt();
        reader.close();

        if (a+b < c || a+c < b || b+c < a){resultado = false;
        }else{
            resultado = true;
        }
        return resultado;
    }
}