package POO.Club;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Club {
    // Define any necessary fields here ...
    private static ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club() {
        // Initialise any fields here ...
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * 
     * @param member The member object to be added.
     */
    public void join(Membership member) {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }

    /**
     * Determinar el número de miembros que se han unido en 
     * el mes indicado
     * @param month El mes que nos interesa
     * @return El número de miembros que se han unido
     *     ese mes
     */
    public int joinedInMonth(int month){
        int contador = 0;
        if (month > 12 || month < 1){
            System.out.println("El valor esta fuera del rango");
            return contador;
        }
        for (int i = 0; i < members.size(); i++) {
            if (month == members.get(i).getMonth()){
                contador++;
            }
        }
        return contador;
    }

    public int purgue(int month){
        int eliminados = 0;

        Iterator<Membership> it = members.iterator();

        while (it.hasNext()) {
            Membership item = it.next();
            
            if (item.getMonth() == month){
                it.remove();
                eliminados++;
            }
        }
        return eliminados;
    }
}