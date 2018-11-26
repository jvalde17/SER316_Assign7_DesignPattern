package apiary;

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

        //BUILDER PATTERN + DECORATOR
        //Beehive uses BUILDER PATTERN, 
        //Classes Drone, Queen and Warrior are DECORATOR for class Bee
        //Beehive Demo  
        String honeybees = "HoneyBees";
        String californiabees = "CaliforniaBees";
        Beehive<String> myhoneybees = new Beehive<String>(honeybees);
        Beehive<String> mycaliforniabees = new Beehive<String>(californiabees);

        System.out.println(">>>>>Hive of " + myhoneybees.getBeeType()); 
        myhoneybees.build();

        System.out.println(">>>>>Hive of " + mycaliforniabees.getBeeType()); 
        Beehive<String> r1_californiabees = mycaliforniabees.build();

        //VISITOR PATTERN is demonstrated through ApiaryCareTaker 
        //by visiting/checking hive status.
        ApiaryCaretaker caretaker = new ApiaryCaretaker();
        caretaker.visit(r1_californiabees);


        /**
         * SIMULATION
         */
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("> Simulation starts.... "); 
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //myhoneybees.simApp(false);


    }



}
