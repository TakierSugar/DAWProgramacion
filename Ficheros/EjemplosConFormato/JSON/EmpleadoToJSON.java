package Ficheros.EjemplosConFormato.JSON;

import com.google.gson.Gson;

import Ficheros.EjemplosConFormato.Empleado;

public class EmpleadoToJSON {

    public static void main(String[] args) {
        final Empleado empleado =new Empleado(46, "Miguel", 10, 1100, 00L);
        final Gson gson = new Gson();
        final String representacionJSON = gson.toJson(empleado);
        System.out.println(representacionJSON);
    } 
    
}
