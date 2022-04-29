package Ficheros.ControlFicheros;

import java.io.FileOutputStream;
import java.io.IOException;

public class PersistenciaCliente {
    public static void main(String[] args) throws IOException {

        Cliente [] clientela = new Cliente[2];
        Cliente cliente1 = new Cliente(1, "email", "nif", "nombre", "apellidos");
        clientela [0] = cliente1;
        Cliente cliente2 = new Cliente(2, "email", "nif", "nombre", "apellidos");
        clientela [1] = cliente2;

        FileOutputStream escritor = new FileOutputStream("DAWProgramacion-2/Ficheros/ControlFicheros/Clientes.dat");  
        for(int i = 0 ; i < clientela.length; i++){
            String text = cliente1.infoCLiente;
            for (int j = 0; j < text.length(); j++){
                escritor.write(text.charAt(j));
            }
        }
        escritor.close();     
    }
}
