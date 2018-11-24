

/**
 * main calls out the different class demonstrating the GOF patterns
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
        Apiary A = Apiary.testInstance(); // instantiating Apiary as A
        Apiary B = Apiary.testInstance(); // instantiating Apiary as B

        //update name of Apiary instance A 
        A.name = "Apiary Awesome";

        System.out.println("Apiary name from A is " + A.name); 
        System.out.println("Apiary name from B is " + B.name);

        /**
         * BUILDER PATTERN
         * Beehive Demo  
         */
        String honeybees = "HoneyBees";
        String killerbees = "KillerBees";
        Beehive<String> myhoneybees = new Beehive<String>(honeybees);
        Beehive<String> mykillerbees = new Beehive<String>(killerbees);
        System.out.println(">>>>>Hive of " + myhoneybees.getBeeType()); 
        myhoneybees.build();
        System.out.println(">>>>>Hive of " + mykillerbees.getBeeType()); 
        mykillerbees.build();

        /**
         * Decorator PATTERN is demonstrated by the classes
         * Drone, Queen and Warrior but used inside Beehive
         */

        /**
         * SIMULATION
         */



    }



}
