package POO.RPG.Character.Job;

import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Intelligence;
import POO.RPG.Character.Stat.Stat;

public class Mage extends Job{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        
        if (stat instanceof Dexterity){
            resultado = 1;
        }else if (stat instanceof Intelligence){
            resultado = 4;
        }
        
        return resultado;
    }
}
