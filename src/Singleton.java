/**
 * Singleton class 
 * 
 * @author Jess Valdez
 *
 */
public class Singleton {
 // use of static variable of type Singleton 
    private static Singleton instance = null; 
  
    // variable of type String 
    public String str; 
    public int age;

    // private constructor restricted to this class itself 
    private Singleton() { 
        age = 40;
        str = "My name is Sir Charles and my age is " + age; 
        
    } 
  
    // static method to create instance of Singleton class 
    public static Singleton testInstance() 
    { 
        if (instance == null) {
            instance = new Singleton(); 
        }
  
        return instance; 
    } 
}
