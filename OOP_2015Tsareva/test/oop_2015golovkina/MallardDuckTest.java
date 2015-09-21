/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_2015golovkina;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
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
     * Test of display method, of class MallardDuck.
     */
    @Test
    public void testMallardQuack() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        assertEquals("Quack!!!\r\n", baos.toString());
    }

    /**
     *
     */
    @Test
    public void testRedheadDuck() {
        Duck readhead = new RedheadDuck();
        readhead.performFly();
        assertEquals("I'm flying!!\r\n", baos.toString());
    }

    /**
     *
     */
    @Test
    public void testModelDuck() {
        Duck model = new ModelDuck();
        model.performQuack();
        assertEquals("Quack!!!\r\n", baos.toString());
    }
}
