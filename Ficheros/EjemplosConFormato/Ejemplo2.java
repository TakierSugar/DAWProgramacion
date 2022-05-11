package Ficheros.EjemplosConFormato;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo2 {
    public static void main(String[] args) throws IOException {
        
        DataInputStream f = new DataInputStream(new FileInputStream("DAWProgramacion-2/Ficheros/EjemplosConFormato/Empleados.dat"));

        while (f.available()>0){
            System.out.println("Número: " + f.readInt());
            System.out.println("Nombre: " + f.readUTF());
            System.out.println("Departamento:" + f.readInt());
            System.out.println("Edad: " + f.readInt());
            System.out.println("Sueldo: " + f.readDouble());
            System.out.println();
        }
        f.close();
    }
    
}
