package POO.RPG.Character.Job;

import POO.RPG.Character.Stat.Constitution;
import POO.RPG.Character.Stat.Stat;
import POO.RPG.Character.Stat.Strength;

public class Warrior extends Job{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength)
        stat.increase(3);
        if (stat instanceof Constitution)
        stat.increase(2);
        return stat.getValue();
    }
    
}
