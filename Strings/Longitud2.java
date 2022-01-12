public class Longitud2 {
  
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

        if (medirLongitud(palabras, longitud) == 0){
            System.out.println("No hay palabras de esta longitud");
        }else{
            System.out.printf("La cadena contiene %d palabras de longitud %d", medirLongitud(palabras, longitud), longitud);
        }
        System.out.println(" ");
    }

}
  
