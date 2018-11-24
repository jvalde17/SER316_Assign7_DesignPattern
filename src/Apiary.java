/**
 * a singleton apiary class implementation.
 * 
 * @author Jess Valdez
 * @since 11-21-2018
 * @version Nov2018
 * 
 */
public class Apiary {
    private static Apiary instance = null; 

    // attributes of an apiary
    public String name; 

    // private constructor restricted to this class itself 
    private Apiary() { 
        this.name = "Cordova Apiary";
    } 

    // static method to create instance of Apiary
    public static Apiary testInstance() 
    { 
        if (instance == null) {
            instance = new Apiary(); 
        }

        return instance; 
    } 
}
