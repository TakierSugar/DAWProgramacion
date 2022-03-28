package POO.RPG.Item.Food;

import POO.RPG.Item.IConsumible;

public class Food implements IConsumible {

    @Override
    public void consumedBy(Character character) {
        character.heals(power)
    }
    public double power;
    
}
