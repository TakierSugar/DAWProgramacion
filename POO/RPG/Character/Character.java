package POO.RPG.Character;

import POO.RPG.Character.Job.Job;
import POO.RPG.Character.Race.Race;
import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Intelligence;
import POO.RPG.Character.Stat.Stat;
import POO.RPG.Character.Stat.Strength;

public class Character {

    private static final Stat Dexterity = null;
    private static final Stat Strength = null;
    private static final Stat Intelligence = null;
    private static final Stat Constitution = null;
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
        Race Human;
        Job Warrior;
        Character Paco = new Character("Paco", Human, Warrior);
        Paco.toString();
    }

}
