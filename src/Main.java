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
       * Singleton Implementation.  
       */
      // instantiating Singleton class as A
        Singleton A = Singleton.testInstance(); 
  
       // instantiating Singleton class as B
        Singleton B = Singleton.testInstance();
        
       //update a variable of instance A 
        A.age = 35;
        
        System.out.println("String from A is " + A.str); 
        System.out.println("String from B is " + B.str);
    }
    
    

}
