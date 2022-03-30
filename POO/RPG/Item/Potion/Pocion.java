package POO.RPG.Item.Potion;

import POO.RPG.Character.Character;
import POO.RPG.Item.Food.IConsumable;

public abstract class Pocion implements IConsumable{
    private int power;

    public Pocion(int power){
        this.power = power;
    }

    public void consumedBy(Character character){
        character.heals(power);
    }
}