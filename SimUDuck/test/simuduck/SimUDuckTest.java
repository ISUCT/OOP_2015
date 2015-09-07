/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author h
 */
public class SimUDuckTest {
    
    public SimUDuckTest() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        
    }

    @Test
    public void testSomeMethod() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        Duck mallard = new MallardDuck();
        
        mallard.performQuack();
        assertEquals("Quack!\n", baos.toString());
        baos.reset();
        
        
        System.setOut(ps);
        Duck readhead = new RedheadDuck();
        
        readhead.performFly();
        assertEquals("I'm flying!\n", baos.toString());
        
        Duck model = new ModelDuck();
        System.setOut(ps);
        
        model.performQuack();
        assertEquals("Quack!\n", baos.toString());
    }
    
}
