package POO.RPG.Character.Race;

import POO.RPG.Character.Stat.Constitution;
import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Stat;
import POO.RPG.Character.Stat.Strength;

public class Human extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
        stat.increase(1);
        if (stat instanceof Strength)
        stat.increase(2);
        if (stat instanceof Constitution)
        stat.increase(2);
        return 0;
    }
    
    
}
