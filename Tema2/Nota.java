package Tema2;

public class Nota {
    public static void nota(int Nota){
        //programa
        
        if (Nota>=0 && Nota<3){
            System.out.println(Nota + " Muy Deficiente.");
        }else if (Nota>=3 && Nota<5){
            System.out.println(Nota + " Insuficiente.");
        }else if (Nota>=5 && Nota<6){
            System.out.println(Nota + " Suficiente.");
        }else if (Nota>=6 && Nota<7){
            System.out.println(Nota + " Bien.");
        }else if (Nota>=7 && Nota<9){
            System.out.println(Nota + " Notable.");
        }else if (Nota>=9 && Nota<=10){
            System.out.println(Nota + " Sobresaliente.");
        }
    }
        public static void main(String[] args) {
            nota(5);
    }
}
