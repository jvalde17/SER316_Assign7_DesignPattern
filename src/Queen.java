/**
 * queen is a bee that spawns or lays eggs
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 *
 */
public class Queen extends Bee{
    private int numEggs;
    
    /**
     * 
     * @return boolean
     */
    public boolean WarriorOrDrone(){
        return Math.random() < 0.5;
    }
    
    public int spawnEgg() {
        this.numEggs++;
        
        System.out.println("New egg is spawned. Egg #: " + numEggs);
        return this.numEggs;
    }
    
    public String toString() {
        return "Queen";
    }
}
