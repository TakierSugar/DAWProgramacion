package Tema2;

public class While {

    public static void main(String[] args) {

        int i=0;

        for (i = 0; i < 10; i++){
        System.out.println("Hola: " + i);
        }

        i = 0;
        while(i < 10){
            System.out.println("Hola: " + i);
            i++;
        }

        i = 0;
        do{
            System.out.println("Hola: " + i);
            i++;
        }while (i < 10);
    }
}
