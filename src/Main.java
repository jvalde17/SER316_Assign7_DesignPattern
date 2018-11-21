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
       * Apiary test - A singleton class implementation.  
       */
      // instantiating Apiary as A
        Apiary A = Apiary.testInstance(); 
  
       // instantiating Apiary as B
        Apiary B = Apiary.testInstance();
        
       //update name of Apiary instance A 
        A.name = "Apiary Awesome";
        
        System.out.println("String from A is " + A.name); 
        System.out.println("String from B is " + B.name);
    }
    
    

}
