package Characters;

import java.io.Console;

public abstract class Player {
    private int health = 100;
    public int attack = 0;
    public int armor = 0;

    //functions can have inputs and outputs
    //functions can have no inputs and no outputs
    //functions that do not have outputs are usually called methods
    //Accessor ReturnType Indentifier/Name (ParameterType ParameterName...............  )

    public int GetHealth() {
        return health;
    }

    public void SetHealth(int hp) {
        health = hp;
    }

    public void Walk() {
        System.out.println("Player Walks");
    }

    public int TakeStep() {
        System.out.println("Player Walks");
        return 10;
    }

}
