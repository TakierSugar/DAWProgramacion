package POO.RPG.Character.Stat;

public abstract class Stat{

    //Atributo
    int value;

    //Constructor
    public Stat(int value) {
        this.value = value;
    }

    //Devulelve el valor actual de la caracteristica
    public int getValue() {
        return value;
    }
    //Aumenta el valor de la caracteristica en 1
    public void increase(int number){
        value = value + number;
    }
    //Decrementa el valor de la caracteristica en 1
    public void decrease(int number){
        value = value - number;
    }

    @Override
    //Devuelve el nombre simple de la clase
    public String toString(){
        return this.getClass().getSimpleName() + ": " + getValue();
    }


    
}
