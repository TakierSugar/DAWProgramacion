public class Ends {
  
    public static boolean terminar(String cadena1, String cadena2){
        return cadena1.endsWith(cadena2);
        
    }
    public static void main(String[] args) {

        String cadena1 = Utilidades.leerCadena("Introduce cadena1");
        String cadena2 = Utilidades.leerCadena("Introduce cadena2");
        boolean resultado = terminar(cadena1, cadena2);

        if (resultado == true) System.out.println(cadena1 + " termina con " + cadena2);
        else if (resultado == false) System.out.println(cadena1 + " no termina con " + cadena2);

        
        
    }
}


