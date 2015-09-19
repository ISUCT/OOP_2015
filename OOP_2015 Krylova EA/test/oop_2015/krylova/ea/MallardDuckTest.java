/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_2015.krylova.ea;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud_17
 */
public class MallardDuckTest {
    
    public MallardDuckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of display method, of class MallardDuck.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        MallardDuck instance = new MallardDuck();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
