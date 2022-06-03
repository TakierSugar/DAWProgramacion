package Tema1;
public class Ejemplo40 {
    
    public static void main(String[] args) {
    
        //variables 
        int n1 = 1, n2 = 1, t;
        String lista = n1 + ", " + n2;

        //inicia el programa
        for(int i=3; i <= 40; i++){
            t = n1 + n2;
            lista = lista + ", " + t;
            n1 = n2;
            n2 = t;
        }
        System.out.println(lista);
    }
}
