package Ficheros;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.io.StringReader;

public class ProbandoEjemplos {
    //Ejemplo 1
    /*public static void main(String[] args) throws IOException{

        FileInputStream f_in = new FileInputStream("DAWProgramacion-2/Ficheros/f1.txt");
        int c = f_in.read();
        while (c != -1) {
            System.out.println((char) c);
            c = f_in.read();
        }
        f_in.close();
    }*/
    //Ejemplo 2
    /*public static void main(String[] args) throws IOException{
        
        String ent_1 = "Esto es un array de bytes con caracteres raros:á ç ñ";
        byte[] ent = ent_1.getBytes();
        ByteArrayInputStream f_in = new ByteArrayInputStream(ent);
        int c = f_in.read();
        while (c != -1) {
            System.out.println((char)c);
            c = f_in.read();
        }
        f_in.close();
    }*/
    //Ejemplo 3
    /*public static void main(String[] args) throws IOException{
        
        FileInputStream f1 = new FileInputStream("DAWProgramacion-2/Ficheros/f2.txt");
        String ent_1 = "Esto es un array de bytes con caracteres raros:á ç ñ";
        ByteArrayInputStream f2 = new ByteArrayInputStream(ent_1.getBytes());
        SequenceInputStream f_in = new SequenceInputStream(f1, f2);
        int c = f_in.read();
        while (c != -1) {
            System.out.println((char)c);
            c = f_in.read();
        }
        f_in.close();
        f1.close();
        f2.close();
    }*/
    //Ejemplo4
    /*public static void main(String[] args) throws IOException { 
        
        FileInputStream f_in = new FileInputStream("DAWProgramacion-2/Ficheros/f3.txt");
        byte[] buffer = new byte[30];
        int n = f_in.read(buffer);
        while (n != -1){
            for(int i=0;i<n;i++)
                System.out.print((char)buffer[i]);
            System.out.println("");
            n = f_in.read(buffer);
        }
        f_in.close();
    }
}*/
//Ejemplo5
  /*public static void main(String[] args) throws IOException {
        
        String text = "Contenido para el fichero.";
        FileOutputStream f_out = new FileOutputStream("DAWProgramacion-2/Ficheros/f4.txt");
        for (int i = 0; i < text.length(); i++){
            f_out.write(text.charAt(i));
        }
        f_out.close();
    }
}*/
//Ejemplo6
  /*public static void main(String[] args) throws IOException {
        FileInputStream f_in = new FileInputStream("DAWProgramacion-2/Ficheros/f3.txt");
        FileOutputStream f_out = new FileOutputStream("DAWProgramacion-2/Ficheros/f5.txt");

        byte[] buffer = new byte[30];
        int num = f_in.read(buffer);
        while (num != -1) {
            f_out.write(buffer);
            num = f_in.read(buffer);
        }
        f_in.close();
        f_out.close();
    }
}*/
//Ejemplo7
  /*public static void main(String[] args) throws IOException {

        FileReader f_in = new FileReader("DAWProgramacion-2/Ficheros/f4.txt");
        int c = f_in.read();
        while (c != -1) {
            System.out.println((char) c);
            c = f_in.read();
        }
        f_in.close();
    }
}*/
//Ejemplo8
  /*public static void main(String[] args) throws IOException {
        String ent = "Esto es un array de caracteres raros: á ç ñ";
        StringReader f_in = new StringReader(ent);
        int c = f_in.read();
        while(c != -1) {
            System.out.println((char) c);
            c = f_in.read();
        }
        f_in.close();
    }
}*/
//Ejemplo9
/*public static void main(String[] args) throws IOException {
        

        FileReader f_in = new FileReader("DAWProgramacion-2/Ficheros/f3.txt");
        char[] buffer = new char[30];
        int n = f_in.read(buffer);
        while (n != -1) {
            for(int i=0;i<n;i++)
            System.out.print(buffer[i]);
            System.out.println("");
            n = f_in.read(buffer);
        }
        f_in.close();
    }
}*/
//Ejemplo10
  /*public static void main(String[] args) throws IOException {
        FileWriter f_out = null;
        String text = "Contenido para el fichero, sin miedo a los caracteres raros: á ç ñ";

        try {
            f_out = new FileWriter("DAWProgramacion-2/Ficheros/f6.txt");
            for (int i = 0; i < text.length(); i++){
                f_out.write(text.charAt(i));
            }

        } finally {
            if (f_out != null) {
                f_out.close();
            }
        }
    }
}*/
}