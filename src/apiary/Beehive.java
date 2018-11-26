package apiary;

import java.util.Random;

/**
 * a beehive implementation class in Builder pattern.
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 * 
 */
public class Beehive<T> implements Visitable {
    private int room;
    private int population;
    private Queen queen = new Queen();
    private Warrior warrior = new Warrior();
    private Drone drone = new Drone();
    private T beeType;
    private boolean beehiveCollapse = false;

    /**
     * VISITOR PATTERN method that accepts the visitor.
     * 
     * @param visitor is the beehive visitor 
     */
    @Override
    public void accept(Visitor visitor) {
        // ((Visitor) visitor).visit(this);
        System.out.println("Visitor accepted!");
    }
    
    public int getPopulation() {
        return population;
    }
    
    /**
     * method that sets the type of Bees.
     * @param type is a String describing type of bees such honeybee or other.
     */
    public Beehive(T type) {
        this.beeType = type;  
    }

    public T getBeeType() { 
        return this.beeType; 
    } 

    /*
     * Method performing a bee spawn
     */
    public Beehive<T> spawn() {
        this.population += queen.spawnEgg();
        return this;
    }

    /**
     * Method performing a bee reproduction.
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
    
    public Beehive<T> warriorDies() {
        warrior.dies();

        population -= 1;
        return this;
    }
    
    public Beehive<T> droneDies() {
        drone.dies();

        population -= 1;
        return this;
    }
    
    public Beehive<T> queenDies() {
        queen.dies();

        population -= 1;
        beehiveCollapse = true;
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

    public Beehive<T> simApp(boolean test) throws InterruptedException {
        Beehive<T> hive = new Beehive<T>(beeType);
        int random_limit = 1000;
        if (test) {
            random_limit = 100;
        }
        
        while (true) {
            Random random = new Random();
            int randomInt = random.nextInt(random_limit);
            switch (randomInt) {
            case 10:
                hive.spawn();
                System.out.println("Beehive population " + hive.population);
                break;
            case 23: hive.gatherNectar(); break;
            case 43: hive.addRoom(); break;
            case 20: hive.gatherPollen(); break;
            case 34: hive.mates(); break;
            case 59: hive.fightsEnemies(); break;
            case 88: hive.droneDies(); break;
            case 89: hive.warriorDies(); break;

            }

            if ((hive.population > 10000) || (hive.beehiveCollapse)) {
                break;
            }
            
            //code block used by BeeTest();
            if (test) {
               if (randomInt == 100) { //this code simply add randomness in order to increase coverage.
                   break;
               }
            }
            if (!test) {
                Thread.sleep(5);
            }
        }
        
        return hive;
    }

    
}
