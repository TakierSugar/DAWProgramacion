package POO.Formas;

public class Rectangulo extends Forma{

    public Rectangulo(String color, int x, int y, String nombre, double lmenor, double lmayor) {
        super(color, x, y, nombre);
        this.lmenor = lmenor;
        this.lmayor = lmayor;
        double auxiliar;
        if (lmenor > lmayor){
            auxiliar = lmayor;
            lmayor = lmenor;
            lmenor = auxiliar;}
            super.mover(x, y);
    }

    private double lmenor;
    private double lmayor;

    public void imprimir(){
        super.imprimir();
        System.out.printf("Lados: (%f, %f)\n",lmenor,lmayor);
    }

    public void calcularArea(){
        double area = lmayor*lmenor;
        System.out.printf("%f * %f = %f\n",lmenor,lmayor,area);
    }

    public void calcularPerimetro(){
        double perimetro = 2 * lmenor + 2 * lmayor;
        System.out.printf("2 * %f + 2 * %f = %f\n",lmenor,lmayor,perimetro);
    }
    public void escala(double escala){
        this.lmayor = lmayor*escala;
    }
}
