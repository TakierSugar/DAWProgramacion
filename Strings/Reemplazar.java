public class Reemplazar {

    public static String sustituto(String cadena1, String cadena2, String cadena3){
        return cadena1.replace(cadena2, cadena3);
        
    }
    public static void main(String[] args) {

        String cadena2 = Utilidades.leerCadena("Introduce la palabra");
        String cadena3 = Utilidades.leerCadena("Introduce que quieres cambiar");
        String cadena1 = Utilidades.leerCadena("Introduce con que lo quieres cambiar");
        String resultado = sustituto(cadena2, cadena3, cadena1);

        System.out.println(resultado);

        
        
    }
}
