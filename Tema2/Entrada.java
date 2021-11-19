package Tema2;

import java.util.Scanner;

public class Entrada {
    public static int getInteger(){
        int resultado = 0;
        String mensaje = "Escriba un entero: ";
        Scanner reader = new Scanner(System.in);
        boolean entero = false;

        System.out.println(mensaje);
        while (!entero){
            if(reader.hasNextLine() && reader.hasNextInt()){
                resultado = reader.nextInt();
                
                entero = true;
            }else{
                System.out.println("Este valor no es entero");
                System.out.println(mensaje);
                
            }
            reader.nextLine();
        }
        reader.close();
        return resultado;
    }   
}
