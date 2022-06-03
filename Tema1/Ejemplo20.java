package Tema1;
import java.util.Scanner;

public class Ejemplo20 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        double precio, descuento = 1;
        Scanner reader = new Scanner (System.in);
        //Empieza el programa
        System.out.println("Precio Base:");
        precio = reader.nextDouble();
        reader.close();

        if (precio <= 6){
            System.out.println("El articulo cuesta: " + precio);
        }else if (precio < 60){ 
            descuento = 0.95;
            System.out.println("Tras recibir un descuento del 5% el articulo cuesta: " + (precio * descuento) + "€");
        }else if (precio >= 60){ 
            descuento = 0.90;
            System.out.println("Tras recibir un descuento del 10% el articulo cuesta: " + (precio * descuento) + "€");
        }
    }
}
