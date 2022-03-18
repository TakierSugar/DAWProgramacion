package POO.RPG.Character.Race;

import POO.RPG.Character.Stat.Constitution;
import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Intelligence;
import POO.RPG.Character.Stat.Stat;
import POO.RPG.Character.Stat.Strength;

public class Gnome extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
        stat.increase(2);
        if (stat instanceof Strength)
        stat.decrease(2);
        if (stat instanceof Constitution)
        stat.decrease(2);
        if (stat instanceof Dexterity)
        stat.increase(7);
        return 0;
    }
}
