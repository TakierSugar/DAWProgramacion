public class AnalizaString {
    //Leer cadena de texto -> Decir cuantos digitos hay -> Decir cuantas letras hay -> Decir cuantos simbolos hay
        public static void main(String[] args) {
        String cadena = "¡3 tristes tigres comen trigo en 1 trigal!";
        int contador_digitos = 0;
        int contador_letras = 0;
        int contador_simbolos = 0;
        System.out.println(cadena);
        cadena.toLowerCase();
        

        for(int i = 0 ; i < cadena.length(); i++){
            if (cadena.charAt(i) == 1 || cadena.charAt(i) == 2 || cadena.charAt(i) == 3 || cadena.charAt(i) == 4 || cadena.charAt(i) == 5 || cadena.charAt(i) == 6 || cadena.charAt(i) == 7 || cadena.charAt(i) == 8 || cadena.charAt(i) == 9 || cadena.charAt(i) == 0){
                contador_digitos++;
            }
        }
        System.out.println(contador_digitos);
    }
    
}
