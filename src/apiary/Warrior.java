package apiary;
/**
 * warrior bees is same as worker bees, they do everything else the Drone bees do not
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 *
 */
public class Warrior implements Bee {
    public final boolean haveStinger = true;
    public final String gender = "female";
    
    public void huntEnemies() {
        System.out.println("A warrior stung an enemy");
    }
    
    public void collectPollen() {
        System.out.println("Worker bee gathered a pollen.");
    }
    
    public void collectNectar() {
        System.out.println("Worker bee gathered a nectar.");
    }
    
    public void cleanQueen() {
        System.out.println("Worker bees are cleaning the queen.");
    }
    
    public void cleanHive() {
        System.out.println("Worker bees are cleaning the hive.");
    }
    
    public void buildHive() {
        System.out.println("Worker bees adds a room in the hive.");
    }

    @Override
    public void eatFood() {
        System.out.println("Warrior bee eats");
        
    }

    public void dies() {
        System.out.println("Warrior bee dies");
        
    }

    public void goBackToHive() {
        System.out.println("Warrior bee go back to hive");
        
    }
}
