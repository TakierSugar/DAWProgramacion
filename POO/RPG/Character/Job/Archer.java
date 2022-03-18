package POO.RPG.Character.Job;

import POO.RPG.Character.Stat.Constitution;
import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Intelligence;
import POO.RPG.Character.Stat.Stat;

public class Archer extends Job{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
        stat.increase(4);
        if (stat instanceof Intelligence)
        stat.increase(2);
        if (stat instanceof Constitution)
        stat.decrease(1);
        return stat.getValue();
    }
    
}
