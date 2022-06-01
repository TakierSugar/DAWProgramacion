package Ficheros.EjemplosConFormato.JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Ficheros.EjemplosConFormato.Empleado;

public class EmpleadoToPrettyPrintingJSON {
    public static void main(String[] args) {
        final Empleado empleado = new Empleado(46,"Miguel",10,1100,00");
        final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        final String prettyPrinting = PrettyGson.toJson(empleado);
        System.out.println(prettyPrinting);
    }
}
