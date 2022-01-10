/*public class Calculadora {
    public static void main(String[] args) {
        //variables
        String linea;

        linea = Utilidades.leerCadena("-->");

        while(!EsFin(linea)){
            if(esOperacionValida(linea))
            //ProcesarLinea(linea);
            linea = Utilidades.leerCadena("-->");
        }
    }

    public static boolean esOperacionValida(String linea) {
        String [] elementos = Utilidades.dividirEnPalabras(linea);

        if (elementos.length == 3){
                if (isDouble(elementos [0]) && 
                    isOperator(elementos[1]) && 
                    isDouble(elementos[2])){
                        return true;
                    }
            }else{
                return false;
        }
    }

    public static boolean isDouble(String str){
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException error){
            return false;
        }
    }

    private static boolean EsFin(String linea) {
        //Fin,fin, FiN, FIN...
        String minusculas = linea.toLowerCase();
        if(minusculas.equals("fin")){
            return true;
        }else{
            return false;
        }
    }
}*/