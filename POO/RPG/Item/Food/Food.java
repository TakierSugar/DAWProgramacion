package POO.RPG.Item.Food;

import POO.RPG.Character.Character;

public abstract class Food implements IConsumable{
    private int power;

    public Food(int power){
        this.power = power;
    }

    public void consumedBy(Character character){
        character.heals(power);
    }
}