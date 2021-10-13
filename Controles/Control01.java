package Controles;
import java.util.Scanner;

    public class Control01 {
        
        public static void main(String[] args) {
            
        
    //Declaracion de variables
    int numero;
    double longitud;
    Scanner reader = new Scanner(System.in);

    //Empieza el programa
    System.out.println("Dime el número de lados del polígono:");
    numero = reader.nextInt();

    if ((numero == 3)||(numero==4)){

        System.out.println("Dime la longitud del lado del polígono:");
        longitud = reader.nextDouble();
        reader.close();
        if (numero == 3){
            System.out.println("El perímetro del triángulo es " + (longitud*numero));
        }else if (numero == 4){
            System.out.println("El perímetro del cuadrado es " + (longitud*numero));
        }
    }else{
    }
    
}
}