package POO.RPG.Character;

import POO.RPG.Character.Job.Job;
import POO.RPG.Character.Job.Warrior;
import POO.RPG.Character.Race.Human;
import POO.RPG.Character.Race.Race;
import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Intelligence;
import POO.RPG.Character.Stat.Stat;
import POO.RPG.Character.Stat.Strength;

public class Character implements IDamageable{
    @Override
    public double maxHealth() {
        double vidaMaxima = (5 + race.modifier(Constitution) + job.modifier(Constitution))*25; 
        return vidaMaxima;
    }

    @Override
    public double health() {
        double vida = maxHealth();
        return vida;
    }

    @Override
    public boolean isDead() {
        if (health() >= 0) 
        return true;
        else 
        return false;

    }

    @Override
    public void receivesDamage(double amount) {
        System.out.println(this.name +" received " +
         amount + " damage. Health: " + health() + "/" +maxHealth());
    }

    @Override
    public void heals(double amount) {
        System.out.println(this.name +" healed " +
        amount + " life. Health: " + health() + "/" +maxHealth());
    }

    private static Stat Dexterity;
    private static Stat Strength;
    private static Stat Intelligence;
    private static Stat Constitution;
    String name;
    Race race;
    Job job;

    public Character(String name, Race race, Job job) {
        this.name = name;
        this.race = race;
        this.job = job;
    }
    
    public String getName(){
        return name;
    }
    public Race getRace(){
        return race;
    }
    public Job getJob(){
        return job;
    }

    public int dexterity(){
        int dexterity = race.modifier(Dexterity) + job.modifier(Dexterity);
        return dexterity;
    }
    public int strength(){
        int strength = race.modifier(Strength) + job.modifier(Strength);
        return strength;
    }
    public int constitution(){
        int constitution = race.modifier(Constitution) + job.modifier(Constitution);
        return constitution;
    }
    public int intelligence(){
        int intelligence = race.modifier(Intelligence) + job.modifier(Intelligence);
        return intelligence;
    }

    public double velocity(){
        double velocity = (5 + race.modifier(Dexterity) + job.modifier(Dexterity))*2; 
        return velocity;
    }
    public double power(){
        double power = (5 + race.modifier(Strength) + job.modifier(Strength))*2; 
        return power;
    }
    public double magic(){
        double magic = (5 + race.modifier(Intelligence) + job.modifier(Intelligence))*2; 
        return magic;
    }

    public String toString(){
        return "My name is "+ this.name + ". I'm from the race " 
        + this.race + "and my job is " + this.job + ". My Stats are :" + " Strength: " + this.strength()
        + " Dexterity: " + this.dexterity() + " Constitution: " + this.constitution() + " Intelligence: " + 
        this.intelligence() + " Velocity: " + this.velocity() + " Power: " + this.power() + " Magic: " + this.magic() +
        " Health: ";
    }

    public static void main(String[] args) {
        Race humano = new Human();
        Job guerrero = new Warrior();
        final Character Paco = new Character("Paco", humano, guerrero);
        Paco.dexterity();
        Paco.toString();
    }

}
