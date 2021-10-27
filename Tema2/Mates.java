public class Mates {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            Integer.parseInt(args[i]);
        
        System.out.println(suma(x, y));
        System.out.println(resta(x, y));
        System.out.println(multiclicacion(x, y));
        System.out.println(division(x, y));
    }

    public static double suma(double x, double y){
        return x + y;
    }

    public static double resta(double x, double y){
        return x - y;
    }

    public static double multiclicacion(double x, double y){
        return x * y;
    }

    public static double division(double x, double y){
        return x / y;
    }
    
}
