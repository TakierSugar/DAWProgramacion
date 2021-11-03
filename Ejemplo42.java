import java.util.Scanner;

public class Ejemplo42 {
    public static void main(String[] args) {
    
        //variables
        int numero1 = 0, numero2 = 0, multiplicacion = numero1;
        Scanner reader = new Scanner (System.in);

        //empieza el programa
        System.out.println("Dime el primer número");
        numero1 = reader.nextInt(); 
        System.out.println("Dime el otro número");
        numero2 = reader.nextInt();
        reader.close(); 

        for (int i = 0 ; i < numero2 ; i++){
            multiplicacion=multiplicacion+numero1;
        } 
        System.out.println("El resultado es " + multiplicacion);
    }  
} 
