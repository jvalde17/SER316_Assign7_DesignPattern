

/**
 * 
 * @author Jess Valdez
 * @since 11-15-2018
 * @version 0.1
 *
 */
public class Main {

    public static void main(String[] args) {
     System.out.println("Welcome to my GOP patterns application.");

      /**
       * SINGLETON
       * Apiary implementation.  
       */
      // instantiating Apiary as A
        Apiary A = Apiary.testInstance(); 
  
       // instantiating Apiary as B
        Apiary B = Apiary.testInstance();
        
       //update name of Apiary instance A 
        A.name = "Apiary Awesome";
        
        System.out.println("Apiary name from A is " + A.name); 
        System.out.println("Apiary name from B is " + B.name);
        
        /**
         * BUILDER PATTERN
         * Beehive test  
         */
        Beehive<Drone> mydronehive = new Beehive<Drone>();
        mydronehive.build();
    }
    
    

}
