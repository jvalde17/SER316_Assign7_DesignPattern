/**
 * warrior is a bee that hunts
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 *
 */
public class Warrior extends Bee{

    public void huntEnemies() {
        System.out.println("Killed an enemy");
    }
    
    @Override
public String toString() {
    return "Warrior";
}
}
