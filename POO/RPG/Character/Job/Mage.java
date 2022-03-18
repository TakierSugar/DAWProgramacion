package POO.RPG.Character.Job;

import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Intelligence;
import POO.RPG.Character.Stat.Stat;

public class Mage extends Job{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
        stat.increase(1);
        if (stat instanceof Intelligence)
        stat.increase(4);
        return stat.getValue();
    }
    
}
