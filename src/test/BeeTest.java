package test;
import static org.junit.Assert.*;

import org.junit.Test;

import apiary.Apiary;
import apiary.ApiaryCaretaker;
import apiary.Beehive;
import apiary.Drone;
import apiary.Queen;
import apiary.Warrior;

public class BeeTest {

    @Test
    public void testSingleton() {
        Apiary a = Apiary.testInstance(); // instantiating Apiary as a
        Apiary b = Apiary.testInstance(); // instantiating Apiary as b

        //update name of Apiary instance a 
        a.name = "Apiary Awesome";
        System.out.println("Apiary name from a is " + a.name); 
        System.out.println("Apiary name from a is " + b.name);
        assertTrue(b.name.equals(a.name));
    }

    @Test
    public void testQueen() {
        Queen myqueen = new Queen();
        assertTrue(myqueen.gender.equals("female"));
        myqueen.spawnEgg();
        myqueen.spawnEgg();
        assertTrue(myqueen.getNumEggs() > 2);
        myqueen.eatFood();
        myqueen.dies();
    }

    @Test
    public void testWarrior() {
        Warrior warrior = new Warrior();
        assertTrue (warrior.gender == "female");
        assertTrue (warrior.haveStinger);
        warrior.buildHive();
        warrior.cleanHive();
        warrior.collectNectar();
        warrior.collectPollen();
        warrior.eatFood();
        warrior.huntEnemies();
        warrior.goBackToHive();
        warrior.cleanQueen();
        warrior.dies();
    }

    @Test
    public void testDrone() {
        Drone drone = new Drone();
        assertTrue (drone.gender == "male");
        assertFalse (drone.haveStinger);
        drone.eatFood();
        drone.mateWithTheQueen();
        drone.dies();
    }

    @Test
    public void testBeehive() throws InterruptedException {
        String honeybees = "HoneyBees";
        Beehive<String> myhoneybees = new Beehive<String>(honeybees);
        System.out.println(">>>>>Hive of " + myhoneybees.getBeeType()); 
        myhoneybees.droneDies();
        myhoneybees.warriorDies();
        myhoneybees.addRoom();
        myhoneybees.build();
        myhoneybees.fightsEnemies();
        myhoneybees.gatherNectar();
        myhoneybees.gatherPollen();
        myhoneybees.accept(null);
        myhoneybees.build();
        myhoneybees.simApp(true);
        myhoneybees.queenDies();

        assertTrue (myhoneybees.getBeeType() == "HoneyBees");
        
        ApiaryCaretaker caretaker = new ApiaryCaretaker();
        caretaker.visit(myhoneybees);

    }
}
