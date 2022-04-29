package Ficheros.ControlFicheros;

import java.io.FileInputStream;
import java.io.IOException;

public class LectorClientes {
    public static void main(String[] args) throws IOException {
        FileInputStream lector = new FileInputStream("DAWProgramacion-2/Ficheros/ControlFicheros/Clientes.dat");
    }
}
