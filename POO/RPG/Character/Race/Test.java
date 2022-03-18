package POO.RPG.Character.Race;

import POO.RPG.Character.Stat.Stat;


public class Test {
    private static Stat Strength;

    public static void main(String[] args) {
        Human Paco = new Human();
        Paco.modifier(Strength);
        System.out.println(Paco.modifier(Strength));
    }
}
