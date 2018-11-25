import java.util.Random;

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
    private int population;
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

    public T getBeeType() { 
        return this.beeType; 
    } 

    /*
     * Method performing a bee spawn
     */
    public Beehive<T> spawn() {
        population += queen.spawnEgg();
        return this;
    }

    /**
     * Method performing a bee reproduction
     */
    public Beehive<T> mates() {
        drone.mateWithTheQueen();
        return this;
    }

    /**
     * Method performing the gathering of nectar and bring 
     * it back to the hive.
     */
    public Beehive<T> gatherNectar() {
        warrior.collectNectar();
        warrior.goBackToHive();
        return this;
    }

    public Beehive<T> fightsEnemies() {
        warrior.huntEnemies();
        return this;
    }
    
    public Beehive<T> Dies() {
        Random random = new Random();
        boolean res = random.nextBoolean();
        if (res) {
            drone.dies();
        } else {
            warrior.dies();
        }
        population -= 1;
        return this;
    }
    
    /**
     * Method performing the gathering of pollen and bring 
     * it back to the hive.
     */
    public Beehive<T> gatherPollen() {
        warrior.collectPollen();
        warrior.goBackToHive();
        return this;
    }
    
    /**
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
        hive.gatherNectar();
        hive.gatherPollen();
        hive.addRoom();
        hive.spawn();
        hive.addRoom();
        hive.spawn();
        hive.addRoom();
        return hive;
    }

    public Beehive<T> simApp() throws InterruptedException {
        Beehive<T> hive = new Beehive<T>(beeType);
        hive.mates();
        hive.spawn();
        hive.gatherNectar();
        hive.addRoom();

        while (true) {
            Random random = new Random();
            int randomInt = random.nextInt(100);
            if (randomInt == 10) {
                hive.spawn();
                System.out.println("Population " + hive.population);
            }
            if (randomInt == 23) {
                hive.gatherNectar();
            }
            if (randomInt == 43) {
                hive.addRoom();
            }
            if (randomInt == 20) {
                hive.gatherPollen();
            }
            if (randomInt == 34) {
                hive.mates();
            }
            if (randomInt == 59) {
                hive.fightsEnemies();
            }
            if (randomInt == 99) {
                hive.fightsEnemies();
            }
            if (randomInt == 88) {
                hive.Dies();
            }
            if (hive.population > 10000) {
                break;
            }
            
            Thread.sleep(5);
        }
        
        return hive;
    }
}
