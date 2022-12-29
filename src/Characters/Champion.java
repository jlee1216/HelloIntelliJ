package Characters;

public class Champion extends Player {
    public int mana = 0;
    public int energy = 0;

    public void FireCylinder() {
        System.out.println("Firing Cylinder");
    }

    public int Attack(int attackModifier) {
        return attack + attackModifier;
    }

}
