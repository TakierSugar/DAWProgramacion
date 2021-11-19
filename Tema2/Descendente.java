package Tema2;

public class Descendente {
    public static void ascendente(int Valor1, int Valor2){
        //programa
        
        if (Valor1<Valor2){
            System.out.println(Valor1 + ", " + Valor2);
        }else if (Valor1>Valor2){
            System.out.println(Valor2 + ", " + Valor1);
        }
    }
        public static void main(String[] args) {
            ascendente(1, 5);
    }
}
