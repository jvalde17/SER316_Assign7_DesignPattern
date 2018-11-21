/**
 * drone is a bee that look for food
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 *
 */
public class Drone extends Bee{
    
    
    public void lookForFood() {
        System.out.println("Found new food!");
    }
    
    @Override
    public String toString() {
        return "Drone";
    }
}
