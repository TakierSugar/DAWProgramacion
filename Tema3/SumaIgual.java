

import java.util.Scanner;

public class SumaIgual {
    public static void main(String[] args) {
        //variables
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int NumeroQuerido;
        Scanner lector = new Scanner(System.in);

        //programa
        System.out.print("Dame el valor de la suma: ");
        NumeroQuerido = lector.nextInt();
        lector.close();

        for (int i = 0; i <= numeros.length; i++){
            for (int j = i+1; j < numeros.length; j++){
                if( i + j == NumeroQuerido){
                    System.out.println(i + " + " + j + " = " + NumeroQuerido);
                }
            }
        }
    }
}
