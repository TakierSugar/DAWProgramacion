package POO.RPG.Character.Race;

import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Stat;
import POO.RPG.Character.Stat.Strength;

public class Human extends Race{

    @Override
    public int modifier(Stat stat) {
        return 0;
    }
    public Dexterity bonificacionD(){
        Dexterity dexterity;
        dexterity = 1;
        return dexterity;
    }
    
}
