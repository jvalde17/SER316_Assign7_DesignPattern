package apiary;

import java.util.Random;

/**
 * queen is a bee that spawns or lays eggs
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 *
 */
public class Queen implements Bee {
    private int totalEggs;
    final boolean haveStinger = false;
    public final String gender = "female";
    
    /**
     * Method that spawns eggs. 
     * It is a random number with a given maximum.
     * 
     * @return number of eggs that was spawn.
     */
    public int spawnEgg() {
        Random randomEggs = new Random();
        int eggs = randomEggs.nextInt(300);
        totalEggs += eggs;
        
        System.out.println("The queen spawns " + eggs + " eggs.");
        return this.totalEggs;
    }
    

    @Override
    public void eatFood() {
        System.out.println("The Queen eats");
    }

    public void dies() {
        System.out.println("The Queen dies");
    }
    
    public int getNumEggs() {
        return totalEggs;
    }
}
