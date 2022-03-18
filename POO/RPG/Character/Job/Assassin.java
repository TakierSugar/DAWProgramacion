package POO.RPG.Character.Job;

import POO.RPG.Character.Stat.Constitution;
import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Stat;
import POO.RPG.Character.Stat.Strength;

public class Assassin extends Job{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
        stat.increase(3);
        if (stat instanceof Strength)
        stat.increase(1);
        if (stat instanceof Constitution)
        stat.increase(1);
        return stat.getValue();
    }
    
}
