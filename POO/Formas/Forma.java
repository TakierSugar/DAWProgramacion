package POO.Formas;

public class Forma {
    
    protected String color;
    protected Point centro;
    protected String nombre;

    public Forma(String color, int x, int y, String nombre) {
        this.color = color;
        this.centro = new Point(x,y);
        this.nombre = nombre;
    }

    public void imprimir(){
        System.out.println("Color: " + color);
        System.out.printf("Centro: (%f, %f)\n", centro.x, centro.y);
        System.out.println("Nombre: " + nombre);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mover(int x, int y){
        this.centro = new Point(x,y);
    }

}
