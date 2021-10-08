import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        
        //Declaración de variables
        double pago, hora;
        double bruto = 0, salario = 0, impuestos = 0; 
        Scanner reader = new Scanner (System.in);
        //Empieza el programa
        System.out.println("Cuantas horas trabaja?"); 
        hora = reader.nextDouble();

        System.out.println("Cuanto cobra por hora?"); 
        pago = reader.nextDouble();
        reader.close();

        if (hora > 35){
            salario = ((hora - 35)*1.5)+35;
        }else{ 
            salario = hora;
        }

        if (salario > 500){
            impuestos = 0.75; 
            bruto = (((salario-500)*impuestos)+500);
        }else if (salario > 900){
            impuestos = 0.55;
            bruto = (((salario-900)*impuestos)+(400*0.75)+500);
        }else{ 
            bruto = salario; 
        }

        System.out.println(bruto * pago + "€");


    }

}
