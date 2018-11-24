/**
 * queen is a bee that spawns or lays eggs
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 *
 */
public class Queen implements Bee{
    private int numEggs;
    final boolean haveStinger = false;
    final String gender = "female";
    
    public int spawnEgg() {
        this.numEggs++;
        
        System.out.println("New egg is spawned. Egg #: " + numEggs);
        return this.numEggs;
    }
    
    public String toString() {
        return "Queen";
    }

    @Override
    public void eatFood() {
        System.out.println("The Queen eats");
        
    }

    public void dies() {
        System.out.println("ThE Queen dies");
        
    }
}
