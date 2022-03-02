package POO.CutreClown;

import java.util.ArrayList;
import java.util.Iterator;

public class Media {
    private int id;
    private String nombre;
    private String contenido;
    private MediaType tipo;
    private Usuario usuario;

    public static ArrayList<Media> list = new ArrayList<>();
    private static int idGenerator = 0;

    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public MediaType getTipo() {
        return tipo;
    }

    public void setTipo(MediaType tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Media(String nombre, String contenido, MediaType tipo, Usuario usuario) {
        
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario = usuario;

        if (this.isNameAvailable(nombre)){
            this.id = idGenerator++;
            this.nombre = nombre;
            list.add(this);
        }else{
            this.id = -1;
            this.nombre = "Nombre duplicado: " + nombre;
        }
    }

    private boolean isNameAvailable(String name){
        boolean resultado = true;

        for (Media media : list) {
            if(name.equals(media.getNombre())){
                resultado = false;
                break;
            }
        }

        return resultado;
    }
    public enum MediaType {
        AUDIO, VIDEO, IMAGE
    }

    public static boolean removeOneByName(String nombre){

        boolean resultado = false;

        for (Media mediaItem  : list) {
            if (mediaItem.nombre.equals(nombre)){
                list.remove(mediaItem);
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    public static void removeAllByType(MediaType type){

        Iterator<Media> iterator = list.iterator();

        while(iterator.hasNext()){
            Media elemento = iterator.next();

            if (elemento.tipo.equals(type)){
                iterator.remove();
            }
        }
    }
}

