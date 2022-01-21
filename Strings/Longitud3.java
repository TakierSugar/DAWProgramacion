public class Longitud3 {
    
    public static int medirLongitud(String[] palabras, int longitud) {
        int cuantas = 0;
        for (String palabra : palabras) {
            if (palabra.length() == longitud) {
                cuantas++;
            }
        }
        return cuantas;
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce un texto");
        String palabras[] = Utilidades.dividirEnPalabras(cadena);
        int longitud = Utilidades.leerEntero("¿De que longitud son las palabras?");

        if (medirLongitud(palabras, longitud) >=longitud){
            System.out.println("Todas las cadenas son cortas");
        }else if (medirLongitud(palabras, longitud) < longitud){
            System.out.printf("Si hay palabras de este tamaño o mayores");
        }
        System.out.println(" ");
    }

}