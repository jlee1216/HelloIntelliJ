import Characters.Champion;
import Characters.Minion;
import Characters.Player;

public class Main {
    public void Run() {


        int number = 12345;

        //Instantiate (bring to life/create/put in memory) an object
        //Player p = new Player();
        //p.Walk();
        //p.health = 10;
        //p.armor = 50;

        Champion jlee = new Champion();
        jlee.armor = 200;
        jlee.attack = 50;
        jlee.FireCylinder();

        Champion darksol = new Champion();
        int startingDamage = darksol.Attack(15);
        darksol.attack = 40;
        darksol.armor = 100;
        //jlee.health = jlee.health - darksol.Attack(15);
        int jleeHealth = jlee.GetHealth();
        int newJleeHealth = jleeHealth - darksol.Attack(15);

        jlee.SetHealth(newJleeHealth);

        //Player() looks like a function because it has parentheses, called constructor
        Champion champ = new Champion();
        champ.armor = 300;

        //Type identifier/name = new constructor/type()
        Minion min = new Minion();

        //Inheritence

    }
}
