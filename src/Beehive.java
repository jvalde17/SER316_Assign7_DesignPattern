/**
 * a beehive implementation class in Builder pattern
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 * 
 */
public class Beehive<T> {
    private int room;
    private Queen queen = new Queen();
    private Warrior warrior = new Warrior();
    private Drone drone = new Drone();
    private T beeType;
    
/**
 * method that sets the type of Bees
 * @param type is a String describing type of bees such honeybee or africanbee.
 */
    Beehive (T type) {
        {  this.beeType = type;  } 
    }
    
    public T getBeeType()  { return this.beeType; } 
    
    /*
     * Method performing a bee spawn
     */
    public Beehive<T> spawn() {
        queen.spawnEgg();
        return this;
    }
    
    /*
     * Method performing a bee reproduction
     */
    public Beehive<T> mates() {
        drone.mateWithTheQueen();
        return this;
    }
    
    /*
     * Method performing the gathering of food and bring 
     * it back to the hive
     */
    public Beehive<T> gatherFood() {
        warrior.collectNectar();
        warrior.collectPollen();
        warrior.goBackToHive();
        return this;
    }
    
    /*
     * Method performing a construction of a room.
     */
    public Beehive<T> addRoom() {
        this.room++;
        warrior.buildHive();
        System.out.println("Created a new room # " + this.room);
        return this;
    }
    
 /**
  * Build method executes the methods to build a beehive.
  * 
  * @return the object of the hive that was built.
  */
    public Beehive<T> build() {
        Beehive<T> hive = new Beehive<T>(beeType);
        hive.mates();
        hive.spawn();
        hive.gatherFood();
        hive.addRoom();
        hive.spawn();
        hive.addRoom();
        hive.spawn();
        hive.addRoom();
        return hive;
    }
}
