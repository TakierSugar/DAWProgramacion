package POO.RPG.Character.Job;

import POO.RPG.Character.Stat.Constitution;
import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Stat;
import POO.RPG.Character.Stat.Strength;

public class Tank extends Job{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        
        if (stat instanceof Dexterity){
            resultado = -1;
        }else if (stat instanceof Strength){
            resultado = 3;
        }else if (stat instanceof Constitution){
            resultado = 3;
        }
        
        return resultado;
    }
    
}
