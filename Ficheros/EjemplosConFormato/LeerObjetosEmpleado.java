package Ficheros.EjemplosConFormato;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerObjetosEmpleado {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream f = new ObjectInputStream(new FileInputStream("DAWProgramacion-2/Ficheros/EjemplosConFormato/Empleados.obj"));

        Empleado e;
        try {
            while(true) {
                e = (Empleado) f.readObject();
                System.out.println("Número: " + e.getNum());
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Departamento: " + e.getDepartamento());
                System.out.println("Edad: " + e.getEdad());
                System.out.println("Sueldo: " + e.getSueldo());
                System.out.println(); 
            }

        }catch (EOFException eof) {
            f.close();
        }
        
    }
}
