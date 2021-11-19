package Tema2;

public class Descendente {
    public static void ascendente(int a, int b){
        //programa
        
        if (a<b){
            System.out.println(a + ", " + b);
        }else if (a>b){
            System.out.println(b + ", " + a);
        }
    }
        public static void main(String[] args) {
            ascendente(1, 5);
    }
}
