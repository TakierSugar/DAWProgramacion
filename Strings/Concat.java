public class Concat {
    
    public static String concatenar(String cadena1, String cadena2, String cadena3){
        return cadena1.concat(cadena2);
        
    }
    public static void main(String[] args) {

        String cadena1 = Utilidades.leerCadena("Introduce cadena1");
        String cadena2 = Utilidades.leerCadena("Introduce cadena2");
        String cadena3 = concatenar(cadena1, cadena2, cadena1);
        System.out.println(cadena3);
        
    }
}

