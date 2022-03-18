package POO.RPG.Character.Race;

import POO.RPG.Character.Stat.Constitution;
import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Intelligence;
import POO.RPG.Character.Stat.Stat;

public class Elf extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
        stat.increase(3);
        if (stat instanceof Intelligence)
        stat.increase(3);
        if (stat instanceof Constitution)
        stat.decrease(1);
        return 0;
    }
    
}
