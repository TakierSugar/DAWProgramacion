package POO.RPG.Character.Race;

import POO.RPG.Character.Stat.Stat;

public abstract class Race {
    //Devuelve el modificador de la raza segun el stat
    public abstract int modifier(Stat stat);    

    @Override
    //Devuelve true si son la misma clase
    public boolean equals(Object obj){
        return getClass().getName().equals(obj.getClass().getName());         
    }

    @Override
    //Devuelve el nombre simple de la clase
    public String toString(){
        return this.getClass().getSimpleName();
    }

}
