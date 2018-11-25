import static org.junit.Assert.*;

import org.junit.Test;

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
        assertTrue(myqueen.getNumEggs() == 2);
        
    }
}
