
/**
 * main calls out the different class demonstrating the Go4 patterns.
 * 
 * @author Jess Valdez
 * @since 11-15-2018
 * @version 0.1
 *
 */
public class Main {

    /**
     * main starts the simulated beehive.
     * 
     * @param args are not used.
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {

        //SINGLETON
        //Apiary implementation.   
        Apiary a = Apiary.testInstance(); // instantiating Apiary as a
        Apiary b = Apiary.testInstance(); // instantiating Apiary as b

        //update name of Apiary instance a 
        a.name = "Apiary Awesome";

        System.out.println("Apiary name from a is " + a.name); 
        System.out.println("Apiary name from b is " + b.name);

        //BUILDER PATTERN
        //Beehive Demo  
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
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("> Simulation starts.... "); 
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
        myhoneybees.simApp();


    }



}
