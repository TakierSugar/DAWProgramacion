
import java.util.Scanner;
public class Ejemplo16 {
   public static void main(String[] args) {
       int A,B;
       String op;
       
       
       Scanner miScanner = new Scanner(System.in);
       

       System.out.println("Añade el primer número:");
         A = miScanner.nextInt();
       System.out.println("Añade el segundo número:");
         B = miScanner.nextInt();
       System.out.println("Elige el tipo de operación: + , - , * , / ");
         op = miScanner.next();
         miScanner.close();
       
       switch (op){
        case "+": op = "+"; System.out.println(A + " + " + B + " = " + (A+B)); break;
        case "-": op = "-"; System.out.println(A + " - " + B + " = " + (A-B)); break;
        case "*": op = "*"; System.out.println(A + " * " + B + " = " + (A*B)); break;
        case "/": op = "/"; System.out.println(A + " / " + B + " = " + (A/B)); break;
        default: System.out.println("Un valor no es valido"); break;
       }
       
    }

  }

