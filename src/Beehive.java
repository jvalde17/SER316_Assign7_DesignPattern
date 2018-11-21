/**
 * a beehive implementation class
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 * 
 */
public class Beehive<T> {
    private int room;
    private Queen queen = new Queen();
    private T type;
    private int numWorkerBees;
    //private int numWarriors;
    //private int numDrones;
    
/**
 * method that sets the type of Bees
 * @param type
 * @return 
 * @return
 */

    
    public Beehive<T> spawn() {
        numWorkerBees = queen.spawnEgg();
        return this;
    }
    
    public Beehive<T> addRoom() {
        this.room++;
        
        System.out.println("Created a new room # " + this.room);
        return this;
    }
    
 
    public Beehive<T> build() {
        
        Beehive<T> hive = new Beehive<T>();
        hive.spawn();
        hive.addRoom();
        hive.spawn();
        hive.addRoom();
        hive.spawn();
        hive.addRoom();
        return hive;
    }
}
