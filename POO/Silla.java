package POO;

import java.awt.Point;

public class Silla {

    private static int numSillas = 0;
    private int patas;
    private String color;
    private boolean respaldo;
    private int comodidad;
    private Point ubicacion;
    private String material;

    //Getters
    public int getComodidad(){
        return comodidad;
    }
    public int getPatas(){
        return patas;
    }
    public String getColor(){
        return color;
    }
    public String getMaterial(){
        return material;
    }
    public Point getUbicacion(){
        return ubicacion;
    }
    public boolean getRespaldo(){
        return respaldo;
    }
    
    //Setters
    public void setComodidad(int nuevaComodidad){
       int valor_comodidad = (int) (Math.random()*10);
       if (valor_comodidad > 10) valor_comodidad = 10;
       valor_comodidad = nuevaComodidad = comodidad;
    }
    public void setPatas(int nuevasPatas){
        int cantidad_patas = (int) (Math.random()*100);
        if(nuevasPatas > 100) cantidad_patas = 100;
        cantidad_patas = nuevasPatas = patas;
    }
    public void setColor(String nuevoColor){
        color = nuevoColor;
    }
    public void setMaterial(String nuevoMaterial){
        material = nuevoMaterial;
    }
    public void setRespaldo(boolean nuevoRespaldo){
        respaldo = nuevoRespaldo;
    }
    public void setUbicacion(Point nuevaUbicacion){
        ubicacion = nuevaUbicacion;
    }

    //Constructor
    public Silla(){
        comodidad;
        patas;
        color;
        material;
        ubicacion;
        respaldo;
    }

}
