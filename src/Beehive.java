/**
 * a beehive implementation class
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 * 
 */
public class Beehive {
    private int room;
    private String name;
    
    public Beehive withName(String name) {
        this.name = name;
        
        return this;
    }
    
    public Beehive build() {
        
        Beehive hive = new Beehive();
        hive.name = this.name;
        
        return hive;
    }
}
