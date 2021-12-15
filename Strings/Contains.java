public class Contains {
    
    public static boolean contener(String cadena1, String cadena2){
        return cadena1.contains(cadena2);
        
    }
    public static void main(String[] args) {

        String cadena1 = Utilidades.leerCadena("Introduce cadena1");
        String cadena2 = Utilidades.leerCadena("Introduce cadena2");
        boolean resultado = contener(cadena1, cadena2);

        if (resultado == true) System.out.println(cadena2 + " forma parte de " + cadena1);
        else if (resultado == false) System.out.println(cadena2 + " no forma parte de " + cadena1);

        
        
    }
}

