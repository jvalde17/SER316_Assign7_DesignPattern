/**
 * Implementation of a drone bee.
 * Drone bees exist to mate with the queen.
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 *
 */
public class Drone implements Bee {
    private final String gender = "male";
    private final boolean haveStinger = false;
    
    public void mateWithTheQueen() {
        System.out.println("Drone bee mates with the queen!");
    }
    
    public String getGender() {
        return gender;
    }
    
    public boolean haveStinger() {
        return haveStinger;
    }
    
    @Override
    public void eatFood() {
        System.out.println("Drone bee eats");
        
    }

    public void dies() {
        System.out.println("A drone dies");
        
    }
}
