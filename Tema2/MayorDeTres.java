package Tema2;

public class MayorDeTres {
    public static void mayorDeTres(int Valor1, int Valor2, int Valor3){
        //programa
        
        if (Valor1>Valor2 && Valor1>Valor3){
            System.out.println(Valor1 + " es el mayor");
        }else if (Valor2>Valor1 && Valor2>Valor3){
            System.out.println(Valor2 + " es el mayor");
        }else if (Valor3>Valor1 && Valor3>Valor1){
            System.out.println(Valor3 + " es el mayor");
        }
    }
        public static void main(String[] args) {
            mayorDeTres(1, 5, 9);
    }
}
