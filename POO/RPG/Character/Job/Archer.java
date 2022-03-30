package POO.RPG.Character.Job;

import POO.RPG.Character.Stat.Constitution;
import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Intelligence;
import POO.RPG.Character.Stat.Stat;

public class Archer extends Job{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        
        if (stat instanceof Dexterity){
            resultado = 4;
        }else if (stat instanceof Intelligence){
            resultado = 2;
        }else if (stat instanceof Constitution){
            resultado = -1;
        }
        
        return resultado;
    }
    
}
