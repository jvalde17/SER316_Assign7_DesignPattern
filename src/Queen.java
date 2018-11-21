/**
 * queen is a bee that spawns or lays eggs
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 *
 */
public class Queen {
    private int numEggs;
    
    public void spawnEgg() {
        this.numEggs++;
        System.out.println("New egg is spawn. Egg #: " + numEggs);
    }
}
