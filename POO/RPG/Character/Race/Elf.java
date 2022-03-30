package POO.RPG.Character.Race;

import POO.RPG.Character.Stat.Constitution;
import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Intelligence;
import POO.RPG.Character.Stat.Stat;

public class Elf extends Race{

    @Override
    public int modifier(Stat stat) {

        int resultado = 0;
        
        if (stat instanceof Dexterity){
            resultado = 3;
        }else if (stat instanceof Intelligence){
            resultado = 3;
        }else if (stat instanceof Constitution){
            resultado = -1;
        }
        
        return resultado;
    }
    
}
