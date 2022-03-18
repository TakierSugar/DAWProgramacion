package POO.RPG.Character.Race;

import POO.RPG.Character.Stat.Constitution;
import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Intelligence;
import POO.RPG.Character.Stat.Stat;
import POO.RPG.Character.Stat.Strength;

public class Elemental extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
        stat.increase(5);
        if (stat instanceof Strength)
        stat.decrease(1);
        if (stat instanceof Constitution)
        stat.decrease(1);
        if (stat instanceof Dexterity)
        stat.increase(2);
        return 0;
    }
    
}
