package POO.RPG.Character.Race;

import POO.RPG.Character.Stat.Constitution;
import POO.RPG.Character.Stat.Intelligence;
import POO.RPG.Character.Stat.Stat;
import POO.RPG.Character.Stat.Strength;

public class Orc extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
        stat.decrease(3);
        if (stat instanceof Strength)
        stat.increase(5);
        if (stat instanceof Constitution)
        stat.increase(3);
        return 0;
    }
    
}
