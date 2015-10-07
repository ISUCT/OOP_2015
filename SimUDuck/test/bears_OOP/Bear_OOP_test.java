/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bears_OOP;

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
public class Bear_OOP_test {
    
    public Bear_OOP_test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void GrizzlySoundTest () {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        Bear grizzly = new GrizzlyBear();
        grizzly.performSound();
        assertEquals("Arrrr!\n" ,baos.toString());
        baos.reset();
    
    }
    @Test
    public void NorthBearEatTest() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        Bear north = new NorthBear();
        north.performEat();
        assertEquals("I love berries!\n" , baos.toString());
        baos.reset();
        
    
    }
    @Test
    public void TeddyBearTest() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        Bear teddy = new TeddyBear();
        teddy.performSound();
        assertEquals("I was made for loving you, babe!\n", baos.toString());
        baos.reset();
        
        teddy.setSoundBehavior(new SoundRoar());
        teddy.performSound();
        assertEquals("Arrrr!\n", baos.toString());
        baos.reset();
        
        teddy.performEat();
        assertEquals("I eat nothing!\n", baos.toString());
        baos.reset();
        
        teddy.setEatBehavior(new EatBerries());
        teddy.performEat();
        assertEquals("I love berries!\n" , baos.toString());
        baos.reset();   
     
    }
    
    @Test
    public void NorthBearSoundTest() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        Bear north = new NorthBear();
        north.performSound();
        assertEquals("Arrrr!\n" , baos.toString());
        baos.reset();
        
        
    
    }
    
}
