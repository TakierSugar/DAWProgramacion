import java.util.Scanner;

public class Ejemplo37 {
    
    public static void main(String[] args){

        //Declaro variables
        int[] numero = {1,2,3,4,5,6,7,8,9,10};
        int menor = 0, mayor = 0;
        Scanner reader = new Scanner (System.in);

        //Empieza el programa
        for (int valor : numero) {

            System.out.println("Dame diez numeros: (llevas "+ (valor-1) +")");
            valor = reader.nextInt();
                if (menor == 0){ menor = valor;mayor = valor;
                }
            if (valor<menor){ 
                menor=valor;
            }
            if (valor>mayor){ 
                mayor=valor;
            }
        }
        reader.close();
        System.out.println("El menor número es: " + menor + " y el mayor número es: " + mayor);
    }
}
