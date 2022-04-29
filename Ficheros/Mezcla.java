package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mezcla {
    public static void main(String[] args)throws IOException {

        FileReader fileReader1;
        FileReader fileReader2;
        FileWriter fileWriter3;

        BufferedReader reader1;
        BufferedReader reader2;
        BufferedWriter writer3;

        try{
            fileReader1 = new FileReader("DAWProgramacion-2/Ficheros/f1.txt");
            fileReader2 = new FileReader("DAWProgramacion-2/Ficheros/f2.txt");

            reader1 = new BufferedReader(fileReader1);
            reader2 = new BufferedReader(fileReader2);
            String fila1 = "";
            String fila2 = "";
            
            fileWriter3 = new FileWriter("DAWProgramacion-2/Ficheros/f3.txt");
            writer3 = new BufferedWriter(fileWriter3);
            String texto = "0";
            do{
                fila1 = reader1.readLine();
                texto = texto + fila1;
                fila2 = reader2.readLine();
                texto = texto + fila2;
            }while(fila1!= null || fila2!= null);
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
