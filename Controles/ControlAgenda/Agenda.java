package Controles.ControlAgenda;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Agenda {
    public static void pedirUsuarios() throws IOException {
        Scanner lector = new Scanner(System.in);

        System.out.println("Registrando un nuevo usuario");
        Usuario usuario = new Usuario("", "", "", 0);

        System.out.println("Introduce el nombre del usuario:");
        usuario.setNombre(lector.nextLine());

        System.out.println("Introduce los apellidos del usuario:");
        usuario.setApellidos(lector.nextLine());

        System.out.println("Introduce el email del usuario:");
        usuario.setEmail(lector.nextLine());

        System.out.println("Introduce el telefono del usuario:");
        usuario.setTelefono(lector.nextInt());

        lector.close();
        FileWriter fichero = null;
        PrintWriter pw = null;
            try
            {
                fichero = new FileWriter("DAWProgramacion-2/Controles/ControlAgenda/Agenda.dat", true);
                pw = new PrintWriter(fichero);
                pw.println(usuario.getNombre() + "  " + usuario.getApellidos() + "  " + usuario.getEmail() + "  " + usuario.getTelefono());
                fichero.close();
                fichero = new FileWriter("DAWProgramacion-2/Controles/ControlAgenda/AgendaObjetos.dat");
                pw = new PrintWriter(fichero);
                pw.println(usuario);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               try {
                    if (null != fichero)
                        fichero.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
               }
            }
        }

    public void imprimirListadoTexto() {
        
    }

    public void imprimirListadoObjetos() {
        
    }
}