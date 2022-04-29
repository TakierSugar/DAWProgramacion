package Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContarPalabra {
    public static void main(String[] args) throws IOException {

        Scanner escaner = new Scanner(System.in);
        System.out.println("¿Qué fichero deseas analizar?");
        String fichero = escaner.nextLine();
        System.out.println("¿Qué palabra deseas contar?");
        String palabra = escaner.nextLine();

        escaner.close();

        BufferedReader lector = new BufferedReader(new 
        FileReader("DAWProgramacion-2/Ficheros/"+fichero));

        int contador = 0;
        String linea = lector.readLine();
        while ((linea = lector.readLine())!= null){
            String [] separador = linea.split(" ");
            for(int i = 0 ; i < separador.length; i++){
                if (separador[i] == palabra){
                    contador++;
                }
            }
        }
        System.out.println("La palabra " + palabra + " se repite " + contador + " veces");
        lector.close();
    }
}
