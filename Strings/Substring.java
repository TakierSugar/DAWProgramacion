public class Substring {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce la cadena");
        int posicion1 = Utilidades.leerEntero("Introduce la posicion1");
        int posicion2 = Utilidades.leerEntero("Introduce la posicion2");
        System.out.println(cadena.substring(posicion1, posicion2)); 
    } 
}
