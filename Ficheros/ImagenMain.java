package Ficheros;

import java.io.File;
import java.io.IOException;

public class ImagenMain {
    public static void main(String[] args) throws IOException {

        File f = new File("./archivos/penyagolosa.bmp");

        TransformaImagen ti = new TransformaImagen(f);

        ti.transformaNegativo();

        ti.transformaOscuro();

        ti.transformaBlancoNegro();

    }

}