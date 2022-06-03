package Tema1;
public class Ejemplo41 {
    
    public static void main(String[] args) {
    
        //variables 
        double n1 = 1, n2 = 1, t;
        String lista = n1 + ", " + n2;

        //inicia el programa
        for(double i=3; i <= 40; i++){
            t = n1 + n2;
            n1 = n2;
            n2 = t;
            lista = lista + ", " + (n2/n1);
        }
        
        System.out.println(lista);
    }
}
