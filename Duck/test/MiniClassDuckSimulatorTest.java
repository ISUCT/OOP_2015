/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud_17
 */
public class MiniClassDuckSimulatorTest {

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);

    public MiniClassDuckSimulatorTest() {
    }

    @Before
    public void setUp() {
        System.setOut(ps);
    }

    @After
    public void tearDown() {
        baos.reset();
    }

    /**
     * Test of main method, of class MiniClassDuckSimulator.
     */
    @Test
    public void testMallardQuack() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        assertEquals("Quack\r\n", baos.toString());
    }

    @Test
    public void testRedheadFly() {
        Duck readhead = new RedheadDuck();
        readhead.performFly();
        assertEquals("I'm flying!\r\n", baos.toString());
    }

    @Test
    public void testModelDuck() {
        Duck model = new ModelDuck();
        model.performFly();
        assertEquals("I can't fly\r\n", baos.toString());
        baos.reset();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        assertEquals("I'm flying with a rocket!\r\n", baos.toString());
    }
//    
//        Duck model = new ModelDuck();
//        
//        model.performQuack();
//        assertEquals("I'm flying! Squeak\r\n", baos.toString());
}
