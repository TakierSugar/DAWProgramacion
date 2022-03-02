package POO.CutreClown;

import java.util.ArrayList;

public class Usuario implements ParserXML{
    private int id;
    private String email;
    private String password;
    public static ArrayList<Usuario> list = new ArrayList<>();
    private static int idGenerator = 0;

    
    public Usuario(String email, String password) {
        
        this.password = password;

        if (this.isEmailAvailable(email)){
            this.id = idGenerator++;
            this.email = email;
            list.add(this);
        }else{
            this.id = -1;
            this.email = "Correo duplicado: " + email;
        }
    }

    private boolean isEmailAvailable(String email){
        boolean resultado = true;

        for (Usuario usuario : list) {
            if(email.equals(usuario.getEmail())){
                resultado = false;
                break;
            }
        }

        return resultado;
    }

    public int getId() {
        return id;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String generateXML() {
        String xml = "<usuario>";
        xml += "<id>" + id + "</id>";
        xml += "<email>" + email + "</email>";
        xml += "<password>" + password + "</password>";
        xml += "</usuario>";
        return null; 
    }
}