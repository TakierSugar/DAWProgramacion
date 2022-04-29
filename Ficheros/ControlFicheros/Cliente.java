package Ficheros.ControlFicheros;
    
public class Cliente extends Persona{
    private int id;
    private String email;
    private String nif = getNif();
    private String nombre = getNombre();
    private String apellidos = getApellidos(); 

    public String resultado = "---------------------\nid           " + id +"\nnif          " + nif + "\nnombre       " + nombre + "\napellidos    " + apellidos + "\nemail        " + email + "\n---------------------";
    public String toString(){
        return resultado;
    }
    public String infoCLiente = id + "," +nif + "," + nombre + "," + apellidos + "," + email + "\n";

    public Cliente(int id, String email, String nif, String nombre, String apellidos) {
        this.id = id;
        this.email = email;
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
}
    


