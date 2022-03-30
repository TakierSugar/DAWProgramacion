package POO.RPG.Character;

import POO.RPG.Character.Job.Job;
import POO.RPG.Character.Race.Race;
import POO.RPG.Character.Stat.Dexterity;
import POO.RPG.Character.Stat.Intelligence;
import POO.RPG.Character.Stat.Constitution;
import POO.RPG.Character.Stat.Strength;

public class Character implements IDamageable{

    private Dexterity dexterity;
    private Strength strength;
    private Intelligence intelligence;
    private Constitution constitution;
    private String name;
    private Race race;
    private Job job;
    private double health;

    @Override
    public double maxHealth() {
        return (constitution.getValue() + race.modifier(constitution) + job.modifier(constitution)) * 25.0;
    }

    @Override
    public double health() {
        return health;
    }

    @Override
    public boolean isDead() {
        return health() <= 0;

    }

    @Override
    public void receivesDamage(double amount) {
        health -= amount;
        if (health < 0){
            health = 0;
        }
    }

    @Override
    public void heals(double amount) {
        health += amount;
        if (health > maxHealth()){
            health = maxHealth();
        }
    }

    public Character(String name, Race race, Job job, int strength, int dexterity, int constitution, int intelligence){
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = new Strength(strength);
        this.dexterity = new Dexterity(dexterity);
        this.constitution = new Constitution(constitution);
        this.intelligence = new Intelligence(intelligence);
        this.health = maxHealth();
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

    public double velocity(){
        return (dexterity.getValue() + race.modifier(dexterity) + job.modifier(dexterity)) * 2.0f;
    }

    public double power(){
        return (strength.getValue() + race.modifier(strength) + job.modifier(strength)) * 2.0f;
    }

    public double magic(){
        return (intelligence.getValue() + race.modifier(intelligence) + job.modifier(intelligence)) * 2.0f;
    }

    public String toString(){
        return "My name is "+ this.name + ". I'm from the race " 
        + this.race + "and my job is " + this.job + ". My Stats are :" + " Strength: " + this.strength
        + " Dexterity: " + this.dexterity + " Constitution: " + this.constitution + " Intelligence: " + 
        this.intelligence + " Velocity: " + this.velocity() + " Power: " + this.power() + " Magic: " + this.magic() +
        " Health: ";
    }

}
