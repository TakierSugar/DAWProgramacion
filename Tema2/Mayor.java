package Tema2;

import java.util.Scanner;

public class Mayor {
    public static void mayor(int mayoriaDeEdad, int edad){
        //variable
        Scanner reader = new Scanner(System.in);

        //programa
        System.out.print("Dime tu edad: ");
        edad = reader.nextInt();
        reader.close();
        if (edad >= mayoriaDeEdad){
            System.out.println("Eres mayor de edad.");
        }else{
            System.out.println("Aún eres menor");
        }
    }

    public static void main(String[] args) {
        mayor(18,0);
    }
}
