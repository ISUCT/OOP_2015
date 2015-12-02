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
public class Duck_OOP_test {
    
    public Duck_OOP_test() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        
    }

    @Test
    public void MallardDuckQuackTest() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        assertEquals("Quack!\n", baos.toString());
        baos.reset();
        
        
    }
   
    @Test
    public void ModelDuckQuackTest(){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        Duck model = new ModelDuck();
        model.performQuack();
        assertEquals("Squeak!\n", baos.toString());
        baos.reset();
    }
    
    @Test
    public void RedheadDuckFlyTest() {
       ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        
        Duck readhead = new RedheadDuck();
        readhead.performFly();
        assertEquals("I'm flying!\n", baos.toString());
        baos.reset();
    }
    
    @Test
    public void ModelDuckTest() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        Duck model = new ModelDuck();
        model.performFly();
        assertEquals("I can't fly\n" , baos.toString());
        baos.reset();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        assertEquals("Im flying with a rocket!\n", baos.toString());
        baos.reset();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
        assertEquals("I'm flying!\n", baos.toString());
        baos.reset();
    
    }
}
